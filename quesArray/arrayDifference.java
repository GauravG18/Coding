import java.util.Scanner;

public class arrayDifference {
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

        int diff[] = new int[length1];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        int c = 0;

        while (k >= 0) {
            int d = c;
            if(j>=0){
                if (a1[i] >= a2[j]) {
                    d = a1[i] - a2[j];
                } else {
                    d = a1[i]+10 - a2[j] ;
                    a1[i - 1]--;
                }
                diff[k]=d;
            }
            else{
                diff[k]=a1[i];
                
            }
            
            i--;
            k--;
            j--;
        }

        for (int val : diff) {
            System.out.println(val);
        }
    }
}