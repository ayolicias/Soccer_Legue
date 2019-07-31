package soccer;

public class Game {
    public Goal[] goals;
    private Team homeTeam;
    private Team awayTeam;
//    private Goal[] goals;

    // playGame method
    void playGame(int maxGoals){
        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));

    }
    
    //method with no parameter and return nothing
        public void playGame(){
        //calling default maxGoal
        playGame(6);
        }

    public Team getHomeTeam( ) {
        return homeTeam;
    }

    public void setHomeTeam( Team homeTeam ) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam( ) {
        return awayTeam;
    }

    public void setAwayTeam( Team awayTeam ) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals( ) {
        return goals;
    }

    public void setGoals( Goal[] goals ) {
        this.goals = goals;
    }
}
