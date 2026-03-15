package Uni_AI;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * UniversityManagementApp.java
 * The main application class to demonstrate all OOP concepts.
 * This class primarily showcases how the other classes interact.
 */
public class UniversityManagementApp {

    public static void main(String[] args) {

        // --- 1. Class & Object Creation ---
        // Creating an instance of the University class
        University myUniversity = new University("State University of Tech");
        System.out.println("Created " + myUniversity.getName());
        UniversityUtils.printSeparator(); // Static method usage

        // --- 9. Static Keyword (cont.) ---
        // ID generation for Person objects happens automatically via the static counter in Person's constructor.
        // We'll see this as we create Person subclasses.

        // --- 2. Encapsulation & 7. Constructors ---
        // Creating Address objects
        Address studentAddress1 = new Address("123 Main St", "Anytown", "CA", "90210");
        Address studentAddress2 = new Address("456 Oak Ave", "Otherville", "NY", "10001");
        Address facultyAddress = new Address("789 Pine Ln", "College Town", "TX", "77001");
        // No-arg constructor for Address (demonstrates 'this()' chaining internally)
        Address defaultAddress = new Address();
        System.out.println("Student Address 1: " + studentAddress1);
        System.out.println("Default Address: " + defaultAddress);
        UniversityUtils.printSeparator();

        // --- 3. Abstraction (Abstract Class - Person) & 5. Inheritance (Hierarchical, Single) ---
        // Creating Student, Faculty, Professor objects (subclasses of Person)
        Student student1 = new Student("Alice Smith", 20, "alice.s@univ.edu", studentAddress1, "Computer Science");
        Student student2 = new Student("Bob Johnson", 22, "bob.j@univ.edu", studentAddress2, "Physics");

        Faculty faculty1 = new Faculty("Dr. Carol White", 45, "carol.w@univ.edu", 90000.00, "Computer Science");
        // --- 5. Multilevel Inheritance: Professor extends Faculty extends Person ---
        Professor prof1 = new Professor("Dr. David Lee", 55, "david.l@univ.edu", 120000.00, "Computer Science", "Artificial Intelligence");
        Professor prof2 = new Professor("Dr. Emily Brown", 60, "emily.b@univ.edu", 110000.00, "Physics", "Quantum Computing");

        System.out.println("Initial Person IDs (static counter check):");
        System.out.println(student1.getName() + " " + student1.getId());
        System.out.println(faculty1.getName() + " " + faculty1.getId());
        System.out.println(prof1.getName() + " " + prof1.getId());
        System.out.println(prof2.getName() + " " + prof2.getId());
        UniversityUtils.printSeparator();

        // --- 10. Access Modifiers ---
        // Accessing public methods (getters)
        System.out.println(student1.getName() + "'s Email: " + student1.getContactEmail());
        // Accessing protected method (via subclass instance)
        System.out.println(faculty1.getName() + "'s Formatted ID: " + faculty1.getFormattedId());
        UniversityUtils.printSeparator();

        // --- 2. Encapsulation (Validation in Setters) ---
        System.out.println("Attempting to set invalid age for " + student1.getName());
        student1.setAge(-5); // This will print a warning
        System.out.println("Current age for " + student1.getName() + ": " + student1.getAge());
        System.out.println("Attempting to set valid salary for " + faculty1.getName());
        faculty1.setSalary(95000.00);
        System.out.println("New salary for " + faculty1.getName() + ": $" + faculty1.getSalary());
        UniversityUtils.printSeparator();

        // --- 11. Relationships (Aggregation: University-Department) ---
        Department csDept = new Department("Computer Science", "Dr. Alan Turing");
        Department physicsDept = new Department("Physics", "Dr. Marie Curie");

        myUniversity.addDepartment(csDept);
        myUniversity.addDepartment(physicsDept);
        System.out.println(myUniversity.getName() + " now has " + myUniversity.getDepartments().size() + " departments.");
        UniversityUtils.printSeparator();

        // --- 11. Relationships (Composition: Department-Course) ---
        Course javaCourse = new Course("CS101", "Introduction to Java", 3);
        Course dataStructures = new Course("CS201", "Data Structures", 4);
        Course quantumPhysics = new Course("PHY301", "Quantum Physics", 4);
        Course mechanics = new Course("PHY101", "Classical Mechanics", -3); // Credits validation
        System.out.println("Credits for " + mechanics.getTitle() + ": " + mechanics.getCredits()); // Should be 1 due to validation

        csDept.addCourse(javaCourse);
        csDept.addCourse(dataStructures);
        physicsDept.addCourse(quantumPhysics);
        physicsDept.addCourse(mechanics);
        System.out.println(csDept.getName() + " has " + csDept.getCourses().size() + " courses.");
        System.out.println(physicsDept.getName() + " has " + physicsDept.getCourses().size() + " courses.");
        UniversityUtils.printSeparator();

        // --- 4. Abstraction (Interfaces: Enrollable & Payable) ---
        // --- 6. Polymorphism (Method Overriding) ---
        // Demonstrating displayDetails (Runtime Polymorphism)
        List<Person> universityMembers = new ArrayList<>();
        universityMembers.add(student1);
        universityMembers.add(faculty1);
        universityMembers.add(prof1);
        universityMembers.add(student2);
        universityMembers.add(prof2);

        System.out.println("--- Displaying all University Members (Polymorphic Call) ---");
        for (Person member : universityMembers) {
            member.displayDetails(); // Calls the overridden displayDetails method based on actual object type
        }
        UniversityUtils.printSeparator();

        // --- 4. Abstraction (Interface Implementation - Enrollable) ---
        // --- 11. Relationships (Association & Aggregation implicitly managed by enrollments) ---
        System.out.println("\n--- Student Enrollment ---");
        student1.enrollInCourse(javaCourse); // Calls student1's enrollInCourse (from Enrollable)
        student1.enrollInCourse(dataStructures);
        student1.enrollInCourse(javaCourse); // Try to enroll again (should fail gracefully)
        student2.enrollInCourse(quantumPhysics);
        student2.enrollInCourse(javaCourse);

        // --- 6. Polymorphism (Method Overloading - Course.addStudent) ---
        System.out.println("\n--- Course.addStudent Overloading Demo ---");
        javaCourse.addStudent(student1); // Calls addStudent(Student)
        javaCourse.addStudent("S" + Person.nextId.get() + 100); // Calls addStudent(String) - simplified
        UniversityUtils.printSeparator();

        // --- 4. Abstraction (Interface Implementation - Payable) ---
        System.out.println("\n--- Salary Calculation (Payable Interface) ---");
        System.out.println(faculty1.getName() + "'s calculated salary: $" + String.format("%.2f", faculty1.calculateSalary()));
        System.out.println(prof1.getName() + "'s calculated salary: $" + String.format("%.2f", prof1.calculateSalary()));
        UniversityUtils.printSeparator();

        // --- 6. Polymorphism (Method Overloading - Faculty.assignCourse) ---
        System.out.println("\n--- Faculty.assignCourse Overloading Demo ---");
        faculty1.assignCourse(javaCourse); // Calls assignCourse(Course)
        faculty1.assignCourse(dataStructures, "Lead Instructor"); // Calls assignCourse(Course, String)
        prof1.assignCourse(javaCourse); // Prof also uses this inherited overloaded method
        prof2.assignCourse(quantumPhysics, "Co-Instructor");
        UniversityUtils.printSeparator();

        // --- 11. Relationships (Dependency: Student-GradeCalculator) ---
        System.out.println("\n--- Student GPA Calculation (Dependency Demo) ---");
        GradeCalculator gpaCalculator = new GradeCalculator(); // Create a GradeCalculator object
        Map<String, Double> student1Grades = new HashMap<>();
        student1Grades.put("CS101", 3.5); // A-
        student1Grades.put("CS201", 4.0); // A
        student1Grades.put("PHY301", 2.0); // C (for student2 to demonstrate it's not present for student1)

        double gpaStudent1 = student1.calculateGPA(gpaCalculator, student1Grades); // Dependency: student1 uses gpaCalculator
        System.out.println(student1.getName() + "'s GPA: " + String.format("%.2f", gpaStudent1));

        Map<String, Double> student2Grades = new HashMap<>();
        student2Grades.put("PHY301", 3.8); // B+
        student2Grades.put("CS101", 3.0); // B
        double gpaStudent2 = student2.calculateGPA(gpaCalculator, student2Grades);
        System.out.println(student2.getName() + "'s GPA: " + String.format("%.2f", gpaStudent2));
        UniversityUtils.printSeparator();

        // --- Final Display of Some Details to Show State Changes ---
        student1.displayDetails();
        faculty1.displayDetails();
        prof1.displayDetails();
        prof2.displayDetails();
    }
}