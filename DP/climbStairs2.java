import java.util.Scanner;

//  CLIMBING STAIR WITH VARIABLE JUMP
//  Q. IN HOW MANY WAYS WE CAN REACH TO THE DESTINATION N WITH VARIABLE JUMP

public class climbStairs2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // TABULISATION
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                dp[i] = dp[i] + dp[i + j];
            }
        }

        System.out.println(dp[0]);

        System.out.println();

        System.out.println(countPath(arr, 0, n));

    }

    // RECURSION METHOD

    public static int countPath(int[] arr, int idx, int n) {
        if (idx == n) {
            return 1;
        }
        int count = 0;
        for (int j = 1; j <= arr[idx]; j++) {
            if (idx + j <= n) {
                count += countPath(arr, idx + j, n);
            }
        }
        return count;
    }
}
