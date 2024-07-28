import java.util.*;

class Parenthesis {
    public static boolean isParenthesisMatching(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (isOpening(cur)) {
                s.push(cur);
            } else {
                if (s.isEmpty()) {
                    System.out.println("Parentheses not matched!");
                    return false;
                } else if (!isMatching(s.peek(), cur)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("Parentheses matched!");
            return true;
        } else {
            System.out.println("Parentheses not matched!");
            return false;
        }
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public static void main(String args[]) {
        Parenthesis p = new Parenthesis();
        String str = "(({{}}))";
        p.isParenthesisMatching(str);
    }
}
