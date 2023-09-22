import java.util.*;

public class highestFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {

                // IMPORTANT
                map.put(ch, map.get(ch) + 1);

            } else {
                map.put(ch, 1);
            }
        }

        int maxFreq = map.get(str.charAt(0));
        char maxCharacter = str.charAt(0);
        for (Character keys : map.keySet()) {
            if (maxFreq < map.get(keys)) {
                maxFreq = map.get(keys);
                maxCharacter = keys;
            }
        }

        System.out.println(maxCharacter + " " + maxFreq);
    }
}
