import java.util.Scanner;
public class WhileProjectile
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Input velocity: ");
        double v = in.nextDouble();
        System.out.print("Input angle (in degrees): ");
        double theta = in.nextDouble();
        double t = 0;

        System.out.println("\nSeconds\t\tX\tY");
        while(t<=5)
        {
            double x = xProjectile(v, t, theta);
            double y = yProjectile(v, t, theta);
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", t, x, y);
            t+=0.5;
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
