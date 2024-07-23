import java.util.*;

public class SwitchBrokerHerms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double SaleP,gc = 0,nc=0;
        int brokerT, PropertyC;

        //input
        System.out.print("Enter Broker Type(I,A) = ");
            brokerT = scan.next().charAt(0);
            brokerT = Character.toUpperCase(brokerT);
        System.out.print("Enter sale Price = ");
            SaleP = scan.nextDouble();
        System.out.print("Enter Property Code(R,C,G) = ");
            PropertyC = scan.next().charAt(0);
            PropertyC = Character.toUpperCase(PropertyC);

        //Process
        switch (brokerT){
            case 'I':{
                switch (PropertyC) {
                    case'R':{
                        gc = SaleP * 0.060;
                    }
                    break;
                    case 'C':{
                        gc = SaleP * 0.045;
                    }
                    break;
                    case'G':{
                        gc = SaleP * 0.040;
                    }
                    break;
                }
                nc = gc * 0.80;
            }
            case 'A':{
                switch (PropertyC) {
                    case 'R': {
                        gc = SaleP * 0.060;
                    }
                    break;
                    case 'C': {
                        gc = SaleP * 0.045;
                    }
                    break;
                    case 'G': {
                        gc = SaleP * 0.040;
                    }
                    break;
                }
                nc = gc * 0.75;
            }
            break;
            default: System.out.print("Invalid input!");
        }

        //display
        System.out.println("\n"+"The Gross cost = " + Math.round(gc*100)/100.00);
        System.out.println("The Net commission rate = " + Math.round( nc*100)/100.00);
    }
}
