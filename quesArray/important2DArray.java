import java.util.Arrays;
import java.util.Scanner;

public class important2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] pairs = { { 1, 2 }, { 7, 8 }, { 4, 5 } };
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(pairs)); //
    }
}
