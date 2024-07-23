import java.util.Scanner;
public class ForProjectile
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Input velocity: ");
        double v = in.nextDouble();
        System.out.print("Input angle (in degrees): ");
        double theta = in.nextDouble();

        System.out.println("\nSeconds\t\tX\tY");
        for (double t = 0; t <= 5; t+=0.5)
        {
            double x = xProjectile(v, t, theta);
            double y = yProjectile(v, t, theta);
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", t, x, y);
        }
    }
    public static double xProjectile(double v, double t, double theta)
    {
        return v*t*Math.cos(Math.toRadians(theta));
    }
    public static double yProjectile(double v, double t, double theta)
    {
        return v*t*Math.sin(Math.toRadians(theta));
    }
}