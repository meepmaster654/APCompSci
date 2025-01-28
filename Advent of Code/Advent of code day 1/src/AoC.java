import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Math;

public class AoC {
  public static void main(String[] args) throws FileNotFoundException {
    File textFile = new File("input.txt");
    Scanner userInput = new Scanner(textFile);
    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<Integer> col1 = new ArrayList<Integer>();
    ArrayList<Integer> col2 = new ArrayList<Integer>();
    while (userInput.hasNextLine()) {
      lines.add(userInput.nextLine());
      // your code here for the loop to work through the data...
      // will include userInput.nextLine() or some other Scanner method
      // and the method Integer.parseInt(String str) to convert the String
      // to an int
    }
    for (int i = 0; i < lines.size(); i++) {
      col1.add(Integer.parseInt(lines.get(i).substring(0, 5)));
      col2.add(Integer.parseInt(lines.get(i).substring(8)));
    }
    /*
     * PART ONE
     * col1.sort(null);
     * col2.sort(null);
     * int output = 0;
     * for (int i = 0; i < col1.size(); i++) {
     * output += Math.abs(col1.get(i)-col2.get(i));
     * }
     * System.out.println(output);
     */
    int simScore = 0;
    for (int i = 0; i < col1.size(); i++) {
      simScore += col1.get(i) * findOccurrencesOf(col1.get(i), col2);
    }
    System.out.println(simScore);
    // your code here to print the results…
  }

  static int findOccurrencesOf(int element, ArrayList<Integer> inList) {
    int output = 0;
    for (int i = 0; i < inList.size(); i++) {
      if (inList.get(i) == element) {
        output++;
      }
    }
    return output;
  }
}
