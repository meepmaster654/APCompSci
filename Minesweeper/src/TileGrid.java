public class TileGrid {
    private Tile[][] grid;

    public TileGrid(double chance, int rows, int cols) {
        grid = new Tile[rows][cols];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = new Tile(Math.random() < chance);
            }
        }
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c].setNumNear(numNear(r, c));
            }
        }
    }

    public void update(int r, int c) {
        if (grid[r][c].isMine()) {
            grid[r][c].setState(1);
        } else if (grid[r][c].getNumNear() == 0) {
            grid[r][c].setState(2);
        } else {
            grid[r][c].setState(3);
        }
    }

    public void clicked(int r, int c) {
        update(r, c);
        int row = r - 1;
        int col = c;
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
            if (!grid[row][col].isMine() && grid[row][col].getState() == 0) {
                clicked(row, col);
            }
        }
        row = r - 1;
        col = c - 1;
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
            if (!grid[row][col].isMine() && grid[row][col].getState() == 0) {
                clicked(row, col);
            }
        }
        col = c + 1;
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
            if (!grid[row][col].isMine() && grid[row][col].getState() == 0) {
                clicked(row, col);
            }
        }
        row = r + 1;
        col = c;
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {

            if (!grid[row][col].isMine() && grid[row][col].getState() == 0) {
                clicked(row, col);
            }
        }

    }

    public Tile getTile(int r, int c) {
        return grid[r][c];
    }

    public String toString() {
        String output = "";
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                output += grid[r][c];
            }
            output += "\n";
        }
        return output;
    }

    public int numNear(int r, int c) {
        int output = 0;
        for (int rX = -1; rX <= 1; rX++) {
            for (int cX = -1; cX <= 1; cX++) {
                if (r + rX >= 0 && c + cX >= 0 && r + rX < grid.length && c + cX < grid[0].length) {
                    if (grid[r + rX][c + cX].isMine()) {
                        output++;
                    }
                }
            }
        }
        return output;
    }

    public void reveal() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c].isMine()) {
                    grid[r][c].setState(1);
                }
            }
        }
    }
}
