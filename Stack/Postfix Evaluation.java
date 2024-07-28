import java.util.*;

class StackClass {
    public static int postfixEvaluation(String str) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                s.push(ch - '0');
            } else {
                int op2 = s.pop();
                int op1 = s.pop();

                switch (ch) {
                    case '+':
                        s.push(op1 + op2);
                        break;
                    case '-':
                        s.push(op1 - op2);
                        break;
                    case '*':
                        s.push(op1 * op2);
                        break;
                    case '/':
                        s.push(op1 / op2);
                        break;
                    case '^':
                        s.push((int)Math.pow(op1, op2));
                        break;
                }
            }
        }
        return s.peek();
    }

    public static void main(String args[]) {
        int result = postfixEvaluation("46+2/5*7+");
        System.out.println("Result: " + result);
    }
}
