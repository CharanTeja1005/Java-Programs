public class Program19 implements Runnable {
    public void run()
    {
        System.out.println("HELLo Prapancham!");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Program19());
        System.out.println(t.getState());
        t.start();
    }
}