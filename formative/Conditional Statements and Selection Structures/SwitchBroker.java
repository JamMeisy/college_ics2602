import java.util.*;
public class SwitchBroker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double rate, c, nc, tax;
        rate = 0;
        tax = 0;

        System.out.print("Input broker type (I/A): ");
        char btype = in.next().charAt(0);
        btype = Character.toUpperCase(btype);
        switch (btype)
        {
            case 'I': tax = 0.20; break;
            case 'A': tax = 0.25; break;
            default:
                System.out.println("Invalid broker type!");
                System.exit(0);
        }

        System.out.print("Input property type (R/C/G): ");
        char ptype = in.next().charAt(0);
        ptype = Character.toUpperCase(ptype);
        switch (ptype)
        {
            case 'R': rate = 0.060; break;
            case 'C': rate = 0.045; break;
            case 'G': rate = 0.040; break;
            default:
                System.out.println("Invalid property type!");
                System.exit(0);
        }

        System.out.print("Input sales price: ");
        double sales = in.nextDouble();

        c = sales * rate;
        nc = c - (c * tax);

        System.out.printf("Gross commission is: P %.2f%n", c);
        System.out.printf("Net commission is: P %.2f%n", nc);
    }
}