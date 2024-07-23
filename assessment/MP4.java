//Jam Meisy Franco Tan 1CSC

import java.util.Scanner;

public class MP4
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("This program tackles multiple concepts of mathematics and assists you in computing them.");
        boolean flag = true;
        do
        {
            barricade();
            //Main Menu
            System.out.print("""
                    Loop Method Series
                    
                    A - Hailstone Sequence
                    B - Harmonic Mean
                    C - Geometric Mean
                    D - Taylor Polynomial of Degree n
                    E - Prime Number
                    F - Quit the Program
                    
                    Select a function:\s""");
            char select = Character.toUpperCase(in.next().charAt(0));
            select = validate(select);
            switch (select)
            {
                case 'A' -> hailstoneSequence();
                case 'B' -> harmonicMean();
                case 'C' -> geometricMean();
                case 'D' -> taylorPolynomialOfDegreeN();
                case 'E' -> primeNumber();
                case 'F' -> flag = false;
            }
        }
        while(flag);
        barricade();
        System.out.println("Exited Program!");
    }
    private static void barricade()
    {
        System.out.print("*===========================================*\n");
    }
    public static char validate(char x)
    {
        while (x < 'A' || x > 'F')  //Validates x to have a valid option
        {
            System.out.print("Invalid Option! Please select again: ");
            x = Character.toUpperCase(in.next().charAt(0));
        }
        return x;
    }
    public static int validate(int x, int greater_than)
    {
        while (x <= greater_than)   //Validates an integer to be greater than a certain number
        {
            System.out.print("Invalid Input! Please try again: ");
            x = in.nextInt();
        }
        return x;
    }
    public static double validate(double x, int greater_than_or_equal)
    {
        while (x < greater_than_or_equal)   //Validates an integer to be greater than a certain number
        {
            System.out.print("Invalid Input! Please try again: ");
            x = in.nextDouble();
        }
        return x;
    }
    public static void hailstoneSequence()
    {
        barricade();
        System.out.println("Hailstone Sequence -- If even, divides the number by 2. If odd, multiplies 3 and adds 1. Function stops when value is at 1\n");
        System.out.print("Enter x: ");
        int x = in.nextInt();
        x = validate(x, 0);
        int k = 0;

        System.out.println();
        for (int an = x; an != 1; k++)
        {
            System.out.print(an + "   ");
            an = (an % 2 == 0)? an/2:3*an+1;    //Performs operation based on odd or even
        }
        System.out.println("1");
        System.out.println("k = " + k);
    }
    public static void harmonicMean()
    {
        barricade();
        System.out.println("Harmonic Mean -- Accepts numbers until 0 is entered\n");
        double x, n = 0, sum = 0;

        System.out.print("Enter x: ");
        x = in.nextDouble();

        while (x != 0) {
            sum += 1 / x;
            n++;
            System.out.print("Enter x: ");
            x = in.nextDouble();
        }

        double harMean;
        harMean = n/sum;

        System.out.printf("\nHarmonic Mean: %.3f\n", harMean);
    }
    public static void geometricMean()
    {
        barricade();
        System.out.println("Geometric Mean -- Accepts positive numbers until 0 is entered\n");
        double n = 0, product = 1;

        System.out.print("Enter x: ");
        double x = in.nextDouble();
        x = validate(x, 0);

        while (x != 0)
        {
            product *= x;
            n++;
            System.out.print("Enter x: ");
            x = in.nextDouble();
            x = validate(x,0);
        }

        double geoMean;
        geoMean = Math.pow(product,1/n);

        System.out.printf("\nGeometric Mean: %.3f\n", geoMean);
    }
    public static void taylorPolynomialOfDegreeN()
    {
        barricade();
        System.out.println("Taylor Polynomial of Degree n -- Enter a number and its degree (positive integer)\n");
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        n = validate(n, 0);

        double factorial = 1;
        double sum = 1;

        System.out.print("\n\n1");
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
            double indivT = Math.pow(x,i)/factorial;    //Formula for individual terms

            sum += indivT;
            System.out.printf(", %.3f", indivT);
        }
        System.out.printf("\nTaylor Polynomial Sum = %.3f\n", sum);
    }
    private static void primeNumber()
    {
        barricade();
        System.out.println("Prime Number Function -- Accepts positive integers. Detects the position of the first 2 prime numbers\n");
        int n, ctr = 1, ctrp = 0, p1 = 0, p2 = 0; //ctr to determine the position of prime number, ctrp to allocate the first and second position
        do
        {
            System.out.print("Enter n: ");
            n = in.nextInt();
            n = validate(n, -1); //Validates positive integers, 0 needed to end the loop

            boolean flag = true;
            for (int i = 2; i <= n/2; i++)  // n/2 for efficiency since dividing any number beyond its half would logically result in a non-integer
            {
                if (n % i == 0)
                {
                    flag = false;  //Detecting composite number
                    break;
                }
            }
            if (flag && n != 0 && n != 1)   //Only runs for prime numbers, 0 & 1 are not prime numbers
            {
                if (ctrp == 0)
                    p1 = ctr;
                else if (ctrp == 1)
                    p2 = ctr;
                ctrp++;
            }
            ctr++;
        }
        while (n != 0);

        System.out.println();
        if (p1 != 0 && p2 != 0) //Validating content of prime numbers
        {
            System.out.println("Position of the first prime number is " + p1);
            System.out.println("Position of the second prime number is " + p2);
        }
        else if (p1 != 0)
        {
            System.out.println("Position of the first prime number is " + p1);
            System.out.println("There is only one prime number");
        }
        else
            System.out.println("There are no prime numbers");
    }
}
