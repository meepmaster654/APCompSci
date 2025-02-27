import java.util.Scanner;

public class Minesweeper {

    public static void main(String[] args) {
        TileGrid grid = new TileGrid(.5, 9, 9);
        Scanner input = new Scanner(System.in);
        boolean alive = true;
        while (alive) {
            System.out.println(grid);
            String in = input.nextLine();
            int row = Integer.parseInt(in.substring(0, 1));
            int col = Integer.parseInt(in.substring(1, 2));
            grid.clicked(row, col);
            alive = !grid.getTile(row, col).isMine();
        }
        grid.reveal();
        System.out.println(grid);
        System.out.println("You died");

    }
}
