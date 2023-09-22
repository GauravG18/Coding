import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String digit=scn.next();
        for(int i=0;i<digit.length();i++){
            System.out.println(digit.charAt(i)-'0');
        }

    }
}
