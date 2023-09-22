import java.util.Collections;
import java.util.PriorityQueue;

public class KlargestElement {
    // 1. You are given a number n, representing the size of array a.
    // 2. You are given n numbers, representing elements of array a.
    // 3. You are given a number k.
    // 4. You are required to find and print the k largest elements of array in
    // increasing order.

    public static void main(String[] args) {
        int[] arr = { 2, 10, 15, 7, 18, 6, 4 };
        int k = 3;

        // METHOD 1 -> SPACE = N

        // PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        // for (int num : arr) {
        // que.add(num);
        // }
        // int k = 1;
        // while (k <= 3) {
        // System.out.println(que.peek());
        // que.remove();
        // k++;
        // }

        // METHOD 2 -> SPACE = K

        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (i >= k && que.peek() < arr[i]) {
                que.remove();
                que.add(arr[i]);
            } else if (que.size() < k) {
                que.add(arr[i]);
            }
        }

        System.out.println(que);
    }
}
