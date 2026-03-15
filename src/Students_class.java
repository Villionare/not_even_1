public class Students_class {
    String name;  //this.name
    String Gender; //this.Gender
    int age; //this.age
    boolean isPass;

    Students_class(String name, String Gender, int age) {
        this.name = name;
        this.Gender = Gender;
        this.age = age;
        this.isPass = true;
    }

    void stud() {
        System.out.printf("student %s is studying and is %b\n", this.name, this.isPass);
    }
}
