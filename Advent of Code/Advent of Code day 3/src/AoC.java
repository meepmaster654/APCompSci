import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Math;

public class AoC {
  public static void main(String[] args) throws FileNotFoundException {
    File textFile = new File("input.txt");
    Scanner userInput = new Scanner(textFile);
    
    String input = "";
    while (userInput.hasNextLine()) {
      input += userInput.nextLine();
      // your code here for the loop to work through the data...
      // will include userInput.nextLine() or some other Scanner method
      // and the method Integer.parseInt(String str) to convert the String
      // to an int
    }

    /*
    find instance of mul done
    get 12 characters  mul(num,num) done
    check if works
    cut from main string done
    repeat done
    */
    int output = 0;
    while (input.indexOf("mul(") != -1) {
      //find instance of mul
      int index = input.indexOf("mul(");
      //clip instance of mul
      String clippedString = "";
      clippedString = input.substring(index, index+12);
      input = input.substring(input.indexOf(")"));
      //delete input before mul
      
      //multiply the 2 nubers if the mul is not corrupt
      if (clippedString.indexOf(")") != -1 && clippedString.indexOf(",") != -1) {
        clippedString = clippedString.substring(clippedString.indexOf("(")+1,clippedString.indexOf(")"));
        System.out.println(clippedString);//TEST
        String[] numsToMul = clippedString.split(",");
        System.out.println(numsToMul[0] +  " " + numsToMul[1]);//TEST
        output += Integer.parseInt(numsToMul[0]) * Integer.parseInt(numsToMul[1]);
      }
    }
    System.out.println(output);

  }
}
