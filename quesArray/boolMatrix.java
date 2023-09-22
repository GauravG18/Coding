import java.util.*;

public class boolMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        validMat(mat, row, col);
        display(mat);

    }

    public static void validMat(int[][] mat, int row, int col) {

        int[] Row = new int[row];
        int[] Col = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    Row[i] = 1;
                    Col[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (Row[i] == 1 || Col[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void display(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
