public class NestedLoopValueY
{
    public static void main(String[] args) 
    {
        double x, y, z;
        for (x = 1; x <= 5; x++)
        {
            for (z = 2; z <= 6; z++)
            {
                if (x == z)
                    System.out.print("\nFunction Undefined");
                else
                {
                    y = x*z/(x-z);
                    System.out.printf("\n%.2f", y);
                }
            }
            System.out.println();
        }    
    }
}
