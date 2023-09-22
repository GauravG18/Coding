import java.util.*;

public class primeNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int num=scn.nextInt();
            for(int i=1;i<=num;i++){
                int count=0;
                for(int div=1;div<=i;div++){
                    if(i%div==0){
                        count++;
                    }
                }
                if(count<=2){
                    System.out.println(i);
                }
            }
           
    }
}
