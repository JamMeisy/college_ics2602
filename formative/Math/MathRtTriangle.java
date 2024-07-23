import java.util.*;
public class MathRtTriangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c, A, B;

        System.out.print("Input side a:");
        a = in.nextDouble();
        System.out.print("Input side b:");
        b = in.nextDouble();

        c = Math.hypot(a,b);
        A = Math.atan2(a,b);
        B = Math.atan2(b,a);

        System.out.println("Hypotenuse: " + c);
        System.out.println("Sine: " + Math.sin(A));
        System.out.println("Cosine: " + Math.cos(A));
        System.out.println("Tangent: " + Math.tan(A));
        System.out.println("Co-secant: " + (1/Math.sin(A)));
        System.out.println("Secant: " + (1/Math.cos(A)));
        System.out.println("Cotangent: " + (1/Math.tan(A)));
        System.out.println("Angle A in degrees: " + Math.toDegrees(A));
        System.out.println("Angle B in degrees: " + Math.toDegrees(B));
    }
}
