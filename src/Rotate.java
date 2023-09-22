import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int rotate=scn.nextInt();
        int digit=(int)Math.log10(num);
        // int ans=0;
        for(int i=0;i<rotate;i++){
            int mult=num%10;
            num=num/10;
            num=num+mult*(int)Math.pow(10, digit);
        }   
        System.out.println(num);
    }
    
}
