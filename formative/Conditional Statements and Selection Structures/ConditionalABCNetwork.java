import java.util.*;
public class ConditionalABCNetwork
{
    public static void main(String[] args)
    {
        //Inputs and Failsafe
        Scanner in = new Scanner(System.in);

        System.out.print("Input time of day (D/N): ");
        char time = in.next().charAt(0);
        time = Character.toUpperCase(time);
        if (time != 'D' && time != 'N')
        {
            System.out.println("Invalid time of day!");
            System.exit(0);
        }

        System.out.print("Input type of call (S/O/I): ");
        char type = in.next().charAt(0);
        type = Character.toUpperCase(type);
        if (type != 'S' && type != 'O' && type != 'I')
        {
            System.out.println("Invalid type of call!");
            System.exit(0);
        }

        System.out.print("Input length of call (in minutes): ");
        double length = in.nextDouble();
        length = Math.ceil(length);

        //Operations
        double rate, tc, nc;
        rate = 0;
        if (time == 'D')
        {
            if (type == 'S')
                rate = 6.75;
            if (type == 'O')
                rate = 8.75;
            if (type == 'I')
                rate = 25.65;
        }
        if (time == 'N')
        {
            if (type == 'S')
                rate = 6.25;
            if (type == 'O')
                rate = 7.50;
            if (type == 'I')
                rate = 23.30;
        }

        tc = rate * length;
        if (time == 'N' && length > 20)
            tc *= 0.9;
        nc = 1.1 * tc;

        //Display
        System.out.printf("Total charge is: P %.2f%n",tc);
        System.out.printf("Net charge is: P %.2f%n",nc);
    }
}