import java.util.Scanner;
public class ForSequenceK
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter x: ");
        int x = in.nextInt();
        int k = 0;

        for (int an = x; an != 1; k++)
        {
            System.out.print(an + "   ");
            an = (an % 2 == 0)? an/2:3*an+1;
        }
        System.out.println("\nk = " + k);
    }
}
