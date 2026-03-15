import java.util.Scanner;

public class Enum_usage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter any TBD Characters name:");
            String a = scanner.nextLine().toUpperCase();

            Enum_Class e_num = Enum_Class.valueOf(a);
            System.out.println(e_num);
            System.out.println(e_num.getCharacters());

            //using it with switches

            switch (e_num) {
                case JACK, DECORPUS_BELL, MEGENTA, SHEYALA -> System.out.println("side characters");
                case RISHI -> System.out.println("main character");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }
}
