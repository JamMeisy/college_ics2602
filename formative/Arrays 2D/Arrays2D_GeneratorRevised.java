import java.util.Scanner;

public class Arrays2D_GeneratorRevised
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter number of generators: ");
        int n = in.nextInt();
        double[][] voltage = new double[n][4];
        double sumgen = 0, avegen;

        for(int i = 0; i < n; i++)
        {
            double sum = 0;
            System.out.println("\nGenerator " + (i+1));
            System.out.println("Enter Voltages:");
            for (int j = 0; j < 3; j++)
            {
                voltage[i][j] = in.nextDouble();
                sum += voltage[i][j];
            }
            voltage[i][3] = sum/3.0;
            sumgen += sum;
        }
        avegen = sumgen/(3.0*n);

        System.out.printf("\n\t\t%s\t%s\t%s\t%s\n", "Voltage 1", "Voltage 2", "Voltage 3", "Average");
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Generator %d\t", (i + 1));
            for (int j = 0; j < 4; j++)
                System.out.printf("%9.2f\t", voltage[i][j]);
            System.out.println();
        }
        System.out.printf("\nAverage of all generators: %.2f", avegen);
    }
}
