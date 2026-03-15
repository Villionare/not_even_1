package Uni_AI;

import java.util.ArrayList;
import java.util.List;

/**
 * Student.java
 * Represents a student in the university system.
 * Demonstrates:
 * - Inheritance (extends Person)
 * - Encapsulation (private fields with public getters/setters)
 * - Polymorphism (Method Overriding for displayDetails)
 * - Abstraction (implements Enrollable interface)
 * - Constructor chaining (calls super() constructor)
 * - Association (has an Address object)
 * - Dependency (uses GradeCalculator in calculateGPA method)
 */
public class Student extends Person implements Enrollable {
    // Encapsulation: Private instance variables
    // Association: Student has an Address object. Address can exist independently.
    private Address address;
    private List<Course> enrolledCourses;
    private String major;

    /**
     * Constructor: Parameterized constructor for Student.
     * Demonstrates:
     * - Constructor chaining: calls the superclass (Person) constructor using `super()`
     * - 'this' keyword for initializing own fields
     * - Association: initializes the Address object
     */
    public Student(String name, int age, String contactEmail, Address address, String major) {
        // Constructor Chaining: Calls the constructor of the superclass (Person)
        super(name, age, contactEmail);
        this.address = address; // Initialize the associated Address object
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
    }

    /**
     * Polymorphism (Method Overriding): Implements the abstract method from Person.
     * Provides a specific implementation for how a Student displays their details.
     */
    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + getName()); // Accessing inherited getter
        System.out.println(getFormattedId());     // Accessing inherited protected method
        System.out.println("Age: " + getAge());   // Accessing inherited getter
        System.out.println(getContactInfo());     // Accessing inherited concrete method
        System.out.println("Major: " + major);
        if (address != null) {
            System.out.println("Address: " + address.toString()); // Using associated Address
        }
        System.out.println("Enrolled Courses (" + enrolledCourses.size() + "):");
        if (enrolledCourses.isEmpty()) {
            System.out.println("  No courses enrolled yet.");
        } else {
            for (Course course : enrolledCourses) {
                System.out.println("  - " + course.getTitle() + " (" + course.getCourseCode() + ")");
            }
        }
        System.out.println("-----------------------");
    }

    /**
     * Abstraction (Interface Implementation): Implements the Enrollable interface method.
     * Demonstrates the student's ability to enroll in a course.
     */
    @Override
    public boolean enrollInCourse(Course course) {
        if (course != null && !enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // Also add student to the course's internal list
            System.out.println(getName() + " successfully enrolled in " + course.getTitle());
            return true;
        } else {
            System.out.println(getName() + " could not enroll in " + (course != null ? course.getTitle() : "null course") + " (already enrolled or course is null).");
            return false;
        }
    }

    /**
     * Dependency: The calculateGPA method depends on a GradeCalculator object
     * passed as a parameter. The Student doesn't "have" a GradeCalculator permanently;
     * it "uses" it temporarily for a specific operation.
     */
    public double calculateGPA(GradeCalculator calculator, java.util.Map<String, Double> grades) {
        if (calculator != null) {
            System.out.println(getName() + " is calculating GPA...");
            return calculator.calculateGPA(enrolledCourses, grades);
        } else {
            System.out.println("Cannot calculate GPA: GradeCalculator not provided.");
            return 0.0;
        }
    }

    // Encapsulation: Getters and Setters for Student-specific fields
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses); // Return a copy to prevent external modification
    }
}