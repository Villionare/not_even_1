package Aggregation;

public class People {
    String name;
    int age;
    String gender;

    People(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String displayMembers(){
        return "there is a " +this.gender +" "+ this.name + " in the house of age " + this.age;
    }
}