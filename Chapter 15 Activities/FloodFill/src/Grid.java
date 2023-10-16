import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack <Pair> pairStack = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int count = 1;
        Pair start = new Pair(row, column);
        pairStack.push(start);

        while (pairStack.size() >= 1){
            Pair i = pairStack.pop();
            if (pixels[i.row()][i.col()] == 0){
                pixels[i.row()][i.col()] = count;
                count++;
            }
            if (i.row() + 1 < 10 && pixels[i.row() + 1][i.col()] == 0){
                pairStack.push(new Pair(i.row() + 1, i.col()));
            }
            if (i.col() + 1 < 10 && pixels[i.row()][i.col() + 1] == 0){
                pairStack.push(new Pair(i.row(), i.col() + 1));
            }
            if (i.row() - 1 > -1 && pixels[i.row() - 1][i.col()] == 0){
                pairStack.push(new Pair(i.row() - 1, i.col()));
            }
            if (i.col() - 1 > -1 && pixels[i.row()][i.col() - 1] == 0){
                pairStack.push(new Pair(i.row(), i.col() - 1));
            }

    }
}

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
