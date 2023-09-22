import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(newbase(num, base));
    }

    public static int newbase(int num, int base) {
        int ans = 0;
        int mult = 1;
        while (num > 0) {
            int digit = num % base;
            num = num / base;

            ans = ans + digit * mult;
            mult = mult * 10;

        }
        return ans;
    }

}
