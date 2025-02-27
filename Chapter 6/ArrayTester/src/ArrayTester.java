
/**
 * ArrayTester contains static methods that can be used to analyze 1D and 2D
 * arrays.
 */
import java.util.Arrays;

public class ArrayTester {
  /**
   * Returns an array containing the elements of column c of arr2D in the same
   * order as they appear in arr2D.
   * Precondition: c is a valid column index in arr2D
   * Postcondition: arr2D is unchanged
   * 
   * @param arr2D the 2D array to be searched
   * @param c     the column to be returned
   */
  public static int[] getColumn(int[][] arr2D, int c) {
    int[] out = new int[arr2D.length];
    for (int i = 0; i < arr2D.length; i++) {
      out[i] = arr2D[i][c];
    }
    return out;
  }

  /**
   * Returns true if and only if every value in arr1 appears in arr2.
   * Precondition: arr1 and arr2 have the same length
   * Postcondition: arr1 and arr2 are unchanged
   * Not implemented in the original AP question.
   * 
   * @param arr1 the first array to be compared
   * @param arr2 the second array to be compared
   */
  public static boolean hasAllValues(int[] arr1, int[] arr2) {
    boolean output = true;
    for (int i = 0; i < arr1.length; i++) {
      boolean valueIsFound = false;
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          valueIsFound = true;
        }
      }
      if (!valueIsFound) {
        return false;
      }
    }
    return output;
  }

  /*
   * public static boolean hasAllValues(int[] arr1, int[] arr2) {
   * Arrays.sort(arr1);
   * Arrays.sort(arr2);
   * return Arrays.equals(arr1, arr2);
   * }
   */
  /**
   * Returns true if arr contains any duplicate values; false otherwise.
   * Not implemented in the original AP question.
   * 
   * @param arr the array to be analyzed
   */
  public static boolean containsDuplicates(int[] arr) {
    boolean output = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          output = true;
        }
      }
    }
    return output;
  }

  /**
   * Returns true if square is a Latin square as described in part (b);
   * false otherwise.
   * Precondition: square has an equal number of rows and columns.
   * square has at least one row.
   * 
   * @param square the 2D array to be analyzed
   */
  public static boolean isLatin(int[][] square) {
    int[] first = square[0];
    if (containsDuplicates(first)) {
      return false;
    }
    for (int i = 0; i < square.length; i++) {
      if (!hasAllValues(square[i], first)) {
        return false;
      }

    }
    for (int i = 0; i < square.length; i++) {
      int[] column = getColumn(square, i);
      if (!hasAllValues(column, first)) {
        return false;
      }
    }
    return true;
  }

}