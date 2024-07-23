import java.util.*;
public class BASIC_P102_14
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double op, mp, mprate, tax, taxrate, sp, fp;

        //Inputs
        System.out.print("Input original price: ");
        op = input.nextDouble();

        System.out.print("Input markup percentage (in decimal): ");
        mprate = input.nextDouble();

        System.out.print("Input tax rate percentage (in decimal): ");
        taxrate = input.nextDouble();

        //Operations
        mp = op * mprate;
        sp = op + mp;
        tax = sp * taxrate;
        fp = sp + tax;

        //Display
        System.out.println("Original Price: " + op);
        System.out.println("Markup Percentage: " + mprate);
        System.out.println("Selling Price: " + sp);
        System.out.println("Sales Tax Rate: " + taxrate);
        System.out.println("Sales Tax: " + tax);
        System.out.println("Final Price: " + fp);
    }
}
