import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("Files/some file.txt"));
        String line;
        while((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        
        System.out.println();
        System.out.print("Enter the line you want to append: ");
        
        br.close();
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("Files/some file.txt", true));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw.append(br.readLine() + "\n");
        System.out.println("Appended successfully!!!");

        bw.close();
        br.close();

        System.out.println();
        br = new BufferedReader(new FileReader("Files/some file.txt"));
        while((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
    }
}