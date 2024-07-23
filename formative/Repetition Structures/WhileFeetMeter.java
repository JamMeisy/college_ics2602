import java.util.*;

public class WhileFeetMeter
{
    public static void main(String[] args)
    {
        double a = 3, b = 30;
        TreeMap<String, String> display = new TreeMap<>();
        while (a <= b)
        {
            double c = convertFeetToMeters(a);
            String feet = String.format("\rFeet = %5.2f", a);
            String meter = String.format("\b\tMeters = %.2f \n",c);
            display.put(feet, meter);
            a += 3;
        }
        System.out.println("\r" + display + "\b");
    }
    public static double convertFeetToMeters(double feet) {
        return feet/3.28084;
    }
}