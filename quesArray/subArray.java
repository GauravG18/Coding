import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            
            for (int j = i; j < a.length; j++) {
                ArrayList<Integer> ans=new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    ans.add(a[k]);
                    // System.out.print(a[k] + "\t");
                }
                result.add(ans);
            } 
        }

        System.out.println(result);
    }

}
