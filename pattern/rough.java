import java.util.*;

public class rough {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int digit = 0;
        int mult = (int) Math.pow(10, (int) Math.log10(x));
        while (x != 0) {
            digit = digit + mult * (x % 10); // 320
            x = x / 10; // 1
            mult = mult / 10; // 1
        }
        System.out.println(digit);
    }
}
