public class Scoreboard {
    private String teamNameOne = null;
    private String teamNameTwo = null;
    private String activeTeam = null;
    private int teamOneScore = 0;
    private int teamTwoScore = 0;
    public Scoreboard(String inNameOne, String inNameTwo){
        teamNameOne = inNameOne;
        teamNameTwo = inNameTwo;
        activeTeam = teamNameOne;
    }
    
    public void recordPlay(int points) {
        if (activeTeam.equals(teamNameOne) && points != 0){
            teamOneScore += points;
        } else if (activeTeam.equals(teamNameTwo) && points != 0) {
            teamTwoScore += points;
        } else if (activeTeam.equals(teamNameOne)) {
            activeTeam = teamNameTwo;
        } else {
            activeTeam = teamNameOne;
        }
    }
    public String getScore() {
        String output = teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
        return output;
    }
}
