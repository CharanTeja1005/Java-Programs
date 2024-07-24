import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program22 {
    public static void main(String[] args) {
        String inputFilePath = "Files/Students/Students.txt", outputFilePath = "Files/Students/processed_students.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while((line = br.readLine()) != null) {
                String[] s = line.split(",");

                String no = s[0].trim(), name = s[1].trim();
                int age = Integer.parseInt(s[2].trim());
                String subject = s[3].trim();
                int marks = Integer.parseInt(s[4].trim());

                String p = String.format("Student no: %s, Name: %s, Age: %d, Subject: %s, Score: %d\n", no, name, age, subject, marks);
                bw.write(p);
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
