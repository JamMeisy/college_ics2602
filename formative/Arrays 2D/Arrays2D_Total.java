import java.util.Random;
import java.util.Scanner;

public class Arrays2D_Total
{
    static Scanner in = new Scanner(System.in);
    static Random rng = new Random();
    public static void main(String[] args)
    {
        System.out.print("Enter m: ");
        int m = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int[][] mxn = new int[m+1][n+1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mxn[i][j] = 10 + rng.nextInt(11);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
            {
                mxn[i][n] += mxn[i][j];
                mxn[m][n] += mxn[i][j];
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
            {
                mxn[m][i] += mxn[j][i];
                mxn[m][n] += mxn[j][i];
            }

        //Display
        System.out.println("\t\t\t\t\t\t\tTotal");
        for (int i = 0; i < m; i++)
        {
            System.out.print("\t");
            for (int j = 0; j <= n; j++)
                System.out.print("\t" + mxn[i][j]);
            System.out.println();
        }
        System.out.print("Total\t");
        for (int j = 0; j <= n; j++)
            System.out.print(mxn[m][j] + "\t");
    }
}
