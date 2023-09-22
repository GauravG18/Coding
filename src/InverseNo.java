import java.util.*;
public class InverseNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int count=0;
        int ans=0;
        int sum=0;
        while(num>0){
            int mult=num%10;
            num=num/10;
            
            count++;
            ans=count*(int)Math.pow(10, mult-1);
            sum=sum+ans;
        }
        System.out.println(sum);
    }
}
