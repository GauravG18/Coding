import java.util.Scanner;

//  Q. TO COUNT THE NO. OF WAYS TO REACH THE DESTINATION N

public class climbStairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // System.out.println(countPath(n));

        // System.out.println(countPathDP(n, new int[n + 1]));

        System.out.println(countPathTab(n));
    }

    public static int countPath(int n) { // Recursion
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        return countPath(n - 1) + countPath(n - 2) + countPath(n - 3);
    }

    // DP MEMOIZATION METHOD
    public static int countPathDP(int n, int[] dp) { // DP Method
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } // MEMOIZATION

        if (dp[n] > 0) {
            return dp[n];
        }
        int a = countPathDP(n - 1, dp);
        int b = countPathDP(n - 2, dp);
        int c = countPathDP(n - 3, dp);
        int ans = a + b + c;
        dp[n] = ans;
        return ans;
    }

    // DP TABULATION METHOD
    public static int countPathTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if   (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
