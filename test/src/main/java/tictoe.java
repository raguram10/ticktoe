import static java.lang.Math.*;

public class tictoe {
    int[][] board;
    int n;
    int[] rol;
    int[] colum;
    int ldia;
    int rdia;
    int winner;
    public tictoe(int n)
    {
        this.n=n;
        this.board=new int[n][n];
        this.rol=new int[n];
        this.colum=new int[n];
        this.winner=0;

    }
    /*
    player==1 is a player 1 and -1 is palyer 2
    row== which row
    column== which colume
     */

    public int move(int player,int row,int column)throws IllegalArgumentException
    {
        if(player!=1&&player!=-1)
        {
            throw new IllegalArgumentException("enter the correct player details");
        }
         if(row>=n||column>=n||row<0||column<0)
        {
            throw new IllegalArgumentException("out of board");
        }
       if(board[row][column]==-1||board[row][column]==1)
        {
            throw new IllegalArgumentException("already blaced");
        }


            board[row][column]=player;
            rol[row]=rol[row]+player;
            colum[column]=colum[column]+player;
            if(row==column) {
                ldia = ldia + player;
                rdia = rdia+player;
            }
            if(rol[row]== abs(n)||colum[column]==abs(n)||ldia==abs(n)||rdia==abs(n))
               winner=player;
        return getWinner();

    }

    public int getWinner() {
        if(winner==0&&(ldia!=abs(n)||rdia!=abs(n)))
            return n;
        return winner;
    }
}
