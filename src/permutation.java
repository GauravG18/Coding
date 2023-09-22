import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int ans = numerator(n) / denominator(n, r);
        System.out.println(ans);
    }

    public static int numerator(int n) {
        int nf = 1;
        for (int i = n; i >= 1; i--) {
            nf = nf * i;
        }
        return nf;
    }

    public static int denominator(int n, int r) {
        int denom = 1;
        for (int i = n - r; i >= 1; i--) {
            denom = denom * i;
        }
        return denom;
    }
}
