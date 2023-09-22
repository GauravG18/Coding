import java.util.ArrayList;
import java.util.HashMap;

public class subArraySumEqualToK {

    // IMPORTANT QUESTION

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        int count = 0;
        // TIME COMPLEXITY= O(n^2) and Space Complexity = O(n)
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> ans = new ArrayList<>();
            int sum = 0;
            // int sum = arr[i];
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                ans.add(arr[j]);
                if (sum == k) {
                    System.out.println(ans);
                    count++;
                }
            }
            ans.clear();
        }
        System.out.println(count);
        System.out.println();
        System.out.println(mapMethod(arr, k));
    }

    static int mapMethod(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }

        }
        return ans;
    }
}
