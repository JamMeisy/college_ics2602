import java.util.*;
public class MathProb1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x, y, z, s, c;
        System.out.print("Input x: ");
        x = in.nextDouble();
        System.out.print("Input y: ");
        y = in.nextDouble();
        System.out.print("Input z: ");
        z = in.nextDouble();

        //Operations
        z = Math.toRadians(z);
        s = (Math.exp(x)+3*y)/(2*x-y) + Math.sin(z);
        c = x * Math.pow((1+y/3),x);

        System.out.println("S = " + s);
        System.out.println("C = " + c);
    }
}