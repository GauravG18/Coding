import java.util.*;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 3, 2 }, { 3, 1, 1 }, { 1, 2, 2 } };
        int[][] matrix2 = { { 2, 1, 1 }, { 1, 0, 1 }, { 1, 3, 2 } };
        int[][] ans = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        ans[i][j] = ans[i][j] + matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
