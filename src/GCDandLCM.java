import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int gcd=0;
        // int lcm=0;
        for(int i=1;i<=num1;i++){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm=(num1*num2)/gcd;  //  FORMULA FOR LCM AND GREATEST COMMON DIVISOR (GCD)
        System.out.println(lcm);
        }
    }
    

