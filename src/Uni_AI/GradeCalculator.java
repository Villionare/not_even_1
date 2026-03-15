package Uni_AI;

import java.util.List;
import java.util.Map;

/**
 * GradeCalculator.java
 * A utility class to calculate GPA.
 * Demonstrates:
 * - Class & Object creation
 * - Dependency (used by Student, but Student doesn't 'have' it permanently)
 * - Encapsulation (though simple here, typical for utility classes)
 */
public class GradeCalculator {

    /**
     * Calculates GPA based on enrolled courses and a map of grades.
     * This method is called by the Student class, showing a dependency.
     *
     * @param courses The list of courses the student is enrolled in.
     * @param grades  A map where key is course code and value is grade (e.g., 4.0 for A, 3.0 for B).
     * @return The calculated GPA.
     */
    public double calculateGPA(List<Course> courses, Map<String, Double> grades) {
        if (courses == null || courses.isEmpty() || grades == null || grades.isEmpty()) {
            System.out.println("No courses or grades provided for GPA calculation.");
            return 0.0;
        }

        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (Course course : courses) {
            String courseCode = course.getCourseCode();
            if (grades.containsKey(courseCode)) {
                double grade = grades.get(courseCode);
                int credits = course.getCredits();
                totalGradePoints += (grade * credits);
                totalCredits += credits;
            } else {
                System.out.println("Warning: Grade not found for course: " + course.getTitle());
            }
        }

        if (totalCredits == 0) {
            return 0.0;
        }
        return totalGradePoints / totalCredits;
    }
}
