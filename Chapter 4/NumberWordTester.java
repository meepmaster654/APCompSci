/**
 * NumberWordTester contains a main method to test NumberWord objects.
 * 
 * The tester constructs two NumberWord objects, invokes the getNumber, setNumber,
 * getWord, setWord, multiplyWord, overloaded multiplyWord, and toString methods,
 * and prints the results.
 */
public class NumberWordTester {
  public static void main(String[] args) {
    // tests constructor, getWord, and default multiplyWord methods
    NumberWord combo1 = new NumberWord(4, "Super");
    System.out.println("getWord(): " + combo1.getWord());
    System.out.println("multiplyWord(): " + combo1.multiplyWord());
    
    // tests overloaded constructor, getNumber, and toString methods
    NumberWord combo2 = new NumberWord("Funny");
    System.out.println("\ngetNumber(): " + combo2.getNumber()); // Randomly generated number will likely not match 
    System.out.println("toString: " + combo2);                  // suggested output in directions in these two lines
    
    // tests setNumber, setWord, and overloaded multiplyWord methods
    combo2.setNumber(3);
    combo2.setWord("Bright");
    System.out.println("\nmultiplyWord(): " + combo2.multiplyWord(5));
  }
}