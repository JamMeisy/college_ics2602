import java.util.Scanner;

public class Arrays2D_AirplaneSeating
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[][] p = new int[13][6];
        p[0][2] = 1; p[0][4] = 1; p[0][5] = 1;
        p[1][1] = 1; p[1][3] = 1; p[1][5] = 1;
        p[2][2] = 1; p[2][3] = 1; p[2][5] = 1;
        p[3][0] = 1; p[3][2] = 1; p[3][4] = 1; p[3][5] = 1;
        p[4][1] = 1; p[4][3] = 1;
        p[5][1] = 1; p[5][5] = 1;
        p[6][0] = 1; p[6][4] = 1; p[6][5] = 1;
        p[7][1] = 1; p[7][3] = 1; p[7][4] = 1;
        p[8][0] = 1; p[8][2] = 1; p[8][3] = 1; p[8][5] = 1;
        p[9][1] = 1; p[9][3] = 1; p[9][4] = 1; p[9][5] = 1;
        p[10][2] = 1; p[10][4] = 1;
        p[11][2] = 1; p[11][3] = 1; p[10][5] = 1;
        p[12][4] = 1;

        display(0 , 13, p);
        System.out.println("\nTicket Types: 1 - First Class, 2 - Business Class, 3 - Economy Class");

        int x = 0, y = 0;
        boolean flag = false;
        do
        {
            System.out.print("Input Ticket Code: ");
            int classSeat = in.nextInt();
            if (classSeat == 1)
            {
                x = 0;
                y = 2;
            }
            else if (classSeat == 2)
            {
                x = 2;
                y = 7;
            }
            else if (classSeat == 3)
            {
                x = 7;
                y = 13;
            }
            else
            {
                System.out.println("Invalid Input");
                flag = true;
            }
        }
        while (flag);
        func(x, y, p);
    }
    public static void func(int x, int y, int[][] z)
    {
        display(x, y, z);
        System.out.print("Please enter desired seat: ");

        boolean flag = false;
        int row;
        char col;
        do
        {
            String seatCode = in.next();

            //Parses Integer and Character
            //src: https://stackoverflow.com/questions/8270784/how-to-split-a-string-between-letters-and-digits-or-between-digits-and-letters
            String[] seat = seatCode.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            row = Integer.parseInt(seat[0]);
            col = Character.toUpperCase(seat[1].charAt(0));

            //Translates Character to Number
            int colnum = col - 65;

            //Verify
            if (colnum < 0 || colnum > 5 || row <= x || row - 1 >= y)
                System.out.print("Invalid Seat Code! Please try again: ");
            else if (z[row - 1][colnum] == 1)
                System.out.print("Seat is Unavailable! Please try again: ");
            else
                flag = true;
        }
        while (!flag);
        System.out.println("\nYour seat code will be " + row + col);
    }
    public static void display(int x, int y, int[][] z)
    {
        System.out.printf("\n\t\t%2c%2c%2c%2c%2c%2c\n", 'A', 'B', 'C', 'D', 'E', 'F');
        for (int i = x; i < y; i++) {
            System.out.printf("Row %d\t", i + 1);
            for (int j = 0; j < 6; j++)
                if (z[i][j] == 1)
                    System.out.printf("%2c", 'X');
                else
                    System.out.printf("%2c", '*');
            System.out.println();
        }
    }
}
