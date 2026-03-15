package Aggregation;

public class Aggregation {
    public static void main(String[] args) {
        People person1 = new People("Jack", 22, "male");
        People person2 = new People("widow", 40, "female");
        People person3 = new People("goblin", 500, "male");
        People person4 = new People("shoe", 70, "neither");

        People[] peoples = {person1, person2, person3, person4};
        Home home = new Home("Cobbler_cook", 100, peoples);
//        for (People people: peoples){
//            System.out.println(people.displayMembers());
//        }
        home.DisplayStory();
    }
}
