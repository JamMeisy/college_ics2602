import java.util.*;
public class MathAnglePhi
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double A1, B1, C1, A2, B2, C2, m1, m2, phi;

        System.out.print("Input A1: ");
        A1 = in.nextDouble();
        System.out.print("Input B1: ");
        B1 = in.nextDouble();
        System.out.print("Input C1: ");
        C1 = in.nextDouble();
        System.out.print("Input A2: ");
        A2 = in.nextDouble();
        System.out.print("Input B2: ");
        B2 = in.nextDouble();
        System.out.print("Input C2: ");
        C2 = in.nextDouble();

        m1 = -A1/B1;
        m2 = -A2/B2;

        phi = Math.atan((m2-m1)/1+m2*m1);

        System.out.println("Phi: " + phi);
    }
}
