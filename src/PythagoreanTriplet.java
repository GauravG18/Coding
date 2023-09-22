import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }

        if(c>max){
            max=c;
        }

        if(max==a){
            if(b*b+c*c==a*a){
                System.out.println("TRUE");
            }
        }
        else if(max==b){
            if(a*a+c*c==b*b){
                System.out.println("TRUE");
            }
        }
        else if(max==c){
            if(a*a+b*b==c*c){
                System.out.println("TRUE");
            }
        }
        else{
            System.out.println("FALSE");
        }
    }
    
}
