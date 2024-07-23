// Jam Meisy Franco Tan

import java.util.*;
public class MP3
{
    public static void main(String[] args)
    {
        //Inputs and Failsafe
        Scanner in = new Scanner(System.in);

        System.out.print("Input occupant type (L/O): ");
        char otype = in.next().charAt(0);
        otype = Character.toUpperCase(otype);
        if (otype != 'L' && otype != 'O')
        {
            System.out.println("Invalid occupant type!");
            System.exit(0);
        }

        System.out.print("Input unit type (1/2/3): ");
        char unit = in.next().charAt(0);
        if (unit != '1' && unit != '2' && unit != '3')
        {
            System.out.println("Invalid unit type!");
            System.exit(0);
        }

        System.out.print("Input number of parking space (0~2): ");
        int park = in.nextInt();
        if (park < 0)
        {
            System.out.println("Invalid number of parking space!");
            System.exit(0);
        }
        else if (park > 1 && unit == '1')
        {
            System.out.println("Invalid number of parking space!");
            System.exit(0);
        }
        else if (park > 2 && unit == '2')
        {
            System.out.println("Invalid number of parking space!");
            System.exit(0);
        }
        else if (park > 2 && unit == '3')
        {
            System.out.println("Invalid number of parking space!");
            System.exit(0);
        }

        //Operations
        double rate, area, mad, yad, ad;
        rate = 0;
        area = 0;
        ad = 0;
        switch(otype)
        {
            case 'L': switch (unit)
            {
                case '1': rate = 89.50; break;
                case '2': rate = 95.75; break;
                case '3': rate = 102.80; break;
            }
            break;
            case 'O': switch (unit)
            {
                case '1': rate = 85.75; break;
                case '2': rate = 89.50; break;
                case '3': rate = 93.25; break;
            }
            break;
        }
        switch (unit)
        {
            case '1': area = 30; break;
            case '2': area = 65; break;
            case '3': area = 96; break;
        }

        mad = rate * (area + park * 12.5);
        yad = mad * 11;

        //Payment Options
        System.out.println("\nPayment Options: ");
        System.out.printf("Monthly Association Dues: P %.2f%n",mad);
        System.out.printf("Yearly Association Dues: P %.2f (1-month free!)%n%n",yad);

        //Association Due
        System.out.print("What would you like to choose (M - monthly / Y - yearly): ");
        char option = in.next().charAt(0);
        option = Character.toUpperCase(option);
        switch (option)
        {
            case 'M': ad = mad; break;
            case 'Y': ad = yad; break;
            default:
                System.out.println("Invalid payment option!");
                System.exit(0);
        }

        System.out.printf("Association Dues: P %.2f%n",ad);
    }
}
