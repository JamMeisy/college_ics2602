import java.util.Scanner;
public class LoopMethodFunction
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean flag = true;
        do
        {
            double a, b, i, t;
            System.out.print("Input a: ");
            a = in.nextDouble();
            System.out.print("Input b (a < b): ");
            b = in.nextDouble();
            if (a >= b)
            {
                System.out.println("Invalid input! Please try again");
                continue;
            }
            System.out.print("Input i: ");
            i = validateIncrement(in.nextDouble(), a, b);

            System.out.print("Input t: ");
            t = in.nextDouble();
            t = Math.toRadians(t);

            System.out.printf("%8c%15c%15c", 'X','Y','Z');
            compute(a, b, i, t);
            flag = Repeat();
        }
        while (flag);
    }
    private static double validateIncrement(double i, double a, double b)
    {
        while (i >= (b-a)/2)
        {
            System.out.print("Invalid input! Please try again: ");
            i = in.nextDouble();
        }
        return i;
    }
    private static void compute(double a, double b, double i, double t)
    {
        double x, y, z;
        x = a;
        while(x < b)
        {
            y = 3 * Math.pow(x, 5) - 2*Math.pow(x,3) + x;
            z = y * Math.sin(t) + 0.6 * Math.pow(x, 2);

            System.out.printf("\n%15.4f\t%15.4f\t%15.4f", x, y, z);
            x += i;
        }
    }
    private static boolean Repeat()
    {
        boolean flag = true;
        System.out.print("\n\nInput Y to continue: ");
        char cont = Character.toUpperCase(in.next().charAt(0));
        if (cont != 'Y')
            flag = false;
        return flag;
    }
}
