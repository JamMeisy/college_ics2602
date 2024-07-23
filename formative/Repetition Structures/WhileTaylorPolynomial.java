import java.util.Scanner;
public class WhileTaylorPolynomial
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter n: ");
        double n = in.nextDouble();

        System.out.print("1");

        double ctr = 1;
        double factorial = 1;
        double sum = 1;
        while (ctr <= n)
        {
            factorial *= ctr;
            double indivT = Math.pow(x,ctr)/factorial;
            sum += indivT;
            System.out.printf(", %.2f", indivT);
            ctr++;
        }
        System.out.printf("\nTaylor Polynomial Sum = %.2f", sum);
    }
}
