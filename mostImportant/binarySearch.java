import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 5, 9, 12, 22, 38, 45 };
        int target = 22;
        int res = binarySearch(nums, target);

        if (res >= 0) {
            System.out.println(target + " found at index: " + res);
        } else {
            System.out.println(target + " not found");
        }
    }

    private static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // think: why not use (low + high) / 2 ?

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[low]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
