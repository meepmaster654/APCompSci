/**
 * A crossword contains black and white squares with some white squares
 * following a numbering system.
 */
public class Crossword {
  /**
   * Each element is a Square object with a color(black or white) and a number.
   * puzzle[r][c] represents the square in row r, column c.
   * There is at least one row in the puzzle.
   */
  private Square[][] puzzle = null;

  /**
   * Constructs a crossword puzzle grid.
   * Precondition: There is at least one row in blackSquares
   * Postcondition:
   * - The crossword puzzle grid has the same dimensions as blackSquares
   * - The Square object at row r, column c in the crossword puzzle grid is black
   * if and only if blackSquares[r][c] is true
   * - The squares in the puzzle are labeled according to the crossword labeling
   * rule
   * 
   * @param blackSquares the 2D array of elements to determine if the
   *                     corresponding puzzle element is also black
   */
  public Crossword(boolean[][] blackSquares) {
    puzzle = new Square[blackSquares.length][blackSquares[0].length];
    int label = 1;
    for (int r = 0; r < blackSquares.length; r++) {
      for (int c = 0; c < blackSquares[0].length; c++) {
        if (blackSquares[r][c]) {
          puzzle[r][c] = new Square(true, 0);
        } else if (toBeLabeled(r, c, blackSquares)) {
          puzzle[r][c] = new Square(false, label++);
        } else {
          puzzle[r][c] = new Square(false, 0);
        }
      }
    }

  }

  /**
   * Implements the crossword puzzle numbering system.
   * The square at row r, column c is black if and only if blackSquares[r][c]
   * is true.
   * Precondition: r and c are valid indexes in blackSquares.
   * 
   * @param r            the row to be labeled
   * @param c            the column to be labeled
   * @param blacksquares the 2D array containing corresponding elements that are
   *                     black
   * @return true if the square at row r, column c should be labeled with a
   *         positive number; false otherwise.
   */
  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
    if (r == 0 || c == 0 || blackSquares[r - 1][c] == true || blackSquares[r][c - 1] == true) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Returns the puzzle.
   * Not included in the original AP question.
   *
   * @return this puzzle
   */
  public Square[][] getPuzzle() {
    return puzzle;
  }

}