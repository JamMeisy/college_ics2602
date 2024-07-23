import java.util.Scanner;
public class WhilePowerTwo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer: ");
        int n = in.nextInt();
        int power = 2;

        while (power <= n)
            power *= 2;
        power /= 2;

        System.out.printf("%nif N = %d, the greatest power of 2 is %d",n,power);
    }
}