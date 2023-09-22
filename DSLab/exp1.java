import java.util.*;

public class exp1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // PART (i)
        String str = "helloworld";
        System.out.println(countCharacterFrequency(str));

        // Part (ii)
        // String originalString = "Hello, world!";
        // int start = 7;
        // int length = 5;

        // String modifiedString = strndel(originalString, start, length);
        // System.out.println("Original: " + originalString);
        // System.out.println("Modified: " + modifiedString);

        // Part (iii)
        // String str = "hello";
        // char ch = 'l';
        // int idx = str.indexOf(ch);
        // System.out.println(ans(str, idx));

        // Part (iv)
        // int a = 25;
        // int b = 10;
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " " + b);

        // Part (v)
        // int[] arr1 = { 5, 10 };
        // int[] arr2 = { 6, 12 };
        // swap(arr1, arr2);
        // System.out.println(Arrays.toString(arr1));
        // System.out.println();
        // System.out.println(Arrays.toString(arr2));

    }

    public static void swap(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }

    public static String ans(String str, int idx) {
        if (idx < 0 || idx >= str.length()) {
            return str;
        } 
        String first = str.substring(0, idx);
        String last = str.substring(idx + 1);
        return first + last;
    }

    public static Map<Character, Integer> countCharacterFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static String strndel(String original, int start, int length) {
        if (start < 0 || start >= original.length() || length <= 0) {
            return original; // Invalid input parameters, return the original string
        }

        // int end = Math.min(start + length, original.length()); // Calculate end index
        int end = start + length;
        String firstPart = original.substring(0, start);
        String secondPart = original.substring(end);

        return firstPart + secondPart;
    }
}
