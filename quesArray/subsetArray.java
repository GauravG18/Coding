import java.util.Arrays;
import java.util.Scanner;
// SUBSEQUNCE
public class subsetArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int length = (int) Math.pow(2, a.length);
        for (int i = 0; i < length; i++) {
            String ans = "";
            int temp = i;
            for (int j = a.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    ans = "-\t" + ans;
                } else {
                    ans = a[j] + "\t" + ans;
                }
            }
            
            System.out.println(ans);

        }

    }
}
