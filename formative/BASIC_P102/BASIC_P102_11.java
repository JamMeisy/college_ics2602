import java.util.*;
public class BASIC_P102_11
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num, a, b, c, d;

        //Inputs
        System.out.print("Input 4-digit Positive Integer: ");
        num = input.nextInt();

        if (num < 10000 && num >= 1000)
        {
            //Operations
            a = num / 1000;
            b = num % 1000 / 100;
            c = num % 100 / 10;
            d = num % 10;
            //Display
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
        else
        {
            System.out.println("ERROR");
        }

    }
}
