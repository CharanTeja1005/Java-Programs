import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program23 {
    public static void main(String[] args) {
        String inputFilePath = "Files/Students/students_marks.txt", hydOutputFilePath = "Files/Students/students_total_marks_hyd.txt", gntOutputFilePath = "Files/Students/students_total_marks_gnt.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(hydOutputFilePath));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(gntOutputFilePath));

            String line;
            while((line = br.readLine()) != null) {
                String[] s = line.split(",");

                String no = s[0].trim(), name = s[1].trim();
                int marks = 0;
                for(int i=0;i<6;i++) marks += (Integer.parseInt(s[2 + i].trim()));
                String city = s[8].trim();
                System.out.println(city);

                String p = String.format("Student no: %s, Name: %s, Total Marks: %d, City: %s\n", no, name, marks, city);

                if(city.equals("Hyderabad")) bw1.write(p);
                else bw2.write(p);
            }
            br.close();
            bw1.close();
            bw2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
