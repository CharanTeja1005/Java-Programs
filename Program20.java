import java.io.FileWriter;

public class Program20 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Files/file.txt");
            fw.write("Welcome to OSI Digital!");
            fw.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Success");
    }
}
