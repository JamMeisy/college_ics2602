//Jam Meisy Franco Tan 1CSC

import java.util.Random;
import java.util.Scanner;
public class MP5
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        Random rng = new Random();
        boolean flag = true;
        while(flag)
        {
            System.out.println("\n**************** Arrays ****************");

            //Input of Dimensions
            System.out.print("Enter m: ");
            int m = validate(in.nextInt());
            System.out.print("Enter n: ");
            int n = validate(in.nextInt());
            int first = 0, second = 0, third = 0, fourth = 0, fifth = 0;

            //Loading 2D Array & Determining Jagged Array Size
            int[][] mxn = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                {
                    mxn[i][j] = 1 + rng.nextInt(25);
                    if (mxn[i][j] <= 5)
                        first++;
                    else if (mxn[i][j] <= 10)
                        second++;
                    else if (mxn[i][j] <= 15)
                        third++;
                    else if (mxn[i][j] <= 20)
                        fourth++;
                    else
                        fifth++;
                }

            //Display 2D Array
            System.out.println("2D Array");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                    System.out.printf("%3d ", mxn[i][j]);
                System.out.println();
            }
            System.out.println();

            //Instantiating Jagged Array
            int[][] jagged = new int[5][];
            jagged[0] = new int[first];
            jagged[1] = new int[second];
            jagged[2] = new int[third];
            jagged[3] = new int[fourth];
            jagged[4] = new int[fifth];

            //Loading Jagged Array
            //Variables for Jagged Array Sizes are used as temporary variables
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                {
                    if (mxn[i][j] <= 5)
                        jagged[0][--first] = mxn[i][j];
                    else if (mxn[i][j] <= 10)
                        jagged[1][--second] = mxn[i][j];
                    else if (mxn[i][j] <= 15)
                        jagged[2][--third] = mxn[i][j];
                    else if (mxn[i][j] <= 20)
                        jagged[3][--fourth] = mxn[i][j];
                    else
                        jagged[4][--fifth] = mxn[i][j];
                }

            //Sorting Individual Rows
            sort(jagged);

            //Display Jagged Array & Maximum Number
            System.out.println("Jagged Array");
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < jagged[i].length; j++)
                    System.out.printf("%3d ", jagged[i][j]);
                maxUniqueNumber(jagged[i]);
            }
            System.out.println("\nDo you still wish to continue?");
            System.out.print("(Y - Yes / N - No) : ");
            char select = validate(in.next().charAt(0));
            if (select == 'N')
                flag = false;
        }
        System.out.println("**************** Ending Program ****************");
    }
    public static int validate(int x)
    {
        while (x < 3 || x > 10)
        {
            System.out.print("Invalid Input! Please try again: ");
            x = in.nextInt();
        }
        return x;
    }
    public static char validate(char x)
    {
        while(x != 'Y' && x != 'N')
        {
            System.out.print("Invalid Input! Please try again: ");
            x = in.next().charAt(0);
        }
        return x;
    }
    public static void sort(int[][] array)
    {
        int temp;
        //Individual Row
        for (int i = 0; i < 5; i++)
            //Bubble Sort
            for (int j = 0; j < array[i].length - 1; j++)
                for (int k = 0; k < array[i].length - 1; k++)
                    if (array[i][k] > array[i][k + 1])
                    {
                        temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
    }
    public static void maxUniqueNumber(int[] array)
    {
        //Initializing Counters & Flags
        int max = 0, fre = 0;
        boolean flag = false;
        for (int i = array.length - 1; i >= 0; i--)
        {
            //Determines if the max no. has appeared more than one time before the next lesser number
            if (array[i] < max && fre > 1)
            {
                //Resets the counter to distinguish unique element
                flag = false;
                fre = 0;
                max = 0;
            }
            //Initializes max no. and counts its frequency
            if (max <= array[i])
            {
                flag = true;
                max = array[i];
                fre = fre + 1;
            }
        }
        //Double checks for frequency (especially the least number in the row)
        if (flag && fre == 1)
            System.out.println(" max = " + max);
        else
            System.out.println(" no distinct element");
    }
    public static void maxRepeatNumber(int[] array)
    {
        //Initializing Counters & Flags
        int max = 0, ctr = 0, fre = 0, maxFre = 0;
        for (int i = array.length - 1; i >= 0; i--)
        {
            //Resets counter and frequency
            if (array[i] != ctr)
            {
                ctr = array[i];
                fre = 0;
            }
            //Updates frequency
            fre++;
            //Updates if new max repeating number is found
            if (fre > maxFre)
            {
                max = array[i];
                maxFre = fre;
            }
        }
        //Double checks for frequency
        if (maxFre > 1)
            System.out.println(" max = " + max + " frequency = " + maxFre);
        else
            System.out.println(" no repeating element");
    }
}