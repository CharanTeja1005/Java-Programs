import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Assignment3 {
    public static void main(String[] args) {
        String input1Path = "Files/input1.txt", input2Path = "Files/input2.txt", outputPath = "Files/output.txt";
    
            try {
                BufferedReader br1 = new BufferedReader(new FileReader(input1Path));
                BufferedReader br2 = new BufferedReader(new FileReader(input2Path));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));
    
                String line;
                while((line = br1.readLine()) != null) {
                    bw.write(line + "\n");
                }

                while((line = br2.readLine()) != null) {
                    bw.write(line + "\n");
                }

                System.out.println("Write successful!!!");
                br1.close();
                br2.close();
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
