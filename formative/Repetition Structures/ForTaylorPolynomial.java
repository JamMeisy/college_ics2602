import java.util.Scanner;
public class ForTaylorPolynomial
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter n: ");
        double n = in.nextDouble();

        System.out.print("1");

        double factorial = 1;
        double sum = 0;
        for (int ctr = 1; ctr <= n; ctr++)
        {
            factorial *= ctr;
            double indivT = Math.pow(x,ctr)/factorial;

            sum += indivT;
            System.out.printf(", %.2f", indivT);
        }
        System.out.printf("\nTaylor Polynomial Sum = %.2f", sum);
    }
}
