package LLDTicTacToe;

public class Player {
    String playername;
    PlayingPiece playerType;

    public Player(String playername,PlayingPiece playerType)
    {
        this.playername=playername;
        this.playerType=playerType;
    }

    public PlayingPiece getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayingPiece playerType) {
        this.playerType = playerType;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }
}
