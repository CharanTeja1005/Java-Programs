import java.io.BufferedReader;
import java.io.FileReader;

public class Program21 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Files/file.txt"));
            int ch;
            while((ch = br.read()) != -1)
            {
                System.out.print((char)ch);
                if(ch == ' ') Thread.sleep(350);
                else Thread.sleep(100);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
