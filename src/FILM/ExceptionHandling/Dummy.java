package FILM.ExceptionHandling;

public class Dummy extends RuntimeException {
    
    public Dummy(String message) {
        System.out.println("so its a exception by me" + message);
    }

    @Override
    public String toString() {
        return "mera exception";
    }
}