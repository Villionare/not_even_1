package ExceptionHandling;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (Exception e){
            System.out.println("bhakk pagalchoda!!!" + e);
        } finally {
            System.out.println("this was Exception handling");
        }
    }
}
