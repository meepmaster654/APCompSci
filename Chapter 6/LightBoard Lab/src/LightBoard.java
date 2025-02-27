/**
 * A light board is a two-dimensional grid of lights that can be turned on and
 * off.
 */
public class LightBoard {
  /**
   * The lights on the board, where true represnets on and false represents off.
   */
  private boolean[][] lights;

  /**
   * Default constructor, used to demonstrate sample method calls in part (b).
   * Not included in the original AP question.
   */
  public LightBoard() {
    boolean[][] sample = { { true, true, false, true, true },
        { true, false, false, true, false },
        { true, false, false, true, true },
        { true, false, false, false, true },
        { true, false, false, false, true },
        { true, true, false, true, true },
        { false, false, false, false, false } };
    lights = sample;
  }

  /**
   * Returns 2D array of light values.
   * Not included in the original AP question.
   * 
   * @return the 2D array of boolean light values
   */
  public boolean[][] getLights() {
    return lights;
  }

  /**
   * Constructs a LightBoard object having numRows rows and numCols columns.
   * Preconditon: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   * 
   * @param numRows the number of rows in this light board
   * @param numCols the number of columns in this light board
   */
  public LightBoard(int numRows, int numCols) {
    lights = new boolean[numRows][numCols];
    for (int r = 0; r < lights.length; r++) {
      for (int c = 0; c < lights[0].length; c++) {
        lights[r][c] = Math.random() < .4;
      }
    }
  }

  /**
   * Evaluates a light in row index row and column index col and returns a status
   * as described in part (b).
   * Precondition: row and col are valid indexes in lights.
   * 
   * @param row the row of the light to be evaluated
   * @param col the column of the light to be evaluated
   */
  public boolean evaluateLight(int row, int col) {
    int numOn = 0;
    for (int i = 0; i < lights.length; i++) {
      if (lights[i][col]) {
        numOn++;
      }
    }
    if (lights[row][col]) {
      if (numOn % 2 == 0) {
        return false;
      }
    } else {
      if (numOn % 3 == 0) {
        return true;
      }
    }
    return lights[row][col];
  }

}