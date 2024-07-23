import java.util.Scanner;
public class MethodForces
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        double m1, m2, d1, d2;

        //Vector 1
        System.out.print("Enter magnitude of vector 1: ");
        m1 = in.nextDouble();
        System.out.print("Enter direction of vector 1 in degrees (0~360): ");
        d1 = in.nextDouble();
        if (d1 < 0 || d1> 360)
        {
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        d1 = Math.toRadians(d1);

        //Vector 2
        System.out.print("Enter magnitude of vector 2: ");
        m2 = in.nextDouble();
        System.out.print("Enter direction of vector 2 in degrees (0~360): ");
        d2 = in.nextDouble();
        if (d2 < 0 || d2> 360)
        {
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        d2 = Math.toRadians(d2);

        //Computations
        double rx, ry, m, d;
        rx = resultantX(m1, d1, m2, d2);
        ry = resultantY(m1, d1, m2, d2);
        m = resultant(rx,ry);
        d = direction(rx,ry);
        d = Math.toDegrees(d);
        while (d < 0)
            d+=360;
        while (d>360)
            d-=360;
        displayResults(m,d);
    }
    static double resultantX(double m1, double d1, double m2, double d2)
    {
        double x1, x2;
        x1 = m1 * Math.cos(d1);
        x2 = m2 * Math.cos(d2);
        return x1 + x2;
    }
    static double resultantY(double m1, double d1, double m2, double d2)
    {
        double y1, y2;
        y1 = m1 * Math.sin(d1);
        y2 = m2 * Math.sin(d2);
        return y1 + y2;
    }
    static double resultant(double rx, double ry)
    {
        return Math.hypot(rx,ry);
    }
    static double direction(double rx, double ry)
    {
        return Math.atan(ry/rx);
    }
    static void displayResults(double m, double d)
    {
        System.out.printf("Resultant Vector:  %.2f at %.2f degrees", m, d);
    }
}