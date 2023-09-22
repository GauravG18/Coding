import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int digit=scn.nextInt();
        int rem=1;
        int count=0;
        while(num>0){
            rem=num%10;
            if(rem==digit){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
        
        
    }
    
}
