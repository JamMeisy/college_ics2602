import java.util.Scanner;

class TollBooth
{
    private int ctr;
    private double fee , total;
    TollBooth()
    {
        ctr = 0;
        fee = 0;
        total = 0;
    }
    void setFee(double fee)
    {
        this.fee = fee;
    }
    void payingCar()
    {
        this.total += fee;
        this.ctr++;
    }
    void nopayCar()
    {
        this.ctr++;
    }
    void display()
    {
        System.out.println("Total Pay: " + this.total);
        System.out.println("Number of Cars: " + this.ctr);
    }
}
public class OOPTollBooth
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        TollBooth tb = new TollBooth();
        char ctrl = '0';
        System.out.println("Toll Booth Function");
        System.out.print("Enter the fee: ");
        tb.setFee(in.nextDouble());
        System.out.println("Enter p for paying cars, n for nonpaying cars, z to end the program");
        while (ctrl != 'z')
        {
            ctrl = in.next().charAt(0);
            if (ctrl == 'p')
                tb.payingCar();
            else if (ctrl == 'n')
                tb.nopayCar();
            else if (ctrl != 'z')
                System.out.println("Invalid Input");
        }
        tb.display();
    }
}