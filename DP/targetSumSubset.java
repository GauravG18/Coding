import java.util.Scanner;

public class targetSumSubset {
    // 1. You are given a number n, representing the count of elements.
    // 2. You are given n numbers.
    // 3. You are given a number "tar".
    // 4. You are required to calculate and print true or false, if
    // there is a subset the elements of which add up to "tar" or not.

    // Similar to coin denomination

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {

                    if (j >= arr[i - 1]) {

                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]]; // <- hard trick
                    }
                }
            }
        }
        System.out.println(dp[arr.length][tar]);
    }
}
