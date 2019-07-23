package soccer;

public class Player {

private String PlayerName;
private String playerName;

    //adding constructor
    public Player(String PlayerName){
        PlayerName = playerName;
    }
    //Add constructor with no arguments
    public Player(){

    }

    public String getPlayerName( ) {
        return PlayerName;
    }

    public void setPlayerName( String playerName ) {
        PlayerName = playerName;
    }
}
