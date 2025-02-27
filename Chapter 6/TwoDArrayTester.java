/**
 * TwoDArrayTester contains a main method to test a TwoDArray object.
 * 
 * The tester constructs a TwoDArray object, invokes the equals, transpose
 * and printArray methods, and thereby prints any results.
 */
public class TwoDArrayTester {
  public static void main(String[] args) {
    TwoDArray myArray = new TwoDArray(4, 6, 1, 3);
    myArray.printArray();
    System.out.println();
    
    int[][] otherArray = {{4,3,2,1,2,3}, {3,2,1,0,1,2}, {4,3,2,1,2,3}, {5,4,3,2,3,4}};
    System.out.println("myArray equals otherArray: " + myArray.equals(otherArray));
    int[][] anotherArray = {{4,3,2,1,2,3,0}, {3,2,1,0,1,2,0}, {4,3,2,1,2,3,0}, {5,4,3,2,3,4,0}};
    System.out.println("myArray equals anotherArray: " + myArray.equals(anotherArray) + "\n");
    
    myArray.transpose();
    myArray.printArray();

    System.out.println("\nmyArray equals otherArray: " + myArray.equals(otherArray));

  }
}