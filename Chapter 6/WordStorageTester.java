import java.util.Scanner;

public class WordStorageTester {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    WordStorage myWords = new WordStorage(6); // tests the constructor (part (a)) 1 point
    boolean getAnotherWord = true;
    
    // repeatedly asks for user input of words, until addWord returns false
    while (getAnotherWord == true) {
      System.out.print("Enter a word: ");
      getAnotherWord = myWords.addWord(userInput.next()); // tests the addWord method (part (c))
    }
    System.out.println(myWords); // tests the toString method (part (d))
    
    System.out.println("Total letters: " + myWords.getLetterTotal()); // tests the getLetterTotal method (part (e))
    
    System.out.println("\nAcronym: " + myWords.getAcronym()); // tests the getAcronym method (part (f))
    
    myWords.resetWords(3, 5); // retests the resetWords method (part (b)) 1 point
    System.out.println("\n" + myWords);

    System.out.println("\nAcronym: " + myWords.getAcronym()); // tests the getAcronym method with empty elements (part (f))
  }
}