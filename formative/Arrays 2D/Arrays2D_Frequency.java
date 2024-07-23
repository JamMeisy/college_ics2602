import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays2D_Frequency
{
    static Scanner in = new Scanner(System.in);
    static Random rng = new Random();
    public static void main(String[] args)
    {
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int[] num = new int[n];
        int[][] fre = new int[20][2];

        //Load
        for (int i = 0; i < 20; i++)
            fre[i][0] = i + 1;

        for (int i = 0; i < n; i++)
        {
            num[i] = 1 + rng.nextInt(20);
            //Frequency
            for (int j = 0; j < 20; j++)
                if (num[i] == fre[j][0])
                {
                    fre[j][1] += 1;
                    break;
                }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Number\tFrequency");
        for (int i = 0; i < 20; i++)
            if (fre[i][1] != 0)
                System.out.printf(" %2d\t%5d\n", fre[i][0], fre[i][1]);

        /* Erroneous
        //Sort
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1; j++)
                if (num[j] > num[j + 1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

        //Determine Size of Frequency Table
        temp = 1;
        for (int i = 0; i < n; i++)

            for (int j = temp; j <= 20; j++)
                if (j == num[i])
                {
                    temp = num[i] + 1;
                    freSize++;
                    break;
                }
        //Loading Numbers in Frequency Table
        System.out.println(freSize);
        int[][] frequency = new int[freSize][2];
        for (int i = 0; i < n; i++)
            for (int j = 1; j <= n; j++)
                if (j == num[i])
                {
                    frequency[ctr][0] = j;
                    ctr++;
                    break;
                }

        //Counting Frequency
        for (int i = 0; i < n; i++)
            for (int j = 0; j < freSize; j++)
                if (num[i] == frequency[j][0])
                    frequency[j][1] += 1;

        System.out.print("Numbers: " + Arrays.toString(num) + "\nNumber\tFrequency\n" );
        for (int i = 0; i < freSize; i++)
            System.out.printf("  %2d\t%5d\n", frequency[i][0], frequency[i][1]);

         */
    }
}
