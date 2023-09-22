import java.util.*;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int length=(int)Math.log10(num);
        int div=(int)Math.pow(10, length);
        while(div>0){
            int ans=num/div;
            num=num%div;
            div=div/10;
            System.out.println(ans);
        }
    }
}
