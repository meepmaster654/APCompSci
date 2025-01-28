import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Math;
import java.util.HashMap;
public class AoC {
  public static void main(String[] args) throws FileNotFoundException {
    File textFile = new File("TesfaDay5.txt");
    Scanner userInput = new Scanner(textFile);
    ArrayList<String> linesOfInput = new ArrayList<String>();
    ArrayList<String> linesOfUpdates = new ArrayList<String>();
    while (userInput.hasNextLine()) {
      linesOfInput.add(userInput.nextLine());
      // your code here for the loop to work through the data...
      // will include userInput.nextLine() or some other Scanner method
      // and the method Integer.parseInt(String str) to convert the String
      // to an int
    }
    File updatesFile = new File("tesfaUpdates.txt");
    Scanner updatesScanner = new Scanner(updatesFile);
    while (updatesScanner.hasNextLine()) {
      linesOfUpdates.add(updatesScanner.nextLine());
      // your code here for the loop to work through the data...
      // will include userInput.nextLine() or some other Scanner method
      // and the method Integer.parseInt(String str) to convert the String
      // to an int
    }



    HashMap<Integer,ArrayList<Integer>> numsAfter = new HashMap<>();

    for (int i = 0; i < linesOfInput.size(); i++){
      int num = Integer.parseInt(linesOfInput.get(i).substring(0,2));
      int numAfter = Integer.parseInt(linesOfInput.get(i).substring(3,5));
      if (numsAfter.get(num) == null) {
        numsAfter.put(num, new ArrayList<Integer>());
        numsAfter.get(num).add(numAfter);
      } else  {
        numsAfter.get(num).add(numAfter);
      }
    }
    int sumOfMids = 0;
    for (int i = 0; i < linesOfUpdates.size(); i++) {
      boolean safe = true;
      String[] thisUpdate = linesOfUpdates.get(i).split(",");
      for (int k = 0; k < thisUpdate.length; k++) {
        ArrayList<Integer> afterNumbers = numsAfter.get(Integer.parseInt(thisUpdate[k]));
        for (int z = 0; z < k; z++ ) {
          if (afterNumbers.indexOf(Integer.parseInt(thisUpdate[z])) != -1) {
            safe = false;
          }
        }
      }
      if (safe) {
        sumOfMids += Integer.parseInt(thisUpdate[thisUpdate.length/2]);
        System.out.println(thisUpdate.length + " " + (thisUpdate.length+1)/2);
      }
    }
    System.out.println(sumOfMids);
  }
}
