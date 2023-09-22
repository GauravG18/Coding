import java.util.*;

// IMPORTANT METHOD TO SORT THE ARRAY
public class kSortedArray {
    // 1. You are given a number n, representing the size of array a.
    // 2. You are given n numbers, representing elements of array a.
    // 3. The array is nearly sorted. Every element is at-max displaced k spots left
    // or right to it's position in the sorted array. Hence it is being called
    // k-sorted array.
    // 4. You are required to sort and print the sorted array.

    // Note -> You can use at-max k extra space and nlogk time complexity.
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 6, 7, 5, 8, 9 };
        int k = 3;
        PriorityQueue<Integer> que = new PriorityQueue<>();

        // THIS METHOD TAKE O(n) = SPACE, TIME = O(nlogn)

        // for (int i = 0; i < arr.length; i++) {
        // que.add(arr[i]);
        // }

        // int[] arr2 = new int[que.size()];
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i] = que.peek();
        // que.remove();
        // }
        // System.out.println(Arrays.toString(arr2));

        // THIS METHOD TAKE O(K) = SPACE, TIME = O((n-k-1)logK)
        for (int i = 0; i < arr.length; i++) {

            if (i <= k) {
                que.add(arr[i]);
            } else {
                System.out.println(que.remove());
                que.add(arr[i]);
            }
        }

        while (que.size() > 0) {
            System.out.println(que.remove());
        }
    }
}
