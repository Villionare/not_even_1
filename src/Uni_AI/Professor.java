package Uni_AI;

/**
 * Professor.java
 * Represents a professor, a specialized type of faculty member.
 * Demonstrates:
 * - Multilevel Inheritance (extends Faculty, which extends Person)
 * - Encapsulation (private fields with public getters/setters)
 * - Polymorphism (Method Overriding for displayDetails)
 * - Constructor chaining (calls super() constructor)
 */
public class Professor extends Faculty {
    // Encapsulation: Private instance variable
    private String researchArea;

    /**
     * Constructor: Parameterized constructor for Professor.
     * Demonstrates:
     * - Constructor chaining: calls the superclass (Faculty) constructor using `super()`
     * - 'this' keyword for initializing own fields
     */
    public Professor(String name, int age, String contactEmail, double salary, String departmentName, String researchArea) {
        // Constructor Chaining: Calls the constructor of the superclass (Faculty)
        super(name, age, contactEmail, salary, departmentName);
        this.researchArea = researchArea;
    }

    /**
     * Polymorphism (Method Overriding): Overrides the displayDetails method from Faculty (and ultimately Person).
     * Provides a specific implementation for how a Professor displays their details, adding research area.
     */
    @Override
    public void displayDetails() {
        // Call the superclass method to get common faculty details
        super.displayDetails();
        // Add Professor-specific details
        System.out.println("Research Area: " + researchArea);
        System.out.println("-----------------------");
    }

    // Encapsulation: Getter and Setter for Professor-specific field
    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
}