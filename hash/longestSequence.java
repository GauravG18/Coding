import java.util.*;

public class longestSequence {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2 };

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        int start = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 0;

                while (set.contains(currentNum)) {
                    currentNum++;
                    currentLength++;
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = num;
                }
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(start + i + " ");
        }
    }
}
