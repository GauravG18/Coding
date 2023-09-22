public class NQueens {

    static int count=0;
    public static boolean valid(int mat[][], int i, int j, int N) {
        // Check col wise;
        int x = i;
        int y = j;
        while (x >= 0) {
            if (mat[x][y] == 1) {
                return false;
            }
            x--;
        }
        // Check Left Diagonal wise
        x = i;
        y = j;
        while ((x >= 0) && (y >= 0)) {
            if (mat[x][y] == 1) {
                return false;
            }
            x--;
            y--;
        }

        // Check Right Diagonal wise
        x = i;
        y = j;
        while ((x >= 0) && (y < N)) {
            if (mat[x][y] == 1) {
                return false;
            }
            x--;
            y++;
        }

        return true;

    }

    public static void Nqueens(int mat[][], int i, int N) {
        if (i == N) {
            // Print Entire Matrix :
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (mat[r][c] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
            }
            count++;
            System.out.println();
            System.out.println();
            return;
        }
        // Say ith row :
        for (int j = 0; j < N; j++) {
            // place Q at ith row and jth col.
            if (valid(mat, i, j, N)) {
                mat[i][j] = 1;
                Nqueens(mat, i + 1, N);
                mat[i][j] = 0;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int n=4;
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0; // No queen.
            }
        }
        int N = n;
        Nqueens(mat, 0, N);

        System.out.println(count);
    }

}
