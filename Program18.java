public class Program18 extends Thread {
    public void run()
    {
        System.out.println("HELLo Prapancham!");
    }

    public static void main(String[] args) {
        Thread t = new Program18();
        System.out.println(t.getState());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        
        t.start();
        System.out.println(t.getState());


        System.out.println(t.getState());
    }
}
