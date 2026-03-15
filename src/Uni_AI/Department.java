package Uni_AI;

import java.util.ArrayList;
import java.util.List;

/**
 * Department.java
 * Represents a department within the university.
 * Demonstrates:
 * - Class & Object creation
 * - Encapsulation (private fields with public getters/setters)
 * - Constructor
 * - Composition (manages Course objects, which are conceptually part of the Department's lifecycle)
 * - Aggregation (manages Faculty objects, which can exist independently)
 */
public class Department {
    // Encapsulation: Private instance variables
    private String name;
    private String headOfDepartment;
    // Composition: Courses are strongly tied to a department. If the department is removed,
    // its courses are also considered removed from the university context.
    private List<Course> courses;
    // Aggregation: Faculty members are associated with a department, but can exist
    // independently (e.g., be transferred to another department, or leave the university).
    private List<Faculty> facultyMembers;

    /**
     * Constructor: Parameterized constructor for Department.
     * Demonstrates: Constructor usage and 'this' keyword.
     */
    public Department(String name, String headOfDepartment) {
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.courses = new ArrayList<>(); // Initialize lists for Composition and Aggregation
        this.facultyMembers = new ArrayList<>();
    }

    // Methods to manage Courses (Composition)
    public void addCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            System.out.println("Added course '" + course.getTitle() + "' to " + name + " department.");
        } else {
            System.out.println("Failed to add course (null or already exists).");
        }
    }

    public void removeCourse(Course course) {
        if (course != null && courses.remove(course)) {
            System.out.println("Removed course '" + course.getTitle() + "' from " + name + " department.");
        } else {
            System.out.println("Course '" + (course != null ? course.getTitle() : "null") + "' not found in " + name + " department.");
        }
    }

    // Methods to manage Faculty (Aggregation)
    public void addFaculty(Faculty faculty) {
        if (faculty != null && !facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
            System.out.println("Added faculty member '" + faculty.getName() + "' to " + name + " department.");
        } else {
            System.out.println("Failed to add faculty (null or already exists).");
        }
    }

    public void removeFaculty(Faculty faculty) {
        if (faculty != null && facultyMembers.remove(faculty)) {
            System.out.println("Removed faculty member '" + faculty.getName() + "' from " + name + " department.");
        } else {
            System.out.println("Faculty member '" + (faculty != null ? faculty.getName() : "null") + "' not found in " + name + " department.");
        }
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); // Return a copy to prevent external modification
    }

    public List<Faculty> getFacultyMembers() {
        return new ArrayList<>(facultyMembers); // Return a copy to prevent external modification
    }

    @Override
    public String toString() {
        return name + " Department (HOD: " + headOfDepartment + ")";
    }
}
