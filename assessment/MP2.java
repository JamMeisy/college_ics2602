import java.util.*;
public class MP2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Inputs
        double a, b, t;

        System.out.print("Input a: ");
        a = in.nextDouble();
        System.out.print("Input b: ");
        b = in.nextDouble();
        System.out.print("Input t: ");
        t = in.nextDouble();

        //t is converted in radians for operation
        t = Math.toRadians(t);

        //Operations
        double x, y, z;
        x = ((10*Math.PI)/(a+b)) * Math.pow(Math.sin(t),3) + 3.0 * Math.log(a);
        y = (Math.pow(Math.E,a/b) * Math.atan(a*b))/ Math.sqrt(Math.pow(a,2) + Math.pow(b,2)) + Math.pow((3+Math.pow(a,2)) / (b+2*a),(5/3.0));
        z = 0.25 *  Math.sqrt(Math.abs(x + Math.log10(Math.pow(y,2)) - 2*x*y / Math.cos(t)));

        //Display
        System.out.printf("x: %.4f%n",x);
        System.out.printf("y: %.4f%n",y);
        System.out.printf("z: %.4f%n",z);
    }
}
