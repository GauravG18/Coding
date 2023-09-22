import java.util.Scanner;

public class sumToArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length1 = scn.nextInt();
        int[] a1 = new int[length1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int length2 = scn.nextInt();
        int[] a2 = new int[length2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        int sum[] = new int[length1 > length2 ? length1 + 1 : length2 + 1];
        int k = sum.length - 1;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d = d + a1[i];
            }

            if (j >= 0) {
                d = d + a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            k--;
            i--;
            j--;
        }
        for (int val : sum) {
            System.out.println(val);
        }

    }
}
