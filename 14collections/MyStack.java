import java.util.Stack;

class MyStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push(1299);
        s.pop();

        System.out.println(s.peek());
    }
}
