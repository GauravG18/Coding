import java.util.Arrays;
import java.util.Scanner;

public class inverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int[] ans = inverse(a);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] inverse(int[] a) {
        int[] inv = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            inv[a[i]] = i;
        }
        return inv;
    }

}
