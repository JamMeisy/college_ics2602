import java.util.Scanner;

public class NestedLoopGenerator 
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.print("Enter number of generators: ");
        int n = in.nextInt();
        double sumgen = 0, avegen = 0;

        for(int i = 0; i < 3; i++)
        {
            double v = 0, sum = 0;
            System.out.println("\nGenerator 1:");
            System.out.println("Enter Voltages:");
            for (int j = 0; j < 3; j++)
            {
                v = in.nextDouble();
                sum += v;
            }
            System.out.printf("Average of Generator %d: %.2f", i+1, sum/3.0);
            sumgen += sum/3.0;
        }
        avegen = sumgen/(double)n;
        System.out.printf("\n\nAverage of all generators: %.2f",avegen);
    }
}
