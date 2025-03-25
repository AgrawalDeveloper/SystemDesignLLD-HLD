package LLDTicTacToe;

public class Main {
    public static void main(String[] args) {
        Game game=new Game();
        String winner=game.startGame();
        if(winner.toLowerCase().equals("tie".toLowerCase()))
        {
            System.out.println("Game is Tie");
        }
        else {
            System.out.println("Winner is " + winner);
        }
    }
}
