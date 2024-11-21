/**
 * CompoundWordTester contains a main method to test a CompoundWord object.
 * 
 * The tester constructs a CompoundWord, invokes the findTotalLength,
 * swapWords, setFirstWord, setSecondWord, and toString methods, and
 * prints the results.
 */
public class CompoundWordTester {
  public static void main(String[] args) {
    CompoundWord myWord = new CompoundWord("hot", "dog");
    System.out.println("The length of this compound word is " + myWord.findTotalLength());
    System.out.println(myWord + "\n");
    
    myWord.swapWords();
    System.out.println(myWord + "\n");
    
    myWord.setSecondWord("house");
    System.out.println(myWord + "\n");
    
    myWord.setFirstWord(myWord.getSecondWord());
    System.out.println("The length of this compound word is " + myWord.findTotalLength());
    System.out.println(myWord);
  }
  
}