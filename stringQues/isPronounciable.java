import java.util.*;
// CODECHEF 
// Q. EASY PRONOUNICIATION
public class isPronounciable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        for (int j = 0; j < testCases; j++) {
            int size = scn.nextInt();
            String str = scn.next();
            int c = 0;
            for (int i = 0; i < size; i++) {
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                        && str.charAt(i) != 'u') {
                    c++;
                } else {
                    c = 0;
                }
                if (c >= 4) {
                    System.out.println("NO");
                    break;
                }
            }
            if (c != 4) {
                System.out.println("YES");
            }
        }
    }
}