package soccer;

public class Player {

    //public String PlayerName;
public String playerName;

    //adding constructor
    public Player(String playerName){
        playerName = getPlayerName();
        this.playerName = playerName;
    }
    //Add constructor with no arguments
    public Player(){

    }

    public String getPlayerName( ) {
        return playerName;
    }

    public void setPlayerName( String playerName ) {
        this.playerName = playerName;
    }
}
