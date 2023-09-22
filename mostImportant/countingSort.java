import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; ++i) {
            count[arr[i]]++; // to increase the count of particular number in count array
        }

        int lastIndex = 0;
        for (int i = 0; i < count.length; ++i) {
            while (count[i] > 0) {
                arr[lastIndex] = i;
                lastIndex++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
