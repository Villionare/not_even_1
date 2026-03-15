package Uni_AI;

import java.util.ArrayList;
import java.util.List;

/**
 * University.java
 * Represents the main university entity.
 * Demonstrates:
 * - Class & Object creation
 * - Encapsulation (private fields with public getters/setters)
 * - Constructor
 * - Aggregation (manages Department objects, which can exist independently)
 */

public class University {
    // Encapsulation: Private instance variables
    private String name;
    // Aggregation: Departments are part of a university, but they could exist
    // conceptually even if the university object is destroyed (e.g., merge with another university).
    private List<Department> departments;

    /**
     * Constructor: Parameterized constructor for University.
     * Demonstrates: Constructor usage and 'this' keyword.
     */
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>(); // Initialize the list for Aggregation
    }

    /**
     * Method to add a department to the university.
     * Demonstrates: Aggregation (adding an existing Department object).
     */
    public void addDepartment(Department department) {
        if (department != null && !departments.contains(department)) {
            departments.add(department);
            System.out.println("Added " + department.getName() + " to " + this.name);
        } else {
            System.out.println("Failed to add department (null or already exists).");
        }
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments); // Return a copy to prevent external modification
    }

    @Override
    public String toString() {
        return "University: " + name;
    }
}