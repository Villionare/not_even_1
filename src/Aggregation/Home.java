package Aggregation;

public class Home {
    String home_name;
    int age_of_house;
    People[] person;

    Home(String home_name, int age_of_house, People[] person){
        this.age_of_house = age_of_house;
        this.home_name = home_name;
        this.person = person;
    }

    void DisplayStory(){
    for (People Person: person){
        System.out.println("In the house " + this.home_name +" of "+this.age_of_house + " their lies a " + Person.displayMembers());
        }
    }
}
