import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program7 {
    private static void print(int[][] arr1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++) System.out.print(arr1[i][j] + " ");
            System.out.println();
        }
    }

    private static void add(int[][] arr1, int[][] arr2)
    {
        int[][] sum = new int[3][3];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++) sum[i][j] = arr1[i][j] + arr2[i][j];
        }
        print(sum);
    }

    private static void mul(int[][] arr1, int[][] arr2)
    {
        int[][] arr = new int[3][3];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++) arr[i][j] = arr1[i][j] * arr2[i][j];
        }
        print(arr);
    }

    private static void transpose(int[][] arr)
    {
        int[][] res = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++) res[i][j] = arr[j][i];
        }
        print(res);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        print(arr1);
        System.out.println();
        print(arr2);
        System.out.println();

        add(arr1, arr2);
        System.out.println();

        mul(arr1, arr2);
        System.out.println();
        transpose(arr1);

        int rows[] = new int[3], cols[] = new int[3], diagSum = 0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                rows[i] += arr1[i][j];
                cols[j] += arr1[i][j];
            }
            diagSum += arr1[i][i];
        }

        System.out.println("Row wise sum: " + Arrays.toString(rows));
        System.out.println("Column wise sum: " + Arrays.toString(cols));
        System.out.println("Diagonal sum = " + diagSum);
    }
}
