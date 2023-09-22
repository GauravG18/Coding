import java.util.*;
public class goldmine {
    // Q. TRAVERSE THE MATRIX IN ORDER TO COLLECT MORE NO OF GOLD FROM LEFT TO RIGHT
    // OF MATRIX
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // TABULISATION
        int[][] dp = new int[row][col];

        // MOST IMPORTANT
        // FOR LEFT TO RIGHT WE WOULD USE TO CHANGE COLUMN FOR OUTER LOOP AND ROW FOR
        // INNER LOOP

        for (int j = col - 1; j >= 0; j--) {
            for (int i = row - 1; i >= 0; i--) {
                if (j == col - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + arr[i][j];
                } else if (i == row - 1) {
                    dp[i][j] = Math.max(dp[i - 1][j + 1], dp[i][j + 1]) + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1])) + arr[i][j];
                }
            }
        }

        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if (max <= dp[i][0]) {
                max = dp[i][0];
            }
        }

        System.out.println(max);
    }
}
