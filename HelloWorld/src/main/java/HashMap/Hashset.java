package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashset {
    public static void main(String[] args) {
        HashMap<String, String> Capitalcities = new HashMap<String, String>();
        Capitalcities.put("England", "London");
        Capitalcities.put("Germany", "Berlin");
        Capitalcities.put("Norway", "Oslo");
        Capitalcities.put("USA", "Washington");
        System.out.println(Capitalcities);

        for (Map.Entry<String, String> m : Capitalcities.entrySet()) {
            System.out.println("Key  :" + m.getKey() + "Value  :" + m.getValue());
        }
    }
}