import java.util.Random;
import java.util.Scanner;

public class Array1dReplace
{
    static Random rng = new Random();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int size = 15, temp;
        int[] a = new int[size];
        for (int i = 0; i < size; i++)
            a[i] = 35+rng.nextInt(16);

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - 1; j++)
                if (a[j]>a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
        System.out.print("Elements of A: ");
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");

        System.out.print("\nInput X: ");
        int x = in.nextInt();
        for (int i = 0; i < size && a[i] < x; i++)
            a[i] = x;

        System.out.print("New elements of A: ");
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}
