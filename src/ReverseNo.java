import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        
        while(num>0){
            int ans=num%10;
            num=num/10;     
            System.out.println(ans);
        }
    }
    
}
