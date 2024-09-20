import java.util.Scanner;
public class TwoSevenLab {
  public static void main(String[] args){
    Scanner userIn = new Scanner(System.in);
    System.out.println("Input some text to flip");
    flip(userIn.nextLine());
    System.out.print("Input a bit of text, a word to find, and another word to find");
    statistics(userIn.nextLine(), userIn.nextLine(), userIn.nextLine());
    System.out.println("Input a string of text, a word to replace & pivot around, and the word to replace it with");
    myReplaceFirst(userIn.nextLine(), userIn.nextLine(), userIn.nextLine());
    String[] madLibWords = {"Relative","Adjective","Adjective","Adjective","Name of Person in Room","Adjective","Adjective","Verb Ending in \"ing\"","TYPE OF RELATIVE (brother, aunt, etc.)","Your Name"};
    for (int i = 0; i < 10; i++) {
      System.out.println("Type an " + madLibWords[i]);
      madLibWords[i] = userIn.nextLine();
    }
    madLib(madLibWords);
  }
  static void flip(String toFlip) {
    String firstHalf, secondHalf;
    firstHalf = toFlip.substring(0,toFlip.length()/2);
    secondHalf = toFlip.substring(toFlip.length()/2,toFlip.length());
    System.out.println(secondHalf + firstHalf);
  }
  static void statistics(String mainText, String wordOne, String wordTwo) {
    System.out.println("The index of " + wordOne + " is " + mainText.indexOf(wordOne));
    System.out.println("You might have thought the index was " + (mainText.indexOf(wordOne)+1));
    System.out.println("The index of " + wordTwo + " is " + mainText.indexOf(wordTwo));
    System.out.println("You might have thought the index was " + (mainText.indexOf(wordTwo)+1));
    System.out.println("The length of the text is " + mainText.length() + " characters long");
    System.out.println("The length of " + wordOne + " and " + wordTwo + " is " + (wordOne.length() + wordTwo.length()) + " characters long");
  }
  static void myReplaceFirst(String ogString, String toReplace, String replacement) {
    String revisedText, pivotText;
    revisedText = ogString.substring(0, ogString.indexOf(toReplace)) + replacement + ogString.substring(ogString.indexOf(toReplace)+toReplace.length(), ogString.length()  - 1);
    pivotText = ogString.substring(ogString.indexOf(toReplace)+toReplace.length(), ogString.length()  - 1) + replacement + ogString.substring(0, ogString.indexOf(toReplace));
    System.out.println("Revised string: " + revisedText);
    System.out.println("Pivoted string: " + pivotText);
    System.out.println("The length of the original string is " + ogString.length());
    System.out.println("The lengths of the new strings are " + revisedText.length());
  }
  static void madLib(String[] words) {
    System.out.println("Dear " +  words[0] + ",");
    System.out.println("I am having a(n) " + words[1] + " time at camp. The counselor is " +  words[2] + "  and the food");
    System.out.println("is " + words[3] + ".  I met " + words[4] + " and we became " + words[5] + " friends. Unfortunately,");
    System.out.println(words[4] + " is " +  words[6] + " so we couldn’t go " + words[7] + " like everybody else.");
    System.out.println("Your " + words[8] + ",");
    System.out.println(words[9]);
  }
}
