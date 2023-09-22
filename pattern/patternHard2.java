import java.util.Scanner;

public class patternHard2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n / 2 + 1; j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < 3 * n; j++) {
                if (i == 0 && (j < n || j >= 2 * n) || j == n - 1 || j == 2 * n) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < n / 2 + 1; j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        int st = n + 2;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n + i + n / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - 2 * i + 2; j++) {
                System.out.print("*");
            }
            // for(int j=0;j<st;j++){
            // System.out.print("*");
            // }
            // st=st-2;

            System.out.println();
        }

    }
}
