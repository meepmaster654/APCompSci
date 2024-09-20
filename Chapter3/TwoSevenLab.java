import java.util.Scanner;
public class TwoSevenLab {
  public static void main(String[] args){
    Scanner userIn = new Scanner(System.in);
    flip(userIn.nextLine());
    statistics(userIn.nextLine(), userIn.nextLine(), userIn.nextLine());
  }
  static void flip(String toFlip) {
    String firstHalf, secondHalf;
    firstHalf = toFlip.substring(0,toFlip.length()/2);
    secondHalf = toFlip.substring(toFlip.length()/2,toFlip.length());
    System.out.println(secondHalf + firstHalf);
  }
  static void statistics(String mainText, String wordOne, String wordTwo) {
    System.out.println("The index of " + wordOne + " is " + mainText.indexOf(wordOne));
    System.out.println("You might have thought the index was " + (mainText.indexOf(wordOne)+1);
    System.out.println("The index of " + wordTwo + " is " + mainText.indexOf(wordTwo));
    System.out.println("You might have thought the index was " + (mainText.indexOf(wordTwo)+1);
    System.out.println("The length of the text is " + mainText.length() + " characters long");
    System.out.println("The length of " + wordOne + " and " + wordTwo + " is " (wordOne.length() + wordTwo.length()) + " characters long");
  }
  static void myReplaceFirst(String ogString, String toReplace, String, replacement) {
    String revisedText, pivotText;
    revisedText = ogString.subString(0, ogString.indexOf(toReplace))) + toReplace + ogString.substring((ogString.indexOf(toReplace)+toReplace.length, ogString.length()  - 1);
    System.out.println("Revised string: " + revisedText);
    System.out.println("Pivoted string: " + pivotedText);
    System.out.println("The length of the original string is " + ogString.length());
    System.out.println("The lengths of the new strings are " + revisedText.length());
  }
}
