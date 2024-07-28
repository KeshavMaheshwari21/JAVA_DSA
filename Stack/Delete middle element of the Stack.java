import java.util.*;

class StackClass {
    public static void deleteMiddle(Stack<Integer> s, int n, int cur) {
        if (s.isEmpty() || cur == n) {
            return;
        }

        int x = s.pop();

        deleteMiddle(s, n, cur + 1);

        if (cur != Math.ceil(n/2)) {
            s.push(x);
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        deleteMiddle(s, s.size(), 0);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
