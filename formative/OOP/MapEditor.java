import java.util.Scanner;

class MapCoord
{
    private int row, column;
    public MapCoord(int r, int c)
    {
        this.row = r;
        this.column = c;
    }
    public int getRow()
    {
        return row;
    }
    public int getColumn()
    {
        return column;
    }
    public String toString()
    {
        return ("(" + row + "," + column +")");
    }
}
class TextMap
{
    private int rowCnt, colCnt;
    private char defaultChar;
    private char[][] textmap;
    public TextMap(int rowCnt, int colCnt, char defaultChar)
    {
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.defaultChar = defaultChar;

        textmap = new char[rowCnt][colCnt];
        for (int i = 0; i < rowCnt; i++)
            for (int j = 0; j < colCnt; j++)
                this.textmap[i][j] = defaultChar;
    }
    public int getRowCnt()
    {
        return rowCnt;
    }
    public int getColumnCnt()
    {
        return colCnt;
    }
    public boolean isValidPosition(MapCoord coord)
    {
        return coord.getRow() < rowCnt && coord.getColumn() < colCnt;
    }
    public char getPos(MapCoord coord)
    {
        return textmap[coord.getRow()][coord.getColumn()];
    }
    public boolean setPos(MapCoord coord, char c)
    {
        if (coord.getRow() >= rowCnt || coord.getColumn() >= colCnt)
            return false;
        else
        {
            textmap[coord.getRow()][coord.getColumn()] = c;
            return true;
        }
    }
    public String toString()
    {
        String textMapString = new String();
        for (int i = 0; i < rowCnt; i++)
        {
            for (char x : textmap[i])
                textMapString += Character.toString(x);
            textMapString += "\n";
        }
        return textMapString;
    }
}
public class MapEditor
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter rows, columns, and default character: ");
        int r = in.nextInt();
        int c = in.nextInt();
        char dc = in.next().charAt(0);

        TextMap textmap = new TextMap(r, c, dc);
        System.out.println(textmap.toString());

        boolean cont = true;
        while (cont)
        {
            System.out.println("Enter row, column, and character: ");
            r = in.nextInt();
            c = in.nextInt();
            dc = in.next().charAt(0);

            MapCoord coord = new MapCoord(r, c);
            cont = textmap.setPos(coord, dc);
            System.out.println(textmap.toString());
        }
    }
}