import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=1;
        int st=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                sp=sp+2;
                st--;
            }
            else{
                sp=sp-2;
                st++;
            }
        }
    }
}
