package Uni_AI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects; // For Objects.equals in overloaded method

/**
 * Course.java
 * Represents a university course.
 * Demonstrates:
 * - Class & Object creation
 * - Encapsulation (private fields with public getters/setters)
 * - Constructor (parameterized)
 * - Polymorphism (Method Overloading for addStudent)
 * - Composition (manages a list of enrolled Students, conceptually owned by the course's lifecycle within a department)
 */
public class Course {
    // Encapsulation: Private instance variables
    private String courseCode;
    private String title;
    private int credits;
    // Composition: A Course manages its enrolled Students.
    // If the course ceases to exist, these enrollments cease to matter for *this* course instance.
    private List<Student> enrolledStudents;

    /**
     * Constructor: Parameterized constructor for Course.
     * Demonstrates:
     * - Constructor usage
     * - 'this' keyword
     * - Encapsulation (initializes private fields)
     */
    public Course(String courseCode, String title, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        // Encapsulation with validation
        if (credits > 0) {
            this.credits = credits;
        } else {
            System.out.println("Warning: Course credits must be positive. Setting to 1 for " + title);
            this.credits = 1;
        }
        this.enrolledStudents = new ArrayList<>(); // Initialize the list for composition
    }

    /**
     * Polymorphism (Method Overloading): addStudent(Student student)
     * Adds a student to the course's enrolled students list.
     */
    public void addStudent(Student student) {
        if (student != null && !enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " enrolled in " + title);
        } else {
            System.out.println("Failed to enroll student in " + title + ": Student is null or already enrolled.");
        }
    }

    /**
     * Polymorphism (Method Overloading): addStudent(String studentId)
     * Adds a student by ID. This is a simplified version for demonstration;
     * in a real system, you'd look up the student object by ID.
     */
    public void addStudent(String studentId) {
        // For demonstration, we'll just acknowledge the ID.
        // In a real system, you'd search for a Student object with this ID and then add it.
        System.out.println("Attempted to enroll student with ID " + studentId + " in " + title + " (simplified).");
        // Example: if we had a way to find a student by ID:
        // Student foundStudent = UniversityApp.findStudentById(studentId);
        // if (foundStudent != null) {
        //     addStudent(foundStudent); // Call the other overloaded method
        // } else {
        //     System.out.println("Student with ID " + studentId + " not found.");
        // }
    }


    // Encapsulation: Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    // Encapsulation: Setter with validation
    public void setCredits(int credits) {
        if (credits > 0) {
            this.credits = credits;
        } else {
            System.out.println("Warning: Course credits must be positive. Value not set.");
        }
    }

    public List<Student> getEnrolledStudents() {
        // Returning a new ArrayList to prevent external modification of the internal list directly
        return new ArrayList<>(enrolledStudents);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseCode, course.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode);
    }

    @Override
    public String toString() {
        return title + " (" + courseCode + ")";
    }
}
