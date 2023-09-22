import java.util.Scanner;

public class coinPermutation {
    static int pathLength = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] coin = { 1, 2, 5 };
        int target = 11;

        int[] dp = new int[target + 1];
        dp[0] = 1;

        // HERE THE DP LOOP IS USED AS OUTER LOOP , SO AS TO CONSIDER THE PERMUTAUTION
        // IN ANY SEQUENCE i.e. 2,3 or 3,2
        for (int i = 1; i < dp.length; i++) {
            String path = "";
            for (int j = 0; j < coin.length; j++) {
                if (coin[j] <= i) {
                    dp[i] = dp[i] + dp[i - coin[j]];

                }
            }
            System.out.println(path);
        }

        System.out.println(dp[target]);
        System.out.println();

        // coinpermu(coin, target, "");
        // System.out.println();
        // System.out.println(pathLength);
    }

    public static void coinpermu(int[] coin, int amount, String path) {
        if (amount == 0) {
            pathLength = Math.min(pathLength, path.length());
            System.out.println(path);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            coinpermu(coin, amount - coin[i], path + coin[i]);
        }
    }
}
