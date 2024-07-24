import java.util.TreeSet;

public class Program15 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Grapes");
        ts.add("Orange");
        ts.add("Apple");
        ts.add("Apple");
        ts.add("Kiwi");
        ts.add("Orange");

        System.out.println(ts);
    }
}
