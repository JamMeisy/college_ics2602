//1CSC - Jam Meisy Franco Tan

import java.util.Scanner;

class LineCoeff
{
    private double a, b, c;
    //Getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    //Setters
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
}
class LineType
{
    private double x, y;
    //Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public void display(LineCoeff line)
    {
        System.out.printf("%.2fx + %.2fy = %.2f\n", line.getA(), line.getB(), line.getC());
    }
    public boolean isParallel(LineCoeff line1, LineCoeff line2)
    {
        if (line1.getA() == 0 && line2.getA() == 0)
            return true;
        else if (line1.getB() == 0 && line2.getB() == 0)
            return true;
        else
            return (line1.getA() == line2.getA() && line1.getB() == line2.getB());
    }
    public boolean isPerpendicular(LineCoeff line1, LineCoeff line2)
    {
        if (line1.getA() == 0 && line2.getB() == 0)
            return true;
        else if (line1.getB() == 0 && line2.getA() == 0)
            return true;
        else
            return (computeSlope(line1) * computeSlope(line2) == -1);
    }
    public boolean isEqual(LineCoeff line1, LineCoeff line2)
    {
        return (line1.getA() == line2.getA() && line1.getB() == line2.getB() && line1.getC() == line2.getC());
    }
    public double computeSlope(LineCoeff line)
    {
        return (-line.getA()/line.getB());
    }
    public void intersection(LineCoeff line1, LineCoeff line2)
    {
        //Cramer's Rule
        double a, b, c, d, e, f;
        a = line1.getA();
        b = line1.getB();
        c = line1.getC();
        d = line2.getA();
        e = line2.getB();
        f = line2.getC();

        /*
        Solution
        | a b c |
        | d e f |
        */
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));
    }
}

public class MP6
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        LineCoeff line1 = new LineCoeff();
        LineCoeff line2 = new LineCoeff();
        System.out.println("The equation of a line in standard form is ax + by = c");
        System.out.println("Enter the coefficients(a, b, c) of equation 1 :");
        line1.setA(in.nextDouble());
        line1.setB(in.nextDouble());
        line1.setC(in.nextDouble());

        System.out.println("Enter the coefficients(a, b, c) of line 2 :");
        line2.setA(in.nextDouble());
        line2.setB(in.nextDouble());
        line2.setC(in.nextDouble());

        LineType solve = new LineType();
        System.out.println("The system of equations:");
        solve.display(line1);
        solve.display(line2);

        System.out.printf("The slope of line 1 is %.2f\n", solve.computeSlope(line1));
        System.out.printf("The slope of line 2 is %.2f\n", solve.computeSlope(line2));

        boolean equal = solve.isEqual(line1, line2);
        System.out.println(equal? "The lines are equal!" : "The lines are not equal!");

        boolean parallel = solve.isParallel(line1, line2);
        System.out.println(parallel? "The lines are parallel!" : "The lines are not parallel!");

        boolean perpendicular = solve.isPerpendicular(line1, line2);
        System.out.println(perpendicular? "The lines are perpendicular!" : "The lines are not perpendicular!");

        if (equal)
            System.out.println("Infinite solutions! (equal lines)");
        else if (parallel)
            System.out.println("No solution! (parallel lines)");
        else
        {
            solve.intersection(line1, line2);

            System.out.println("The solution of the system of equations :");
            System.out.printf("x = %.2f\n", solve.getX());
            System.out.printf("y = %.2f\n", solve.getY());
        }
    }
}