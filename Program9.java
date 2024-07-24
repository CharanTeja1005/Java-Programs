public class Program9 {

    public static void main(String[] args) {
        try
        {
            int quo = 1 / 0;
            System.out.println(quo);
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}