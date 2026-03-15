    package UniversityManagementSystem;

    import java.util.Scanner;
    import static UniversityManagementSystem.University.*;

    public class Main {

    public static void main(String[] args) {
        boolean status = false;
        University university = new University();
        Scanner scanner = new Scanner(System.in);
        University uni = new University();
        System.out.println("Welcome to the Hogwarts!!!");

       while (!status){
           System.out.println("Please choose any of the action to perform\n1 - Enter a new Student Record\n2 - Enter a new Faculty Record\n3 - Enter a new Staff Record\n4- Enter a new Professor Record\n5 - Show the List of Students\n6 - Show the List of all the Professors\n7 - Show the List of all the Staffs\n8 - Show the List of all the faculty\n 9 - Exit");
           int option = scanner.nextInt();

           switch (option){
               case 1 -> university.enterStudent();
               case 2 -> university.enterFaculty();
               case 3 -> university.enterStaff();
               case 4 -> university.enterProfessor();
               case 5 -> university.showStudents();
               case 6 -> university.showProfessors();
               case 7 -> university.showStaff();
               case 8 -> university.showFaculty();
               case 9 -> status = true;
               default -> System.out.println("you have entered a wrong option!");
           }
       }
    }
}
