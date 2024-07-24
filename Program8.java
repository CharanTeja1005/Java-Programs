import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program8
{
    private static String reverse(String str)
    {
        char arr[] = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    private static String reverse(String[] arr)
    {
        int i = 0, j = arr.length - 1;
        while(i < j)
        {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }

    private static String sort(char arr[])
    {
        int cnt[] = new int[26];
        for(char c : arr) cnt[c - 'a']++;
        int i = 0, j = 0;
        while(i < arr.length)
        {
            if(cnt[i] > 0) arr[j++] = (char)('a' + i);
            else i++;
        }
        return new String(arr);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();
        
        // System.out.println(reverse(str));

        // String arr[] = br.readLine().split("\\s+");
        // System.out.println(reverse(arr));

        char arr[] = br.readLine().toCharArray();
        System.out.println(sort(arr));
    }
}