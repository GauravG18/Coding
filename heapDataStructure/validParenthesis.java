import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(check(s));
    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if ((ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{')
                        || (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
