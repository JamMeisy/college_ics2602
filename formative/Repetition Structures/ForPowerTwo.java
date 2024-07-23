import java.util.Scanner;
public class ForPowerTwo
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer: ");
        int n = in.nextInt();
        int z = 0;
        for (int power = 2; power <= n; power*=2)
        {
            z = power;
        }
        z /= 2;

        System.out.printf("%nif N = %d, the greatest power of 2 is %d",n,z);
    }
}