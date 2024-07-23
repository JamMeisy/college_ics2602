public class ArraysJagged_MP
{
    public static void main(String[] args)
    {
        int ctr = 0;
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                array[i][j] = ++ctr;
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("\b\b");
        }
    }
}
