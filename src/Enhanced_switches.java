public class Enhanced_switches {
    public static void main(String[] args) {
        //enchanced switches
        String day = "sunday";

        String result = switch (day.toUpperCase()) {
            case "MONDAY" -> "MON, TUE";
            case "SUNDAY" -> "SUN";
            default -> "pata na bhai";
        };

        System.out.println(result);
    }
}
