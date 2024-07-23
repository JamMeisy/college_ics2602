import java.util.Scanner;

public class SentinelGeometricHarmonic
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        double x, n = 0, sum = 0, product = 1;

        System.out.println("Enter x: ");
        x = in.nextDouble();

        while (x != 0) {
            sum += 1 / x;
            product *= x;
            n++;
            x = in.nextDouble();
        }

        double geoMean, harMean;
        geoMean = Math.pow(product,1/n);
        harMean = n/sum;

        System.out.printf("Geometric Mean: %.2f\n", geoMean);
        System.out.printf("Harmonic Mean: %.2f\n", harMean);
    }
}
