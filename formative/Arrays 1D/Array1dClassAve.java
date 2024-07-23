import java.util.Scanner;

public class Array1dClassAve
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the number of students:  ");
        int n = verify(in.nextInt());

        String[] name = new String[n];
        double[] score = new double[n];
        double sum = 0, ave, max = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.print("\nEnter student's name: ");
            name[i] = in.next();
            System.out.print("Enter test score: ");
            score[i] = in.nextDouble();
            sum += score[i];
            if (score[i] > max)
                max = score[i];
        }
        ave = sum/(double)n;
        System.out.printf("\nClass average: %.2f", ave);

        System.out.print("\nStudents below class average: ");
        for(int i = 0; i < n; i++)
        {
            if (score[i] < ave)
                System.out.print(name[i]+" ");
        }

        System.out.printf("\nStudents with the highest test score (%.2f): ", max);
        for(int i = 0; i < n; i++)
        {
            if (score[i] == max)
                System.out.print(name[i]+" ");
        }
    }
    public static int verify(int n)
    {
        while (n < 0 || n > 50)
        {
            System.out.print("Invalid number of students, please try again: ");
            n = in.nextInt();
        }
        return n;
    }
}
