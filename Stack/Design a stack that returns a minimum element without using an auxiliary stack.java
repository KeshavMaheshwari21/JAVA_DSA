import java.util.Stack;

class MinStack {
    private Stack<Integer> s = new Stack<>();
    private int min;

    public void push(int val) {
        if (s.isEmpty()) {
            s.push(val);
            min = val;
        } else {
            if (val <= min) {
                s.push(min);
                min = val;
            }
            s.push(val);
        }
    }

    public void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack underflow!!");
            System.exit(-1);
        }

        int top = s.pop();
        if (top == min) {
            min = s.pop();
        }
    }

    public int getMin() {
        return min;
    }
    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(6);
        s.push(7);
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s.getMin()); // Output: 1
    }

}
