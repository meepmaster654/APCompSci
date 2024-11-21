public class ScoreboardTester {
    public static void main(String[] args){
        Scoreboard game = new Scoreboard("Red", "Blue");
        String info = game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        info = game.getScore();
        System.out.println(info);
    }
}
