import java.util.Stack;

public class Program17 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<5;i++) st.push(i);

        System.out.println(st);
        System.out.println("isEmpty(): " + st.isEmpty());

        System.out.println("Pop:" + st.pop());
        System.out.println("Pop:" + st.pop());
    }
}
