package LLDTicTacToe;

import java.util.ArrayList;
import java.util.List;

class Pair
{
    int row;
    int col;
    Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
public class Board {

    PlayingPiece board[][];
    int size;

    Board(int size){
        this.board=new PlayingPiece[size][size];
        this.size=size;
    }

    public boolean addPiece(int row,int col,PlayingPiece piece){
        if(board[row][col]==null){
            board[row][col]=piece;
            return true;
        }
        return false;
    }
    public List<Pair> getEmptyCells(){

        List<Pair> emptyCells = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                     emptyCells.add(new Pair(i,j));
                }
            }
        }
        return emptyCells;
    }

    public void printBoard()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(j==0)
                    System.out.print("|");
                if(board[i][j]!=null)
                    System.out.print(board[i][j].playertype);
                else
                    System.out.print(" ");
                System.out.print("|");
            }
            System.out.println();
        }

    }



}
