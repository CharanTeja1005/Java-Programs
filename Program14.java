import java.util.PriorityQueue;

public class Program14 {
    public static void main(String[] args) {
        PriorityQueue<String> arr = new PriorityQueue<>(3);
        arr.offer("Jai");
        arr.add("Balayya");
        arr.offer("Simha");
        arr.offer("NBK");
        System.out.println(arr);

        System.out.println("Size: " + arr.size());

        System.out.println("Poll: " + arr.poll());
        System.out.println("Peek: " + arr.peek());
        System.out.println("Remove: " + arr.remove());
        System.out.println("Element: " + arr.element());
        // System.out.println(arr.poll());
        // System.out.println(arr.poll());

        System.out.println(arr.isEmpty());
    }
}
