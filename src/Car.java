public class Car {
    String name = "Hundai i10";
    boolean is_running = true;
    int price = 300000;
    double milage = 55.6;
    float height = 66.9f;

    void car_start() {
        is_running = true;
        System.out.println("you start the car");
    }

    void car_stop() {
        is_running = false;
        System.out.println("you stop the car");
    }

    void drive() {
        System.out.println("you drive the" + name);
    }

    void stop() {
        System.out.println("you stop the" + name);
    }
}
