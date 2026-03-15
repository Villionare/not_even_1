package Uni_AI;

/**
 * UniversityUtils.java
 * A utility class containing static helper methods for the university system.
 * Demonstrates:
 * - Static Keyword (static methods accessible directly via class name)
 */
public class UniversityUtils {

    /**
     * Static method: Prints a separator line to the console.
     * Demonstrates: Using a static method for a common utility task.
     * Accessible directly via `UniversityUtils.printSeparator()`.
     */
    public static void printSeparator() {
        System.out.println("\n============================================\n");
    }

    /**
     * Static method: Formats an ID with a given prefix.
     * Demonstrates: Using a static method for a stateless utility operation.
     */
    public static String formatId(String prefix, int id) {
        return prefix + String.format("%04d", id); // Example: P0001
    }
}