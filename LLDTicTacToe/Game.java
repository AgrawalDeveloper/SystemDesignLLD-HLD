package LLDTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board gameBoard;

    public Game()
    {
        initialise();
    }

    private void initialise() {

        players=new LinkedList<>();
        Player player1=new Player("Mona",new PieceO());
        Player player2=new Player("Rahul",new PieceX());
        players.add(player1);
        players.add(player2);

        gameBoard=new Board(3);
    }

    public String startGame()
    {
        boolean noWinner =true;

        while(noWinner)
        {

            Player currentPlayer=players.poll();

            System.out.println(currentPlayer.playername + "turn");
            Scanner sc=new Scanner(System.in);
            String value=sc.nextLine();
            String[] values=value.split(" ");
            if(values.length!=2)
            {
                System.out.println("Invalid Move!! Try Again");
                players.addFirst(currentPlayer);
                continue;
            }
            int row=Integer.parseInt(values[0]);
            int col=Integer.parseInt(values[1]);
            if(row<0 || row>=gameBoard.size || col<0 || col>=gameBoard.size)
            {
                System.out.println("Invalid Move!! Try Again");
                players.addFirst(currentPlayer);
                continue;
            }

            if(gameBoard.addPiece(row,col,currentPlayer.playerType))
            {
                gameBoard.printBoard();
                players.add(currentPlayer);
            }
            else {
                System.out.println("Invalid Move!! Try Again");
                players.addFirst(currentPlayer);
                continue;
            }
            if(gameBoard.getEmptyCells().size()==0)
            {
                noWinner=false;
                continue;
            }
            boolean winner = isThereWinner(currentPlayer.playerType.playertype);
            if(winner) {
                return currentPlayer.playername;
            }


        }
        return "Tie";
    }
    public boolean isThereWinner(PlayerType playertype)
    {
        int n=gameBoard.size;

        for(int i=0;i< n;i++)
        {
            int cnt=0;
            for (int j=0;j< n;j++)
            {
                if(gameBoard.board[i][j]!=null && gameBoard.board[i][j].playertype==playertype)
                {
                    cnt++;
                }
            }
            if(cnt==n) return true;
        }

        for(int i=0;i< n;i++)
        {
            int cnt=0;
            for (int j=0;j< n;j++)
            {
                if(gameBoard.board[j][i]!=null && gameBoard.board[j][i].playertype==playertype)
                {
                    cnt++;
                }
                else break;
            }
            if(cnt==n) return true;
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(gameBoard.board[i][i]!=null && gameBoard.board[i][i].playertype==playertype)
            {
                count++;
            }
            else {
                break;
            }
        }
        if(count==n) return true;

        return false;
    }



}
