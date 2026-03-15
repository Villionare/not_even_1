package Uni_AI;

/**
 * Payable.java
 * An interface defining a contract for entities that can receive a salary.
 * Demonstrates: Abstraction (via Interface).
 */
public interface Payable {
    /**
     * Abstract method. Any class implementing this interface must provide an
     * implementation for calculating its salary.
     *
     * @return The calculated salary.
     */
    double calculateSalary();
}