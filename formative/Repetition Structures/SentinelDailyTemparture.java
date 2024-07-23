import java.util.Scanner;

public class SentinelDailyTemparture
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int h = 0, p = 0, c = 0;
        double x;
        do
        {
            System.out.print("Enter temperature: ");
            x = in.nextDouble();
            if (x >= 85)
            {
                System.out.print("Hot day\n");
                h++;
            }
            else if (x >= 60)
            {
                System.out.print("Pleasant day\n");
                p++;
            }
            else
            {
                System.out.print("Cold day\n");
                c++;
            }
        }
        while (x != -999);
        System.out.println("Number of Hot Days: " + h);
        System.out.println("Number of Pleasant Days: " + p);
        System.out.println("Number of Cold Days: " + c);
    }
}
