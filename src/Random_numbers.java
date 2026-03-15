import java.util.Random;

public class Random_numbers {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("lets generate a random number");

        int rand = random.nextInt();
//        this will create a random number beween -2B to +2Billion
        System.out.println(rand);
//        to specify limits use
        rand = random.nextInt(1, 10);
//        1 = inclusive , 10 = exclusive
        System.out.println(rand);
    }
}
