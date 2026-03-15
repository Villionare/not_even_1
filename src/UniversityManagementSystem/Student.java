package UniversityManagementSystem;

//whole student class is made and we can store values in them by constructor all the variables are private and can be
//accessed by only getter and setter functions

public class Student extends Person{

    //all instance variables declared private (encapsulation)

//    private   String name;
    private   String name;
    private long e_no;
    private int age;
    private   long m_no;
    private   String email;
    private   String f_name;
    private   String m_name;

    private Societies society;

    Student(String name, int age, long e_no, long m_no, String email, String f_name, String m_name){
        super(name, age, "Student");
        this.m_name = m_name;
        this.e_no = e_no;
        this.m_no = m_no;
        this.email =  email;
        this.f_name =  f_name;
    }

    //getter methods (encapsulation)

    public long getE_no() {
        return e_no;
    }

    public long getM_no() {
        return m_no;
    }

    public String getEmail() {
        return email;
    }

    public String getF_name() {
        return f_name;
    }

    public String getM_name() {
        return m_name;
    }

    void setName(String name){
        this.name = name;
    }

    public void setE_no(long e_no) {
        this.e_no = e_no;
    }

    public void setAge(int age) {
        if (age < 18){
            System.out.println("you are below 18, you are not related to the university");
        } else {
            this.age = age;
        }
    }

    public void setM_no(long m_no) {
        this.m_no = m_no;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void displayDetails(){
        System.out.println(this.name + this.age);
    }
}
