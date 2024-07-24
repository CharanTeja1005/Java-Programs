import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program24 {
    public static void main(String[] args) {
        String sourceImgPath = "Files/Mahesh.jpeg", destImgPath = "Files/Mahesh1.jpeg";

        try {
            FileInputStream fis = new FileInputStream(sourceImgPath);
            FileOutputStream fos = new FileOutputStream(destImgPath);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success");
    }
}
