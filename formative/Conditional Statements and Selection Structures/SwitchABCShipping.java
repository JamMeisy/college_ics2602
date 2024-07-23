import java.util.*;
public class SwitchABCShipping
{
    public static void main(String[] args)
    {
        //Inputs and Failsafe
        Scanner in = new Scanner(System.in);

        System.out.print("Input type of package (A/B): ");
        char type = in.next().charAt(0);
        type = Character.toUpperCase(type);
        if (type != 'A' && type != 'B')
        {
            System.out.println("Invalid type of call!");
            System.exit(0);
        }

        System.out.print("Input weight of package (in kg): ");
        double w = in.nextDouble();
        if (w <= 0 || w > 20)
        {
            System.out.println("Invalid weight!");
            System.exit(0);
        }

        System.out.print("Input shipping distance (in km): ");
        double sd = in.nextDouble();
        if (sd <= 0)
        {
            System.out.println("Invalid distance!");
            System.exit(0);
        }
        sd = Math.ceil(sd/500);

        //Operations
        double rate, c, tc;
        rate = 0;
        switch(type)
        {
            case 'A':
                if (w <= 5)
                    rate = 10.50;
                else if (w <= 10)
                    rate = 15.75;
                else if (w <= 20)
                    rate = 20.65;
            case 'B':
                if (w <= 5)
                    rate = 11.75;
                else if (w <= 10)
                    rate = 18.50;
                else if (w <= 20)
                    rate = 23.65;
        }
        c = w * rate * sd;
        tc = c * 1.1;

        //Display
        System.out.printf("Charge is: P %.2f%n",c);
        System.out.printf("Total charge is: P %.2f%n",tc);
    }
}
