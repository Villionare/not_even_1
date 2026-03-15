public class sTarthingInterface {
    //interfaces are just like abstraction but the differernces is one class can have more then 1 interface

    public static void main(String[] args) {
        Indian india = new Indian();
        pakistani pakistani_mulle = new pakistani();
        India_pakistan_traveller traveller = new India_pakistan_traveller();

        india.Nahi_milega_kashmir();
        pakistani_mulle.Kasmir_chahiye();
        traveller.Kasmir_chahiye();
        traveller.Nahi_milega_kashmir();
    }
}
