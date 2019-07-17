package soccer;

public class League {

    public static void main( String[] args ) {
        // To do code logic here

        Player player1 = new Player();

        player1.PlayerName = "George Elliot";
        Player player2 = new Player();
        player2.PlayerName = "Graham Green";
        Player player3 = new Player();
        player3.PlayerName = "Geoffrey Chaucer";


        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;


        Team team2 = new Team();
        team2.teamName = "The Red";

        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].PlayerName = "Robert Service";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].PlayerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].PlayerName = "Raphael Sabatini";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);

    }
}
