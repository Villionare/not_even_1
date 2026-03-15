package Uni_AI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Faculty.java
 * Represents a faculty member in the university system.
 * Demonstrates:
 * - Inheritance (extends Person) - Hierarchical Inheritance from Person.
 * - Encapsulation (private fields with public getters/setters)
 * - Polymorphism (Method Overriding for displayDetails)
 * - Abstraction (implements Payable interface)
 * - Constructor chaining (calls super() constructor)
 * - Polymorphism (Method Overloading for assignCourse)
 */
public class Faculty extends Person implements Payable {
    // Encapsulation: Private instance variables
    private double salary;
    private String departmentName;
    private List<Course> assignedCourses;

    /**
     * Constructor: Parameterized constructor for Faculty.
     * Demonstrates:
     * - Constructor chaining: calls the superclass (Person) constructor using `super()`
     * - 'this' keyword for initializing own fields
     */
    public Faculty(String name, int age, String contactEmail, double salary, String departmentName) {
        // Constructor Chaining: Calls the constructor of the superclass (Person)
        super(name, age, contactEmail);
        // Encapsulation with validation
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Warning: Salary cannot be negative for " + name + ". Setting to 0.");
            this.salary = 0;
        }
        this.departmentName = departmentName;
        this.assignedCourses = new ArrayList<>();
    }

    /**
     * Polymorphism (Method Overriding): Implements the abstract method from Person.
     * Provides a specific implementation for how a Faculty member displays their details.
     */
    @Override
    public void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        System.out.println("Name: " + getName()); // Accessing inherited getter
        System.out.println(getFormattedId());     // Accessing inherited protected method
        System.out.println("Age: " + getAge());   // Accessing inherited getter
        System.out.println(getContactInfo());     // Accessing inherited concrete method
        System.out.println("Department: " + departmentName);
        System.out.println("Salary: $" + String.format("%.2f", calculateSalary())); // Uses overridden method from Payable
        System.out.println("Assigned Courses (" + assignedCourses.size() + "):");
        if (assignedCourses.isEmpty()) {
            System.out.println("  No courses assigned yet.");
        } else {
            for (Course course : assignedCourses) {
                System.out.println("  - " + course.getTitle() + " (" + course.getCourseCode() + ")");
            }
        }
        System.out.println("-----------------------");
    }

    /**
     * Abstraction (Interface Implementation): Implements the Payable interface method.
     * Provides a specific implementation for how a Faculty member's salary is calculated.
     */
    @Override
    public double calculateSalary() {
        // Simplified calculation for demonstration
        return this.salary;
    }

    /**
     * Polymorphism (Method Overloading): assignCourse(Course course)
     * Assigns a course to the faculty member.
     */
    public void assignCourse(Course course) {
        if (course != null && !assignedCourses.contains(course)) {
            assignedCourses.add(course);
            System.out.println(getName() + " assigned to teach " + course.getTitle());
        } else {
            System.out.println(getName() + " could not be assigned to " + (course != null ? course.getTitle() : "null course") + " (already assigned or course is null).");
        }
    }

    /**
     * Polymorphism (Method Overloading): assignCourse(Course course, String role)
     * Assigns a course with a specific role.
     */
    public void assignCourse(Course course, String role) {
        if (course != null && !assignedCourses.contains(course)) {
            assignedCourses.add(course);
            System.out.println(getName() + " assigned to teach " + course.getTitle() + " as " + role);
        } else {
            System.out.println(getName() + " could not be assigned to " + (course != null ? course.getTitle() : "null course") + " (already assigned or course is null).");
        }
    }

    // Encapsulation: Getters and Setters for Faculty-specific fields
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Warning: Salary cannot be negative. Value not set.");
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Course> getAssignedCourses() {
        return new ArrayList<>(assignedCourses); // Return a copy
    }
}
