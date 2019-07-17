package soccer;

public class League {

    public static void main (String[] args){
        // To do code logic here

        Player player1 = new Player();

        player1.PlayerName = "George Elliot";
        Player player2 = new Player();
        player2.PlayerName = "Graham Green";
        Player player3 = new Player();
        player3.PlayerName = "Geoffrey Chaucer";


        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "the Greens";

        team1.playerArray = thePlayers;
        for (Player thePlayer: team1.playerArray){
        System.out.println(thePlayer.PlayerName);
        }


    }
}
