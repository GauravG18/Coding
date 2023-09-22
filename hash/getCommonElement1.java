import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class getCommonElement1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr1 = { 1, 1, 2, 2, 2, 3, 5 };
        int[] arr2 = { 1, 1, 1, 2, 2, 4, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }

        HashSet<Integer> answer = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                answer.add(arr2[i]);
                map.remove(arr2[i]);
            }
        }

        System.out.println(answer);
    }
}
