public class Standings {
    String name;
    int wins, losses;

    public Standings(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }
    

    public Standings(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void addWins() {
        wins++;
    }

    public void addLosses() {
        losses ++;
    }
    public void addWins(int wins) {
        this.wins += wins;
    }
    public void addLosses(int losses) {
        this.losses += losses;
    }
    public double findWinPercentage() {
        if (wins == 0 && losses == 0) {
            return 0;
        } else {
            return wins / (double)(wins + losses);
        }
    }

    @Override
    public String toString() {
        return "Standings Losses=" + losses + ", Name=" + name + ", Wins=" + wins + ", Win Percentage=%" + findWinPercentage();
    }
    
}
