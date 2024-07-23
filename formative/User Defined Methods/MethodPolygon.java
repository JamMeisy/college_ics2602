import java.util.Scanner;
public class MethodPolygon
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        double s, r, P, A;
        int n;
        System.out.print("Enter length of sides: ");
        s = in.nextDouble();
        System.out.print("Enter number of sides: ");
        n = in.nextInt();
        System.out.print("Enter apothem: ");
        r = in.nextDouble();

        P = perimeter(s,n);
        A = area(P,r);
        display(P,A);
    }
    static double perimeter(double s, int n)
    {
        return s*n;
    }
    static double area(double P, double r)
    {
        return r*P/2;
    }
    static void display(double P, double A)
    {
        System.out.println("Perimeter: " + P);
        System.out.println("Area: " + A);
    }
}