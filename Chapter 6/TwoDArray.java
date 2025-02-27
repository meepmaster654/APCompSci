// --------------------------------------------------
// Name: Will Leasure
// --------------------------------------------------

public class TwoDArray {
  private int[][] array = null;

  public TwoDArray(int rows, int cols, int targetRow, int targetCol) {
    array = new int[rows][cols];
    for (int r = 0; r < array.length; r++) {
      for (int c = 0; c < array[0].length; c++) {
        array[r][c] = Math.abs(targetRow - r) + Math.abs(targetCol - c);
      }
    }
  }

  public boolean equals(int[][] other) {
    if (array.length != other.length || other[0].length != array[0].length) {
      return false;
    }
    for (int r = 0; r < array.length; r++) {
      for (int c = 0; c < array[0].length; c++) {
        if (array[r][c] != other[r][c]) {
          return false;
        }
      }
    }
    return true;
  }

  public void transpose() {
    int[][] newArr = new int[array[0].length][array.length];
    for (int r = 0; r < array.length; r++) {
      for (int c = 0; c < array[0].length; c++) {
        newArr[c][r] = array[r][c];
      }
    }
    array = newArr;
  }

  public void printArray() {
    String output = "";
    for (int r = 0; r < array.length; r++) {
      for (int c = 0; c < array[0].length; c++) {
        output += array[r][c] + "\t";
      }
      output += "\n";
    }
    System.out.println(output);
  }

}