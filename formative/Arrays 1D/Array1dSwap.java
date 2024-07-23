import java.util.Random;
import java.util.Scanner;

public class Array1dSwap
{
    static Scanner in = new Scanner(System.in);
    static Random rng = new Random();
    public static void main(String[] args)
    {
        System.out.print("Enter N: ");
        int n = validateN(in.nextInt());
        int[] a, aswap, b;

        a = new int[n];
        loadArray(a);

        aswap = new int[n];
        b = new int[Math.ceilDiv(n,2)];

        swapAddElements(a, aswap, b);
        display(a, aswap, b);
    }
    public static int validateN(int x)
    {
        while (x <= 0)
        {
            System.out.println("Invalid input, please input again: ");
            x = in.nextInt();
        }
        return x;
    }
    public static void loadArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
            a[i] = 10+rng.nextInt(21);
    }
    public static void swapAddElements(int[] x, int[] y, int[] z)
    {
        for (int i = 0; i < x.length; i++)
            y[i] = x[(x.length - 1 - i)];
        for (int i = 0; i < Math.ceil(x.length/2.0); i++)
            z[i] = x[i] + y[i];
    }
    public static void display(int[] x, int[] y, int[] z)
    {
        System.out.print("Elements of a: ");
        for (int i : x)
            System.out.print(i + " ");
        System.out.print("\nElements of a after swapping: ");
        for (int i : y)
            System.out.print(i + " ");
        System.out.print("\nElements of B: ");
        for (int i : z)
            System.out.print(i + " ");
    }
}

