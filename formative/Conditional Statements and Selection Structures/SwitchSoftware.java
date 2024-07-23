import java.util.*;
public class SwitchSoftware
{
    public static void main(String[] args)
    {
        //Inputs and Failsafe
        Scanner in = new Scanner(System.in);

        System.out.print("Input customer type (R/V): ");
        char type = in.next().charAt(0);
        type = Character.toUpperCase(type);
        if (type != 'R' && type != 'V')
        {
            System.out.println("Invalid customer type!");
            System.exit(0);
        }

        System.out.print("Input weight of package (in ounces): ");
        double w = in.nextDouble();
        if (w < 1 || w > 50)
        {
            System.out.println("Invalid weight!");
            System.exit(0);
        }

        //Operations
        double c;
        c = 0;
        if (w <= 8)
            c = 155.75;
        else if (w < 32)
            c = 155.75 + 15.60 * Math.ceil(w - 8);
        else if (w <= 50)
            c = 550.60 + 18.75 * Math.ceil(w - 32);
        switch (type)
        {
            case 'V': c *= 0.88 * 1.12;
            case 'R': c *= 1.12;
        }

        //Display
        System.out.printf("Weight is: %.2f ounces%n",w);
        System.out.printf("Shipping charge is: P %.2f%n",c);
    }
}
