public class Array1dSquare
{
    public static void main(String[] args)
    {
       double[] alpha = new double[50];
       for (int i = 0; i < 50; i++)
       {
           if (i < 25)
               alpha[i] = Math.pow(i, 2);
           else
               alpha[i] = i * 3;
           if (i  % 10 == 0)
               System.out.println();
           System.out.printf("%5.1f ", alpha[i]);
       }
    }
}
