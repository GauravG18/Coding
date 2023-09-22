import java.util.Scanner;

public class heart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // n=5;

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n + 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= n - 2 * i + 1; j++) {
                System.out.print(" ");
            }

            // if (i == n - 1) {
            // for (int j = 2; j <= n + 2 * i - 1; j++) {
            // System.out.print("*");
            // }
            // } else {
            for (int j = 1; j <= n + 2 * i - 1; j++) {

                System.out.print("*");

            }

            System.out.println();
        }

        for (int i = 1; i <= 2 * n + 1; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= 5 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
