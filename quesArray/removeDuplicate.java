import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println(duplicate(nums));
    }

    public static int duplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
        }
        System.out.println(arr);
        return arr.size();
    }

    
}
