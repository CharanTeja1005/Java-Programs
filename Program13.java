import java.util.concurrent.ArrayBlockingQueue;

/**
 * Program13
 */
public class Program13 {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> arr = new ArrayBlockingQueue<>(3);
        arr.offer("Jai");
        arr.add("Balayya");
        arr.offer("Jai");
        arr.offer("Simha");
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