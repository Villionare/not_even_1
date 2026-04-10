package Projects.Beginner.StudentGradeManagement;

import java.util.Scanner;

public class Student {
    static int Counter = 0;
    private String name;
    private int roll_no;
    private double percentage;
    private int[] marks = new int[5];

    public Student(String name) {
        roll_no = ++Counter;
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    protected void calculatePercentage() {
        double temp = 0;
        for (int marks : marks) {
            temp += marks;
        }

        percentage = (temp / 500) * 100;
    }

    public String fillMarks(Scanner scanner) {

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks in ");
            if (i == 0) {
                System.out.println("English");
                marks[i] = Integer.parseInt(scanner.nextLine());
            } else if (i == 1) {
                System.out.println("Hindi");
                marks[i] = Integer.parseInt(scanner.nextLine());
            } else if (i == 2) {
                System.out.println("Maths");
                marks[i] = Integer.parseInt(scanner.nextLine());
            } else if (i == 3) {
                System.out.println("Social Science");
                marks[i] = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Science");
                marks[i] = Integer.parseInt(scanner.nextLine());
            }
        }

        calculatePercentage();
        return "Marks has been added successfully";
    }

    public void getMarks() {
        System.out.println("So the marks of " + name + " " + roll_no + " are:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks in ");
            if (i == 0) {
                System.out.println("English: " + marks[i]);
            } else if (i == 1) {
                System.out.println("Hindi: " + marks[i]);
            } else if (i == 2) {
                System.out.println("Maths: " + marks[i]);
            } else if (i == 3) {
                System.out.println("Social Science: " + marks[i]);
            } else {
                System.out.println("Science: " + marks[i]);
            }
            System.out.println("-----------------------------------------------");
        }
    }

    protected char getGrade() {

        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void fillMarksFromCSV(int[] data) {
        marks = data;
    }

    public void setRoll_noFromCSV(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setPercentageFromCSV(double percentage) {
        this.percentage = percentage;
    }
}
