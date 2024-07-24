import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Assignment1
{
    private static int getSum(List<Integer> list)
    {
        int sum = 0;
        for(int l : list) sum += l;
        return sum;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of student: ");
        String name = br.readLine();
        List<Integer> marks = new ArrayList<>();

        for(int i=0;i<6;i++)
        {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks.add(Integer.parseInt(br.readLine()));
        }
        while(true)
        {
            System.out.println("Enter y if you want to continue: \nOthers to exit: ");
            if(!br.readLine().equals("y")) break;
            System.out.print("Enter marks: ");
            marks.add(Integer.parseInt(br.readLine()));
        }

        System.out.println("Total Marks of " + name + ": " + getSum(marks));
    }
}