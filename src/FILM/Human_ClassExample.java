package FILM;

public class Human_ClassExample {
    static {
        System.out.println("matter");
    }

    private String ID;
    private String name;
    private String gender;
    private int age;
    private double height;
    private boolean married;

    public Human_ClassExample(String ID, String name, String gender, int age, double height, boolean married) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String displayUserID() {
        return "So the Person is " + name + "(" + gender + "), ID: " + ID + " and he is " + age + " years old and also he is " + (married ? "Married" : "Unmarried") + ".";
    }

    public void checkCondition() {
        System.out.println("ALIVE!");
        System.console();
    }
}
