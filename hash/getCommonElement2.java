import java.util.*;

public class getCommonElement2 {
    // 1. You are given a number n1, representing the size of array a1.
    // 2. You are given n1 numbers, representing elements of array a1.
    // 3. You are given a number n2, representing the size of array a2.
    // 4. You are given n2 numbers, representing elements of array a2.
    // 5. You are required to find the intersection of a1 and a2. To get an idea
    // check the example below:

    // if a1 -> 1 1 2 2 2 3 5
    // and a2 -> 1 1 1 2 2 4 5
    // intersection is -> 1 1 2 2 5
    public static void main(String[] args) {
        int[] a1 = { 1, 1, 2, 2, 2, 3, 5 };
        int[] a2 = { 1, 1, 1, 2, 2, 4, 5 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            if (map.containsKey(a1[i])) {
                map.put(a1[i], map.get(a1[i]) + 1);
            } else {
                map.put(a1[i], 1);
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < a2.length; i++) {
            if (map.containsKey(a2[i]) && map.get(a2[i]) > 0) { // <-TRICKY
                answer.add(a2[i]);
                map.put(a2[i], map.get(a2[i]) - 1);

            }
        }

        System.out.println(answer);

    }
}
