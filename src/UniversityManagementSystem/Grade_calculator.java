package UniversityManagementSystem;

public class Grade_calculator {

    public static String calculateLetterGrade(double score) {
        // Validate the input score to ensure it's within a reasonable range
        if (score < 0 || score > 100) {
            // In a real application, you might throw an IllegalArgumentException
            // or return a specific error string like "Invalid Score".
            // For this example, we'll return "N/A" for simplicity.
            System.err.println("Error: Score must be between 0 and 100. Received: " + score);
            return "N/A";
        }

        // Determine the letter grade based on the score
        if (score >= 90) {
            return "A";
        } else if (score >= 85) {
            return "B+";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 75) {
            return "C+";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
