import java.util.Scanner;

public class Array1dTemperatures
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter size of array: ");
        int size = validate(in.nextInt());
        double[] data = new double[size];
        int h = 0, c = 0, p = 0;

        System.out.println("Input the data: ");
        for (int i = 0; i < size; i++)
        {
            data[i] = validate(in.nextDouble());
            if (data[i] >= 85)
                h++;
            else if (data[i] >= 60)
                p++;
            else
                c++;
        }
        System.out.print("\nNumber of cold days - \t\t" + c + "; recorded temperatures: ");
        for (double i:data)
            if (i < 60)
                System.out.printf("%.2f ", i);
        System.out.print("\nNumber of pleasant days - \t" + p + "; recorded temperatures: ");
        for (double i:data)
            if (i >= 60 && i < 85)
                System.out.printf("%.2f ", i);
        System.out.print("\nNumber of hot days - \t\t" + h + "; recorded temperatures: ");
        for (double i:data)
            if (i > 85)
                System.out.printf("%.2f ", i);
    }
    private static int validate(int x)
    {
        while (x < 1 || x > 50)
        {
            System.out.print("Invalid size, please try again: ");
            x = in.nextInt();
        }
        return x;
    }
    private static double validate(double x)
    {
        while (x < 0 || x > 100)
        {
            System.out.print("Invalid temperature, please try again: ");
            x = in.nextDouble();
        }
        return x;
    }
}
