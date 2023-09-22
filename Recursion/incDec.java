import java.util.Scanner;

public class incDec{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        print(num);
    }
    public static void print(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        print(num-1);
        System.out.println(num);
        
    }
}