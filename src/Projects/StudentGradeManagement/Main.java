package Projects.StudentGradeManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void main() {


        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();

        System.out.println("Welcome to student Grade Management");
        System.out.println("Here are the available options:");

        //READING FROM CSV
        readFromCSV(student);

        while (loop) {

            System.out.println("""
                    Select appropriate options from below
                    1 - Add a Student
                    2 - Display All report cards
                    3 - Find and display the topper
                    4 - Search by Roll Number
                    5 - Close
                    """);

            var input = Integer.parseInt(scanner.nextLine());

            if (input >= 1 && input <= Actions.values().length) {
                Actions action = Actions.values()[input - 1];

                switch (action) {
                    case Actions.ADD_STUDENT -> addStudent(student, scanner);
                    case Actions.DISPLAY_REPORT_CARDS -> displayReportCards(student);
                    case Actions.SHOW_TOPPER -> showTopper(student);
                    case Actions.SEARCH_BY_ROLL -> searchByRollNo(student, scanner);
                    case Actions.CLOSE -> loop = false;
                }

            } else {
                System.out.println("Enter values between 1 to 4 only");
            }

        }
        scanner.close();
    }

    static void addStudent(ArrayList<Student> student, Scanner scanner) {

        while (true) {

            System.out.println("Student Name");
            String name = scanner.nextLine();

            Student addingOne = new Student(name);

            System.out.println("Now add marks per subject: ");

            String res = addingOne.fillMarks(scanner);
            System.out.println(res);


            System.out.println("Confirm to add student? \npress any key to submit done \n 0 - refill details");
            int final_res = Integer.parseInt(scanner.nextLine());

            if (final_res == 0) {
                continue;
            }

            student.add(addingOne);
            System.out.printf("Student %s of roll no: %s has been added successfully\n", addingOne.getName(), addingOne.getRoll_no());
            break;

        }
    }

    static void displayReportCards(ArrayList<Student> student) {
        System.out.println("Displaying the report cards of " + student.toArray().length + "students");

        for (Student unit : student) {
            System.out.println("Student Roll no: " + unit.getRoll_no());
            System.out.println("Student name: " + unit.getName());

            System.out.println("Student Marks per subject:");
            unit.getMarks();

            System.out.printf("Student Percentage: %.2f", unit.getPercentage());
            System.out.println("Student Grade: " + unit.getGrade());
        }
    }

    static void showTopper(ArrayList<Student> student) {

        Student topper = null;
        double max = 0;
        for (Student one : student) {
            System.out.println("Student " + one.getName() + " has " + one.getPercentage());
            if (one.getPercentage() >= max) {
                max = one.getPercentage();
                topper = one;
            }
        }

        if (topper != null) {
            System.out.println("SO THE TOPPER OF THIS YEAR IS");
            System.out.println(topper.getRoll_no() + " " + topper.getName() + " " + topper.getPercentage());

        }
    }

    static void searchByRollNo(ArrayList<Student> student, Scanner scanner) {
        System.out.println("Enter the roll no that you wanna search the press enter");
        var query = Integer.parseInt(scanner.nextLine());

        for (Student stu : student) {
            if (stu.getRoll_no() == query) {
                System.out.println("Found:");
                System.out.println("Roll No: " + stu.getRoll_no());
                System.out.println("Name : " + stu.getName());
                System.out.println("Grade: " + stu.getGrade());
                System.out.printf("Percentage: %.2f\n", stu.getPercentage());
            }
        }
    }

    static void readFromCSV(ArrayList<Student> student) {

        String filePath = "/home/duedull/IdeaProjects/not_even_1/src/Projects/StudentGradeManagement/sudents.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            String line;

            //this skips the first heading line in csv file
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int Roll_no = Integer.parseInt(data[1]);
                double percentage = Double.parseDouble(data[2]);

                int[] marks = new int[5];
                marks[0] = Integer.parseInt(data[3]); // English
                marks[1] = Integer.parseInt(data[4]); // Hindi
                marks[2] = Integer.parseInt(data[5]); // Maths
                marks[3] = Integer.parseInt(data[6]); // SST
                marks[4] = Integer.parseInt(data[7]); // Science

                Student addOne = new Student(name);
                addOne.setPercentageFromCSV(percentage);
                addOne.setRoll_noFromCSV(Roll_no);
                addOne.fillMarksFromCSV(marks);

                student.add(addOne);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
