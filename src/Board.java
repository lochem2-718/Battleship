public class Board {
    char[][] board = new char[10][10];
    Board()
    {
        for (int row = 0; row < this.board.length; row++)
        {
            for (int collumn = 0; collumn < this.board[row].length; collumn++)
            {
                this.board[row][collumn] = '~';
            }
        }
    }
    void printBoard()
    {
        char xLabel = 'A';
        System.out.print(' ');
        for (int i = 1; i <= 10; i++) System.out.print(" " + i);
        System.out.print('\n');
        for (int row = 0; row < this.board.length; row++)
        {
            System.out.print(xLabel);

            for (int collumn = 0; collumn < this.board[row].length; collumn++)
            {
                System.out.print(" " + board[row][collumn]);
            }
            System.out.print(" " + xLabel + "\n");
            xLabel++;
        }
        System.out.print(' ');
        for (int i = 1; i <= 10; i++) System.out.print(" " + i);
        System.out.print('\n');
    }


}
