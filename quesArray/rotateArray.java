import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        // k=no of time of rotation
        int k = scn.nextInt();
        rotate(a, k);
        for (int val : a) {
            System.out.println(val);
        }

    }

    public static void reverse(int[] a, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k) {
        // write your code here
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // part 1
        reverse(a, 0, a.length - k - 1);
        // part 2
        reverse(a, a.length - k, a.length - 1);

        // all
        reverse(a, 0, a.length - 1);
    }

}
