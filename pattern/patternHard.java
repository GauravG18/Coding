import java.util.*;
public class patternHard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n / 2 + 2; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= n / 2; j++) {
                if (j >= i - n / 2 && j >= n / 2 - i) { // <- this LOGIC is very important for triangle pattern with
                                                        // space
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j <= n / 2; j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
