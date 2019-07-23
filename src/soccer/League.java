package soccer;

public class League {

    private static String team1;
    private static String team2;

    public static void main( String[] args ) {
        // To do code logic here

        Player player1 = new Player();

        player1.setPlayerName("George Elliot");
        Player player2 = new Player();
        player2.setPlayerName("Graham Green");
        Player player3 = new Player();
        player3.setPlayerName("Geoffrey Chaucer");


        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.setTeamName("The Greens");
        team1.setPlayerArray(thePlayers);


        Team team2 = new Team();
        team2.setTeamName("The Red");

        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Robert Service");

        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");

        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Raphael Sabatini");

        Game currGame = new Game();
        currGame.setHomeTeam(team1);
        currGame.setAwayTeam(team2);

        Goal goal1 = new Goal();
        goal1.setThePlayer(currGame.getHomeTeam().getPlayerArray()[2]);
        goal1.setTheTeam(currGame.getHomeTeam());
        goal1.setTheTime(55);

        Goal[] theGoals = {goal1};
        currGame.setGoals(theGoals);

        System.out.println("Goal scored after " +
                currGame.getGoals()[0].getTheTime() + " mins by " +
                currGame.getGoals()[0].getThePlayer().getPlayerName() + " of " +
                currGame.getGoals()[0].getTheTeam().getTeamName());

        for (Player theplayer: team2.getPlayerArray()){
                if (theplayer.getPlayerName().matches(".*Sab.*")){
                    theplayer.getPlayerName().split(" ");
                    String s = theplayer.getPlayerName().split(" ")[1];
                    System.out.println("Found " + theplayer.getPlayerName());
                    System.out.println("Last Name is " + theplayer.getPlayerName().split(" ")[1]);
                }
        }

            for (Player theplayer: team1.getPlayerArray()){
                String name[] = theplayer.getPlayerName().split(" ");
                StringBuilder familyNameFirst = new StringBuilder();
                familyNameFirst.append(name [1]);
                familyNameFirst.append(", ");
                familyNameFirst.append(name[0]);
                familyNameFirst.append(familyNameFirst);

                familyNameFirst.delete(0, familyNameFirst.length());


        }

    }

        public static Team[] createTeams() {

            Player player1 = new Player("George Elliot");
//            String[] theTeams = {team1, team2};
            return createTeams();
        }

}
