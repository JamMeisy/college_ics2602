import java.util.*;
public class StringName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("First Name: ");
        String fn = in.next();
        System.out.print("Last Name: ");
        String ln = in.next();

        //Initials
        String fni = fn.substring(0,1);
        String lni = ln.substring(0,1);

        System.out.println("Initials: " + fni.toUpperCase() + "." + lni.toUpperCase() + ".");
        System.out.println("Address Book: " + fn + " " + ln.toUpperCase());
        System.out.println("Username: " + fni.toLowerCase() + ln.toLowerCase());
    }
    //pogi ni herman :P
}