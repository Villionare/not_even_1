package UniversityManagementSystem;

public abstract class Person {

    private String name;
    private int age;
    private String positionInUniversity;

    abstract void displayDetails();

    public void fun(){
        System.out.println("This is a Person Abstract Class");
    }

    public Person(String name, int age, String positionInUniversity) {
        this.name = name;
        this.age = age;
        this.positionInUniversity = positionInUniversity;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPositionInUniversity() {
        return positionInUniversity;
    }
}
