import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Math;

public class AoC {
  public static void main(String[] args) throws FileNotFoundException {
    File textFile = new File("inputTesfa.txt");
    Scanner userInput = new Scanner(textFile);
    ArrayList<String> lines = new ArrayList<String>();
    while (userInput.hasNextLine()) {
      lines.add(userInput.nextLine());
      // your code here for the loop to work through the data...
      // will include userInput.nextLine() or some other Scanner method
      // and the method Integer.parseInt(String str) to convert the String
      // to an int
    }
    /* Save all - horizontals
     * Save all \ diagonals
     * Save all / diagonals
     * Save all | verticals
     * check all for XMAS or SAMX
     */
    ArrayList<String> possibilities = new ArrayList<String>();
    // - Horizontals - 
    /* 
    PART ONE
    for (int i = 0; i < lines.size(); i++) {
      for (int x = 0; x < lines.get(i).length()-3; x++) {
        possibilities.add(lines.get(i).substring(x,x+4));
      }
    }
    // \ Diagonals \ 
    PART ONE
    for (int i = 0; i < lines.size()-3; i++) {
      for (int x = 0; x < lines.get(i).length()-3; x++) {
        String thisDiagonal = "";
        thisDiagonal += lines.get(i).charAt(x);
        thisDiagonal += lines.get(i+1).charAt(x+1);
        thisDiagonal += lines.get(i+2).charAt(x+2);
        thisDiagonal += lines.get(i+3).charAt(x+3);
        possibilities.add(thisDiagonal);
      }
    }
    // / Diagonals /
    for (int i = 0; i < lines.size()-3; i++) {
      for (int x = 3; x < lines.get(i).length(); x++) {
        String thisDiagonal = "";
        thisDiagonal += lines.get(i).charAt(x);
        thisDiagonal += lines.get(i+1).charAt(x-1);
        thisDiagonal += lines.get(i+2).charAt(x-2);
        thisDiagonal += lines.get(i+3).charAt(x-3);
        possibilities.add(thisDiagonal);
      }
    }

    // | Verticals |
    for (int i = 0; i < lines.size()-3; i++) {
      for (int x = 0; x < lines.get(i).length(); x++) {
        String thisDiagonal = "";
        thisDiagonal += lines.get(i).charAt(x);
        thisDiagonal += lines.get(i+1).charAt(x);
        thisDiagonal += lines.get(i+2).charAt(x);
        thisDiagonal += lines.get(i+3).charAt(x);
        possibilities.add(thisDiagonal);
      }
    }
    */
    // 3 by 3 Squares (pt 2)
    for (int i = 0; i < lines.size()-2; i++) {
      for (int x = 0; x < lines.get(i).length()-2; x++) {
        String thisSquare = "";
        thisSquare += lines.get(i).substring(x,x+3);
        thisSquare += lines.get(i+1).substring(x,x+3);
        thisSquare += lines.get(i+2).substring(x,x+3);
        possibilities.add(thisSquare);
      }
    }
    int numFound = 0;
    ArrayList<String> tester = new ArrayList<String>();
    for (int i = 0; i < possibilities.size(); i++){
      String diaOne, diaTwo;
      diaOne = possibilities.get(i).substring(0,1) + possibilities.get(i).charAt(4) + possibilities.get(i).charAt(8);
      diaTwo = possibilities.get(i).substring(2,3) + possibilities.get(i).charAt(4) + possibilities.get(i).charAt(6);
      System.out.println(diaOne + " " + diaTwo);
      if ((diaOne.equals("SAM") || diaOne.equals("MAS") )&& (diaTwo.equals("SAM") || diaTwo.equals("MAS")) ) {
        numFound++;
        tester.add(diaOne + " " + diaTwo);
      }
    }
    System.out.println(possibilities);
    System.out.println(tester);
    System.out.println(possibilities.size());
    System.out.println(numFound);
  }
}
