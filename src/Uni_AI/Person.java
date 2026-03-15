package Uni_AI;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Person.java
 * This abstract class serves as the base for all people in the university system.
 * It demonstrates:
 * - Abstraction (via abstract class and method)
 * - Encapsulation (private fields with public getters/setters)
 * - Static Keyword (for unique ID generation)
 * - Constructor (to initialize fields)
 * - Access Modifiers (private, protected, public)
 */
public abstract class Person {
    // Encapsulation: Private instance variables to hide data
    private String name;
    private String id;
    private int age;
    private String contactEmail;

    // Static Keyword: A static variable shared by all instances of Person and its subclasses.
    // It's used to generate unique IDs. AtomicInteger for thread-safe increment, though simple int would suffice for this example.
    protected static final AtomicInteger nextId = new AtomicInteger(1000);

    /**
     * Constructor: Parameterized constructor to initialize a Person object.
     * Demonstrates:
     * - Constructor usage
     * - 'this' keyword to differentiate instance variables from parameters
     * - Static variable usage (nextId) for ID generation
     * - Encapsulation (initializes private fields)
     */
    public Person(String name, int age, String contactEmail) {
        this.name = name; // 'this' refers to the current object's 'name'
        // Generating a unique ID using the static counter
        this.id = "P" + nextId.getAndIncrement();
        // Encapsulation with basic validation in constructor
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Warning: Age cannot be negative for " + name + ". Setting to 0.");
            this.age = 0;
        }
        this.contactEmail = contactEmail;
    }

    // Abstraction: An abstract method that must be implemented by concrete subclasses.
    // It defines "what" a Person can do (display details) without defining "how".
    public abstract void displayDetails();

    /**
     * Concrete public method.
     * Demonstrates: Encapsulation (accessing private fields through a public method).
     */
    public String getContactInfo() {
        return "Email: " + this.contactEmail;
    }

    /**
     * Protected method: Accessible within the same package and by subclasses.
     * Demonstrates: Access Modifier `protected`.
     * Used by subclasses to format their ID.
     */
    protected String getFormattedId() {
        return "ID: " + this.id;
    }

    // Encapsulation: Public getter methods to access private data
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    // Encapsulation: Public setter methods to modify private data
    public void setName(String name) {
        this.name = name;
    }

    // Encapsulation: Setter with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Warning: Age cannot be negative. Value not set.");
        }
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}