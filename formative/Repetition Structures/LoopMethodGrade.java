import java.util.Scanner;

public class LoopMethodGrade
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean flag;
        do
        {
            System.out.println("\n---------Computation of Grades---------");
            double qa, mpa, mea, pg, eg;
            String remark;

            System.out.print("Enter number of quizzes: ");
            qa = quiz(getValidatedNumber());

            System.out.print("Enter number of MPs: ");
            mpa = mp(getValidatedNumber());

            System.out.print("Enter number of Majors: ");
            mea = majors(getValidatedNumber());

            pg = 0.3 * qa + 0.3 * mpa + 0.4 * mea;

            if (pg >= 90)
            {
                eg = 1.0;
                remark = "Very Good";
            }
            else if (pg >= 76)
            {
                eg = 2.0;
                remark = "Good";
            }
            else if (pg >= 60)
            {
                eg = 3.0;
                remark = "Fair";
            }
            else
            {
                eg = 5.0;
                remark = "Failed";
            }

            System.out.printf("\nPreliminary Grade: %.2f", pg);
            System.out.printf("\nEquivalent Grade: %.1f", eg);
            System.out.printf("\nRemark: %s", remark);

            flag = Repeat();
        }
        while (flag);
        System.out.println("Exited Program");
    }

    private static double quiz(int n)
    {
        double sum = 0, ave;
        System.out.println("Enter quiz scores: ");
        for (int i = 0; i < n; i++)
        {
            double score = in.nextDouble();
            score = validate(score);
            sum+=score;
        }
        ave = sum/(double)n;
        return ave;
    }
    private static double mp(int n)
    {
        double sum = 0, ave;
        System.out.println("Enter MP scores: ");
        for (int i = 0; i < n; i++)
        {
            double score = in.nextDouble();
            score = validate(score);
            sum+=score;
        }
        ave = sum/(double)n;
        return ave;
    }
    private static double majors(int n)
    {
        double sum = 0, ave;
        System.out.println("Enter major exam scores: ");
        for (int i = 0; i < n; i++)
        {
            double score = in.nextDouble();
            score = validate(score);
            sum+=score;
        }
        ave = sum/(double)n;
        return ave;
    }
    private static double validate(double x)
    {
        while (x > 100 || x < 1)
        {
            System.out.print("Invalid input! Please try again: ");
            x = in.nextDouble();
        }
        return x;
    }
    private static int getValidatedNumber()
    {
        int z = in.nextInt();
        while (z <= 0)
        {
            System.out.print("Invalid input! Please try again: ");
            z = in.nextInt();
        }
        return z;
    }
    private static boolean Repeat()
    {
        boolean flag = true;
        System.out.print("\n\nInput Y to continue: ");
        char cont = Character.toUpperCase(in.next().charAt(0));
        if (cont != 'Y')
            flag = false;
        return flag;
    }

}
