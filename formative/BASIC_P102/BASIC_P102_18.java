import java.util.*;
public class BASIC_P102_18
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int w1, w2, w3, w4, w5, hours;
        double pay, income, net, clothes, school, savings, bonds, parents;

        //Inputs
        System.out.print("Input pay rate per hour: ");
        pay = input.nextDouble();

        System.out.print("Input hours worked in week 1: ");
        w1 = input.nextInt();

        System.out.print("Input hours worked in week 2: ");
        w2 = input.nextInt();

        System.out.print("Input hours worked in week 3: ");
        w3 = input.nextInt();

        System.out.print("Input hours worked in week 4: ");
        w4 = input.nextInt();

        System.out.print("Input hours worked in week 5: ");
        w5 = input.nextInt();


        //Operations
        hours = w1 + w2 + w3 + w4 + w5;
        income = pay * hours;
        net = income * 0.86;
        clothes = net * 0.1;
        school = net * 0.01;

        savings = net - clothes - school;
        bonds = savings * 0.25;

        int b = (int) bonds;
        parents = b * 0.5;

        //Outputs
        System.out.println("\nIncome before tax: " + income);
        System.out.println("Income after tax: " + net);
        System.out.println("Money spent on clothes and accessories: " + clothes);
        System.out.println("Money spent on school supplies: " + school);
        System.out.println("Money spent on saving bonds: " + bonds);
        System.out.println("Money spent by parents on additional bonds: " + parents);
    }
}