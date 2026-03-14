package series;

//stack program of java

public class Demo {

    static int studentCount = 0;

    String name, Standard;

    Demo(String name, String standard) {

        studentCount++;
        this.name = name;
        this.Standard = standard;
    }

    static void main() {

        Demo student1 = new Demo("ashwin", "IX");
        Demo student2 = new Demo("doby", "IX");
        Demo student3 = new Demo("dipanshi", "IX");

        System.out.println("No of students created: " + Demo.studentCount);
    }
}