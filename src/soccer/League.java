package soccer;

public class League {

    private static Team team1;
    private static Team team2;

    public static void main( String[] args ) {
        //adding a call to createTeams method
        Team[] theTeams = createTeams();
        //Adding a call to createGame method
        Game[] theGames = createGames(theTeams);

        // To do code logic here

        Player player1 = new Player();

        player1.setPlayerName("George Elliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Green");
        Player player3 = new Player();
        player3.setPlayerName("Geoffrey Chaucer");


        Player[] thePlayers = {player1, player2, player3};

//        Team team1 = new Team();
//        team1.setTeamName("The Greens");
        team1.setPlayerArray(thePlayers);
//
//        Team team2 = new Team();
//        team2.setTeamName("The Red");

//        Team[] Teams = {team1, team2};
//        team1.setTeamName("The Green");
//        team2.setTeamName("The Red");

        team1.setPlayerArray(thePlayers);
        team2.setPlayerArray(thePlayers);

        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Robert Service");

        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");

        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Raphael Sabatini");

        // instatiate new Game Object
        Game currGame = theGames[0];

//        Game currGame = new Game();
//        currGame.setHomeTeam(team1);
//        currGame.setAwayTeam(team2);

        Goal goal1 = new Goal();
        goal1.setThePlayer(currGame.getHomeTeam().getPlayerArray()[2]);
        goal1.setTheTeam(currGame.getHomeTeam());
        goal1.setTheTime(55);

        Goal[] theGoals = {goal1};
        currGame.setGoals(theGoals);

//        System.out.println("Goal scored after " +
//                currGame.getGoals()[0].getTheTime() + " mins by " +
//                currGame.getGoals()[0].getThePlayer().getPlayerName() + " of " +
//                currGame.getGoals()[0].getTheTeam().getTeamName());

//        for (Player theplayer : team2.getPlayerArray()) {
//            if (theplayer.getPlayerName().matches(".*Sab.*")) {
//                theplayer.getPlayerName().split(" ");
//                String s = theplayer.getPlayerName().split(" ")[1];
//                System.out.println("Found " + theplayer.getPlayerName());
//                System.out.println("Last Name is " + theplayer.getPlayerName().split(" ")[1]);
//            }
//        }

//        for (Player theplayer : team1.getPlayerArray()) {
//            String name[] = theplayer.getPlayerName().split(" ");
//            StringBuilder familyNameFirst = new StringBuilder();
//            familyNameFirst.append(name[1]);
//            familyNameFirst.append(", ");
//            familyNameFirst.append(name[0]);
//            familyNameFirst.append(familyNameFirst);
//
//            familyNameFirst.delete(0, familyNameFirst.length());
//
//
//        }

    }
    // TO DO CREATE THE TEAM ARRAY

    public static Team[] createTeams( ) {
        Team team1 = new Team();
        team1.setTeamName("The Greens");

        Team team2 = new Team();
        team2.setTeamName("The Red");

//                        Player player1 = new Player("George Elliot");
        Team[] theTeams = {team1, team2};

        return theTeams;
    }

    public static Game[] createGames( Team[] theTeams ) {
        // creating the Game object
        Game theGame = new Game();
        //setting the homeTeam and awayTeam
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        //creating the Game array
        Game[] theGames = {theGame};

        return theGames;
    }

}
