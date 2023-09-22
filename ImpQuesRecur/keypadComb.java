import java.util.ArrayList;
import java.util.Scanner;

public class keypadComb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> word = KPC(str);
        System.out.println(word);
    }

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> KPC(String str) {
        if (str.isEmpty()) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = KPC(ros);
        ArrayList<String> mres = new ArrayList<String>();
        
        String codeForCh = code[ch-'0'];  // <- TO CONVERT CHARACTER TO INTEGER
        for (int i = 0; i < codeForCh.length(); i++) {
            char code = codeForCh.charAt(i);
            for (String rstr : rres) {
                mres.add(code + rstr);
            }
        }
        return mres;
    }
}
