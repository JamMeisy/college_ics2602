import java.util.*;
public class MathForces
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double m1, m2, d1, d2, x1, x2, y1, y2, rx, ry, r, rtheta;

        System.out.print("Input magnitude of vector 1: ");
        m1 = in.nextDouble();
        System.out.print("Input direction (in degrees) of vector 1: ");
        d1 = in.nextDouble();
        System.out.print("Input magnitude of vector 2: ");
        m2 = in.nextDouble();
        System.out.print("Input magnitude (in degrees) of vector 2: ");
        d2 = in.nextDouble();

        d1 = Math.toRadians(d1);
        d2 = Math.toRadians(d2);

        x1 = m1*Math.cos(d1);
        y1 = m1*Math.sin(d1);
        x2 = m2*Math.cos(d2);
        y2 = m2*Math.sin(d2);

        rx = x1 + x2;
        ry = y1 + y2;

        r = Math.hypot(rx,ry);
        rtheta = Math.toDegrees(Math.atan2(ry,rx));
        while (rtheta < 0)
        {
            rtheta += 360;
        }
        System.out.println("Resultant Vector: " + r);
        System.out.println("Resultant Vector Angle: " + rtheta);
    }
}
