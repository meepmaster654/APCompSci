/**
 * A sky view contains data for a given view that can be evaluated.
 */
public class SkyView {
  /**
   * A rectangular array that holds the data representing a rectangular area of
   * the sky.
   */
  private double[][] view;

  /**
   * Constructs a SkyView object from a 1-dimensional array of scan data.
   * Precondition: numRows > 0
   * Precondition: numCols > 0
   * Precondition: scanned.length == numRows * numCols
   * Postcondition: view has been created as a rectangular 2-dimensional array
   * with numRows rows and numCols columns and the values in scanned have been
   * copied to view and are ordered as in the original rectangular area of the
   * sky.
   * 
   * @param numRows the number of rows represented in the view
   * @param numCols the number of columns represented in the view
   * @param scanned the scan data received from the telescope, stored in
   *                telescopic order
   */
  public SkyView(int numRows, int numCols, double[] scanned)
  { 
    view = new double[numRows][numCols];
    int i = 0;
    for (int row = 0; row < view.length; row++){
      if (row % 2 == 0) {
        for (int col = 0; col < view[row].length; col++) {
          view[row][col] = scanned[i];
          i++;
        }
      } else {
        for (int col = view[row].length-1; col >= 0; col--) {
          view[row][col] = scanned[i];
          i++;
        }
      }
    }
  }




  /**
   * Returns the average of the values in a rectangular section of view.
   * Precondition: 0 <= startRow <= endRow < view.length
   * Precondition: 0 <= startCol <= endCol < view[0].length
   * 
   * @param startRow the first row index of the section
   * @param endRow   the last row index of the section
   * @param startCol the first column index of the section
   * @param endCol   the last column index of the section
   * @return the average of the values in the specified section of view
   */
  public double getAverage(int startRow, int endRow, int startCol, int endCol) 
  { 
    double output =0;
    int x = 0;
    for (int row = startRow; row <= endRow; row++) {
      for (int col = startCol; col <= endCol; col++) {
        output += view[row][col];
        x++;
      }
    }
    output /= x;
    return output;
  }

  
  /**
   * Returns a 2-dimensional table of values representing the object.
   * Not included in the original AP question.
   * 
   * @return a string representation of the object
   */
  public String toString() {
    String output = "";
    for (double[] row : view) {
      for (double item : row) {
        output += item + "\t";
      }
      output += "\n";
    }
    return output;
  }

}