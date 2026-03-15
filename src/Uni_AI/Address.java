package Uni_AI;

/**
 * Address.java
 * Represents an address.
 * Demonstrates:
 * - Class & Object creation
 * - Encapsulation (private fields with public getters/setters)
 * - Constructors (parameterized and no-argument)
 * - 'this' keyword (for constructor chaining)
 */
public class Address {
    // Encapsulation: Private instance variables
    private String street;
    private String city;
    private String state;
    private String zipCode;

    /**
     * Constructor: Parameterized constructor.
     * Demonstrates:
     * - Constructor usage
     * - 'this' keyword to refer to current object's fields
     */
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Constructor: No-argument constructor.
     * Demonstrates:
     * - Constructor Overloading (multiple constructors)
     * - 'this()' keyword for constructor chaining (calls the parameterized constructor with default values)
     */
    public Address() {
        // Calls the parameterized constructor to initialize with default values
        this("N/A", "N/A", "N/A", "N/A");
    }

    // Encapsulation: Getters and Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
