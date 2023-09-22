import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int count=1;count<=num;count++){
            if(count==num){
                System.out.println(a);
            }

            // System.out.println(a);   To print the series of fibonacci
            
            c=a+b;
            a=b;
            b=c;
        }
        
    }
}
