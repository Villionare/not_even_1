package UniversityManagementSystem;

import java.util.Scanner;

public class University {
    static Scanner scanner = new Scanner(System.in);
    Student student;
    Person person;

    protected  void enterStudent(){
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Student age:");
        int age = scanner.nextInt();
        System.out.println("Enter Student Enrollment no:");
        int e_no = scanner.nextInt();
        System.out.println("Enter Student Mobile no:");
        int m_no = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Student E-mail:");
        String email = scanner.nextLine();
        System.out.println("Enter Student Mothers name:");
        String m_name = scanner.nextLine();
        System.out.println("Enter Student Fathers name:");
        String f_name = scanner.nextLine();

        student = new Student(name,age,e_no,m_no,email,f_name,m_name);
    }

    protected  void enterFaculty(){
        
    }

    protected  void enterStaff(){
        
    }

    protected  void enterProfessor(){
        
    }
    protected  void showStudents(){
        System.out.println("so the students are:\n " + person.getName() + " "+ person.getAge()+" "+person.getPositionInUniversity()+" "+student.getE_no()+" "+student.getEmail()+" "+student.getF_name()+" "+student.getM_name());
    }
    protected  void showProfessors(){
        
    }
    protected  void showStaff(){
        
    }

    protected  void showFaculty(){
        
    }
}
