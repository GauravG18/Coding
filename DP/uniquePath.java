import java.util.*;

public class uniquePath {

    // You are given an m x n integer array grid. There is a robot initially located
    // at the top-left corner (i.e., grid[0][0]). The robot tries to move to the
    // bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move
    // either down or right at any point in time.

    // An obstacle and space are marked as 1 or 0 respectively in grid. A path that
    // the robot takes cannot include any square that is an obstacle.

    // Return the number of possible unique paths that the robot can take to reach
    // the bottom-right corner.

    // The testcases are generated so that the answer will be less than or equal to
    // 2 * 109.
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

        System.out.println(path(arr));
    }

    public static int path(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if (arr[0][0] == 1) {
            return 0;
        }

        int[][] dp = new int[row][col];

        dp[0][0] = 1; // to go to the first index of the matrix , there is 1 way

        // for firt row i.e to fill all column of 1st row
        for (int j = 1; j < col; j++) {
            if (arr[0][j] == 0) {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // for firt col i.e to fill all row of 1st column
        for (int i = 1; i < row; i++) {
            if (arr[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // for other rows and column other than 1st
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (arr[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[row - 1][col - 1];
    }
}
