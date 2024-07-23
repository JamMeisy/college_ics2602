import java.util.Scanner;
public class MethodRTriangle
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        double a, b, H, A;
        System.out.print("Enter length of a: ");
        a = in.nextDouble();
        System.out.print("Enter length of b: ");
        b = in.nextInt();

        validateInput(a, b);
        H = hypotenuse(a, b);
        A = area(a, b);
        display(H, A);
    }
    static void validateInput(double a, double b)
    {
        if (a <= 0 || b <= 0)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    static double hypotenuse(double a, double b)
    {
        return Math.hypot(a,b);
    }
    static double area(double a, double b)
    {
        return a*b/2;
    }
    static void display(double H, double A)
    {
        System.out.println("Hypotenuse:  " + H);
        System.out.println("Area: " + A);
    }
}