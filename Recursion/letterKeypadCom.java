import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class letterKeypadCom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String digits = scn.next();
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        String[] str = { "0", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }
        comb("", 0, digits, str, result);
        return result;
    }

    public static void comb(String combination, int index, String digits, String[] str, List<String> result) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }

        String letter = str[digits.charAt(index) - '0'];
        for (int i = 0; i < letter.length(); i++) {
            comb(combination + letter.charAt(i), index + 1, digits, str, result);
        }
    }
}
