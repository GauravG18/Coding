import java.util.HashMap;

public class stringComparison {
    public static void main(String[] args) {
        String sent = "aaaaaabaa";
        String received = "aaaaaaaa";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sent.length(); i++) {
            if (!map.containsKey(sent.charAt(i))) {
                map.put(sent.charAt(i), 1);
            } else {
                map.put(sent.charAt(i), map.get(sent.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < received.length(); i++) {
            if (map.containsKey(received.charAt(i))) {
                map.put(received.charAt(i), map.get(received.charAt(i)) - 1);
            }
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 0) {
                System.out.println(ch);
            }
        }
    }
}
