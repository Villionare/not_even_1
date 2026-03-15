public class Getter_Setter {
    public static void main(String[] args) {

        Car_getter_setter car = new Car_getter_setter("Hyundai", "blue", 340000);

        //as we cant use the private variables directly we will use getter and setter functions
        //getter is used to get or access
        //setter is used to set or manipulate

        car.setColor("Pink");
        car.setPrice(5000000);

        System.out.println(car.getModel() + " " + car.getColor() + " $" + car.getPrice());

    }
}
