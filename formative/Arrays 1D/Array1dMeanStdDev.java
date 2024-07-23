import java.util.Scanner;

public class Array1dMeanStdDev
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the number of data: ");
        int n = in.nextInt();
        System.out.println();

        double sum = 0, mean, z_scores = 0, std;
        double[] data = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter data: ");
            data[i] = in.nextDouble();
            sum += data[i];
        }
        mean = sum/(double)n;

        for (double i : data)
            z_scores += Math.pow(i - mean, 2);
        std = Math.pow(z_scores/(double)n, 0.5);
        System.out.printf("\nStandard deviation: %.2f", std);
    }
}
