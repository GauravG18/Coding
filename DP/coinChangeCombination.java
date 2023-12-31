import java.util.*;

public class coinChangeCombination {

    // 1. You are given a number n, representing the count of coins.
    // 2. You are given n numbers, representing the denominations of n coins.
    // 3. You are given a number "amt".
    // 4. You are required to calculate and print the number of combinations of the
    // n coins using which the
    // amount "amt" can be paid.

    // Note1 -> You have an infinite supply of each coin denomination i.e. same coin
    // denomination can be
    // used for many installments in payment of "amt"
    // Note2 -> You are required to find the count of combinations and not
    // permutations i.e.
    // 2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations
    // of same
    // combination. You should treat them as 1 and not 3.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = scn.nextInt();
        // }

        // int amt = scn.nextInt();

        int[] arr = { 1, 2, 5 };
        int amt = 11;
        // COMBINATION
        int[] dp = new int[amt + 1];
        dp[0] = 1;

        // outer loop doesn't allow to break or count the combination from 2,5 and 5,2.
        // It count them as 1 only
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }
        System.out.println(dp[amt]);
        System.out.println();
        // coinComb(arr, amt, ""); WRONG SHAYAD

    }

    public static void coinComb(int[] coin, int amount, String path) {
        if (amount == 0) {
            System.out.println(path);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            coinComb(coin, amount - coin[i], path + coin[i] + " ");
        }
    }
}
