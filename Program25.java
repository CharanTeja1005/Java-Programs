import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program25 {
    private static boolean isValidEmail(String email)
    {
        String reg = "^[a-zA-Z][\\w.]*@[a-zA-Z]+.[a-zA-Z]{2,5}$";
        return email.matches(reg);
    }

    public static void main(String[] args) {
        String allEmailFilePath = "Files/all_emails.txt", validEmailFilePath = "Files/valid_emails.txt", invalidEmailFilePath = "Files/invalid_emails.txt";
    
            try {
                BufferedReader br = new BufferedReader(new FileReader(allEmailFilePath));
                BufferedWriter bw1 = new BufferedWriter(new FileWriter(validEmailFilePath));
                BufferedWriter bw2 = new BufferedWriter(new FileWriter(invalidEmailFilePath));
    
                String line;
                while((line = br.readLine()) != null) {
                    if(isValidEmail(line)) bw1.write(line + "\n");
                    else bw2.write(line + "\n");
                }
                br.close();
                bw1.close();
                bw2.close();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
