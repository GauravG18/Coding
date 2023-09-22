
import java.util.*;

public class exp3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Q 1 Linear Search
        int[] arr = { 10, 60, 20, 50, 30, 40 };

        // int target = scn.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        // if (target == arr[i]) {
        // System.out.println(i);

        // }

        // Arrays.sort(arr);
        // System.out.println(binarySearch(arr, target));

        // insertionSort(arr);

        selectionSort(arr);

    }

    // Binary Search
    private static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // think: why not use (low + high) / 2 ?

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Q2. Insertion sort

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {    //{ 10, 60, 20, 50, 30, 40};

        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;                  //2 -> 10, 20, 60,
            for (int j = i + 1; j < arr.length; j++) {   //2
                if (arr[j] < arr[idx]) {        // 20  < 60  || 50 < 20   
                    idx = j;                    // ind = 2, 2 , 
                }
            }

            if (idx != i) {       //  2 != 1
                    int temp = arr[idx];    // 20   
                    arr[idx] = arr[i];      // 20 = 60
                    arr[i] = temp;          // 60 = 20
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
