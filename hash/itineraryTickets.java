import java.util.HashMap;
import java.util.HashSet;

public class itineraryTickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");

        HashSet<String> depart = new HashSet<>();
        for (String key : map.keySet()) {
            depart.add(key);
        }

        HashSet<String> destiantion = new HashSet<>();
        for (String key : map.keySet()) {
            destiantion.add(map.get(key));
        }

        // TO FIND THE STARTING POINT
        String start = "";
        for (String key : depart) {
            if (!destiantion.contains(key)) {
                start = key;
            }
        }

        depart.clear(); // to clear both the HashSets
        destiantion.clear();

        while (map.containsKey(start)) {
            System.out.print(start + " -> ");
            start = map.get(start);
        }
        System.out.println(start);
    }
}
