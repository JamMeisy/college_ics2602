import java.util.Scanner;

public class MathObliqueTriangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Premises
        double A, b, c, a, B, C, s, area, M, N, P;
        System.out.print("Input angle A: ");
        A = in.nextDouble();
        System.out.print("Input side b: ");
        b = in.nextDouble();
        System.out.print("Input side c: ");
        c = in.nextDouble();

        //Operation
        A = Math.toRadians(A);
        a = Math.sqrt(Math.pow(b,2) + Math.pow(c,2) - 2*b*c*Math.cos(A));
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        B = Math.toDegrees(Math.asin((b*Math.sin(A)/a)));
        C = Math.toDegrees(Math.asin((c*Math.sin(A)/a)));
        M = Math.sqrt(2*Math.pow(a,2)+2*Math.pow(c,2)-Math.pow(b,2))*0.5;
        N = Math.sqrt(2*Math.pow(b,2)+2*Math.pow(c,2)-Math.pow(a,2))*0.5;
        P = Math.sqrt(2*Math.pow(a,2)+2*Math.pow(b,2)-Math.pow(c,2))*0.5;

        //Display
        System.out.println("Side a: " + a);
        System.out.println("Angle B: " + B);
        System.out.println("Angle C: " + C);
        System.out.println("Area: " + area);
        System.out.println("Length of median M: " + M);
        System.out.println("Length of median N: " + N);
        System.out.println("Length of median P: " + P);
    }
}
