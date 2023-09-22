import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // System.out.println(fibo(n));

        System.out.println(fibodp(n, new int[n + 1]));

    }

    public static int fibo(int n) { // RECURSION METHOD
        if (n <= 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fibodp(int n, int[] dp) { // dp method
        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int fib1 = fibodp(n - 1, dp);
        int fib2 = fibodp(n - 2, dp);
        int fib = fib1 + fib2;
        dp[n] = fib;
        return fib;
    }
}
