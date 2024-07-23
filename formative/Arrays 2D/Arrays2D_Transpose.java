import java.util.Arrays;
import java.util.Random;

public class Arrays2D_Transpose
{
    static Random rng = new Random();
    public static void main(String[] args)
    {
        int[][] A, B;
        A = new int[4][4];
        B = new int[4][4];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
            {
                A[i][j] = 1 + rng.nextInt(20);
                B[j][i] = A[i][j];
            }

        for (int i = 0; i < 4; i++)
            System.out.println("Matrix A: " + Arrays.toString(A[i]));
        System.out.println();
        for (int i = 0; i < 4; i++)
            System.out.println("Matrix B: " + Arrays.toString(B[i]));


    }
}