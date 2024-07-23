import java.util.Scanner;

public class ArraysJagged_PascalsTriangle
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = validate(in.nextInt()) + 1;
        int[][] array = new int[n][n];
        array[0][0] = 1;

        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                if (array[i][j] != 0)
                    System.out.print(array[i][j] + ", ");
            }
            System.out.println("\b\b");
        }

    }
    public static int validate(int x)
    {
        while (x <= 0)
        {
            System.out.print("Invalid Input! Please try again: ");
            x = in.nextInt();
        }
        return x;
    }
}
