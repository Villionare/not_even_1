public class Main {
    public static void main(String[] args) {
        byte a = 77;
        short b = 7777;
        int c = 777777777;
        long d = 777777777;

        double f = 434254234323423.5455435343242341351325444;
        float fd = 434254234323423.5455435343242341351325444f;

        int num = 4;
        final String ii = "fuck";

        if (num >= 4) {
            System.out.println("is 4 or bigger");
            System.out.println("U+0F4F");
        } else {
            System.out.println("smaller");
        }

        for (int i = 0; i <= num; i++) {
            System.out.println("this is: " + i);
        }
    }
}