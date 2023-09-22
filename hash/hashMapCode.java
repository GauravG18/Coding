import java.util.*;
// import java.util.HashMap;
// import java.util.HashSet;

public class hashMapCode {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("China", 150);
        map.put("US", 40);
        System.out.println(map);
        System.out.println();
        System.out.println(map.get("Pakistan"));
        System.out.println(map.get("US"));
        System.out.println();

        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println();

        Set<String> key = map.keySet();
        System.out.println(key);

    }
}
