import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Math;

public class AoC {
  public static void main(String[] args) throws FileNotFoundException {
    File textFile = new File("input.txt");
    Scanner userInput = new Scanner(textFile);
    ArrayList<String> levels = new ArrayList<String>();
    while (userInput.hasNextLine()) {
      levels.add(userInput.nextLine());
      // your code here for the loop to work through the data...
      // will include userInput.nextLine() or some other Scanner method
      // and the method Integer.parseInt(String str) to convert the String
      // to an int
    }
    int safeLayers = 0;
    for (int i = 0; i < levels.size(); i++) {
      boolean safe = true;
      String[] lvlSplit = levels.get(i).split(" ");
      int[] lvlNums = new int[lvlSplit.length];
      for (int x = 0; x < lvlSplit.length; x++) {
        lvlNums[x] = Integer.parseInt(lvlSplit[x]);
      }
      boolean increasing = lvlNums[0] < lvlNums[1];
      int last = lvlNums[0];
      String test = "";// !!!!!!
      for (int x = 1; x < lvlNums.length; x++) {
        test += last + " ";// !!!!!
        if (increasing) {
          if (!(lvlNums[x] - last >= 1 && lvlNums[x] - last <= 3)) {
            safe = false;
          }
        } else {
          if (!(last - lvlNums[x] >= 1 && last - lvlNums[x] <= 3)) {
            safe = false;
          }
        }
        last = lvlNums[x];
      }
      System.out.println(test + " " + safe);// !!!!!
      if (safe) {
        safeLayers++;
      }
    }
    System.out.println(safeLayers);
  }
}
