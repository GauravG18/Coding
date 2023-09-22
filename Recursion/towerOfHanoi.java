import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int t1=scn.nextInt();
        int t2=scn.nextInt();
        int t3=scn.nextInt();
        print(num,t1,t2,t3);
    }
    public static void print(int num,int t1,int t2,int t3) {
        if(num==0){
            return;
        }
        print(num-1, t1, t3, t2);
        System.out.println(num+" ["+t1+" -> "+t2+"]");
        print(num-1, t3, t2, t1);
    }
    
}
