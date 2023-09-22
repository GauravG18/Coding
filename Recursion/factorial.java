import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        // int ans=fac(num);
        System.out.println(fac(num));
    }

    public static int fac(int num) {
        if (num == 1) {
            return 1;
        }
        // int val=num*fac(num-1);
        return num * fac(num - 1);
    }
}
