import java.util.Scanner;
public class LoopMethodSeries
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean flag = true;
        do
        {
            barricade();
            System.out.print("""
                Loop Method Series
                                    
                A - Arithmetic Series
                B - Geometric Series
                C - Harmonic Mean
                D - Geometric Mean
                E - Taylor Polynomial of Degree n
                F - Prime Number
                G - Quit the Program
                                    
                Select a function:\s""");
            char select = Character.toUpperCase(in.next().charAt(0));

            switch (select)
            {
                case 'A' -> arithmeticSeries();
                case 'B' -> geometricSeries();
                case 'C' -> harmonicMean();
                case 'D' -> geometricMean();
                case 'E' -> taylorPolynomial();
                case 'F' -> primeNumber();
                case 'G' -> flag = false;
                default -> System.out.println("Invalid input! Please try again");
            }
        }
        while (flag);
        barricade();
        System.out.println("Exited Program");
    }
    private static int validateIntegerGreater0(int x)
    {
        while (x <= 0)
        {
            System.out.print("Invalid Input! Please input a valid number: ");
            x = in.nextInt();
        }
        return x;
    }
    private static void barricade()
    {
        System.out.print("*===========================================*\n");
    }
    private static void arithmeticSeries()
    {
        barricade();
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter d: ");
        double d = in.nextDouble();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        n = validateIntegerGreater0(n);

        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            double term = a+(d*i);
            System.out.printf("%.2f,  ", term);
            sum += term;
        }
        System.out.printf("\b\b\b\nSum: %.2f\n", sum);
    }
    private static void geometricSeries()
    {
        barricade();
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter r: ");
        double r = in.nextDouble();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        n = validateIntegerGreater0(n);

        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            double term = a*Math.pow(r,i);
            System.out.printf("%.2f,  ", term);
            sum += term;
        }
        System.out.printf("\b\b\b\nSum: %.2f\n", sum);
    }
    private static void harmonicMean()
    {
        barricade();
        double x, n = 0, sum = 0;

        System.out.println("Enter x: ");
        x = in.nextDouble();

        while (x != 0) {
            sum += 1 / x;
            n++;
            x = in.nextDouble();
        }

        double harMean;
        harMean = n/sum;

        System.out.printf("Harmonic Mean: %.2f\n", harMean);
    }
    private static void geometricMean()
    {
        barricade();
        double n = 0, product = 1;

        System.out.println("Enter x: ");
        double x = in.nextDouble();

        while (x != 0)
        {
            product *= x;
            n++;
            x = in.nextDouble();
        }

        double geoMean;
        geoMean = Math.pow(product,1/n);

        System.out.printf("Geometric Mean: %.2f\n", geoMean);
    }
    private static void taylorPolynomial()
    {
        barricade();
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        n = validateIntegerGreater0(n);

        double factorial = 1;
        double sum = 0;

        System.out.print("1");
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
            double indivT = Math.pow(x,i)/factorial;

            sum += indivT;
            System.out.printf(", %.2f", indivT);
        }
        System.out.printf("\nTaylor Polynomial Sum = %.2f\n", sum);
    }
    private static void primeNumber()
    {
        barricade();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        n = validateIntegerGreater0(n);

        String x = "Prime Number";
        for (int i = 2; i <= n/2; i++)// n/2 for efficiency since dividing any number beyond its half would logically result in a non-integer
        {
            if (n % i == 0)
            {
                x = "Composite Number";
                break;
            }
        }
        System.out.println(x);
    }
}
