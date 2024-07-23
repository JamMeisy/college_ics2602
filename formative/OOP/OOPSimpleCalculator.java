import java.util.Scanner;
class Calculator
{
    private double a, b, A;
    public void seta(double x)
    {
        this.a = x;
    }
    public double geta()
    {
        return a;
    }
    public void setb(double x)
    {
        this.b = x;
    }
    public double getb()
    {
        return b;
    }
    public void setA(double x)
    {
        this.A = Math.toRadians(x);
    }
    public double getA()
    {
        return A;
    }
    void addition(double x, double y)
    {
        System.out.printf("Result: %.2f",(x + y));
    }
    void subtraction(double x, double y)
    {
        System.out.printf("Result: %.2f", (x - y));
    }
    void multiplication(double x, double y)
    {
        System.out.printf("Result: %.2f", (x * y));
    }
    void division(double x, double y)
    {
        System.out.printf("Result: %.2f", (x / y));
    }
    void exponent(double x, double y)
    {
        System.out.printf("Result: %.2f", Math.pow(x, y));
    }
    void root(double x, double y)
    {
        System.out.printf("Result: %.2f", Math.pow(x, 1/y));
    }
    void sine(double x)
    {
        System.out.printf("Result: %.2f", Math.sin(x));
    }
    void cosine(double x)
    {
        System.out.printf("Result: %.2f", Math.cos(x));
    }
    void tangent(double x)
    {
        System.out.printf("Result: %.2f", Math.tan(x));
    }
}

public class OOPSimpleCalculator
{
    static Scanner in = new Scanner(System.in);
    static Calculator calc = new Calculator();
    public static void main(String[] args)
    {

        boolean login = true;
        while (login)
        {
            menu();
            char func = in.next().charAt(0);
            switch (func)
            {
                case '+':
                {
                    prompt1();
                    calc.addition(calc.geta(), calc.getb());
                    break;
                }
                case '-':
                {
                    prompt1();
                    calc.subtraction(calc.geta(), calc.getb());
                    break;
                }
                case '*':
                {
                    prompt1();
                    calc.multiplication(calc.geta(), calc.getb());
                    break;
                }
                case '/':
                {
                    prompt1();
                    calc.division(calc.geta(), calc.getb());
                    break;
                }
                case '^':
                {
                    prompt1();
                    calc.exponent(calc.geta(), calc.getb());
                    break;
                }
                case '\\':
                {
                    prompt1();
                    calc.root(calc.geta(), calc.getb());
                    break;
                }
                case 's':
                {
                    prompt2();
                    calc.sine(calc.getA());
                    break;
                }
                case 'c':
                {
                    prompt2();
                    calc.cosine(calc.getA());
                    break;
                }
                case 't':
                {
                    prompt2();
                    calc.tangent(calc.getA());
                    break;
                }
                default:
                    System.out.print("Invalid Input! Please try again!");
            }
            System.out.print("\n\nContinue the program? Y/N: ");
            char choice = Character.toUpperCase(in.next().charAt(0));
            login = validate(choice);
        }
    }
    public static boolean validate(char x)
    {
        while (x != 'Y' && x != 'N')
        {
            System.out.print("Invalid Input! Please try again: ");
            x = Character.toUpperCase(in.next().charAt(0));
        }
        return x == 'Y';
    }
    static void menu()
    {
        System.out.println("************* Simple Calculator ************");
        System.out.println();
        System.out.println("(+) - Addition");
        System.out.println("(-) - Subtraction");
        System.out.println("(*) - Multiplication");
        System.out.println("(/) - Division");
        System.out.println("(^) - Exponential");
        System.out.println("(\\) - Root");
        System.out.println("(s) - Sine");
        System.out.println("(c) - Cosine");
        System.out.println("(t) - Tangent");
        System.out.println();
        System.out.print("Select a function: ");
    }
    static void prompt1()
    {
        System.out.print("Input a: ");
        calc.seta(in.nextDouble());
        System.out.print("Input b: ");
        calc.setb(in.nextDouble());
    }
    static void prompt2()
    {
        System.out.print("Input A: ");
        calc.setA(in.nextDouble());
    }
}