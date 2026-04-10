package HashMap;

import java.util.HashMap;

public class Main {
    static void main() {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Abhay", "Singh");
        capitalCities.put("Nikola", "Tesla");
        capitalCities.put("blu mount", "Hammer");

        //print all the stored key value pairs
        System.out.println(capitalCities);

        //get the value using key
        System.out.println(capitalCities.get("blu mount"));

        //get the size
        System.out.println(capitalCities.size());

        //get only the values
        System.out.println(capitalCities.values());

        //get only the keyset
        System.out.println(capitalCities.keySet());

        for (String i : capitalCities.keySet()) {
            System.out.println("this is the key: " + i);
        }
    }
}
