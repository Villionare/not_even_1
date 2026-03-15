package Uni_AI;

/**
 * Enrollable.java
 * An interface defining a contract for entities that can enroll in courses.
 * Demonstrates: Abstraction (via Interface).
 */
public interface Enrollable {
    /**
     * Abstract method. Any class implementing this interface must provide an
     * implementation for enrolling in a course.
     *
     * @param course The course to enroll in.
     * @return true if enrollment is successful, false otherwise.
     */
    boolean enrollInCourse(Course course);
}