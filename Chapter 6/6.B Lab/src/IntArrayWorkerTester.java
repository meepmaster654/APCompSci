/**
 * IntArrayWorkerTester contains a number of static methods 
 * and a main method to test an IntArrayWorker object.
 * 
 * The tester invokes the following class methods: testSetMatrix,
 * testFillPattern, testGetTotalFor, testGetTotalForEach, testGetCountFor,
 * testGetCountForEach, testGetLargest, and testGetColTotal.
 */
public class IntArrayWorkerTester {
  /**
   * Tests setMatrix method.
   */
  public static void testSetMatrix() {
    IntArrayWorker worker = new IntArrayWorker();
    int[][] nums = {{1, 1, 1} ,{2,2,2}};
    worker.setMatrix(nums);
    System.out.println("This should have all 1's in first row and all 2's in second");
    worker.print();
  }
  
  /**
   * Tests fillPattern method.
   */
  public static void testFillPattern() {
    IntArrayWorker worker = new IntArrayWorker();
    int[][] nums = new int[3][4];
    worker.setMatrix(nums);
    worker.fillPattern();
    System.out.println("fills with 2's on diagonal, 3's to left, and 1's to right");
    worker.print();
  }
  
  /**
   * Tests getTotalFor method.
   */
  public static void testGetTotalFor() {
    IntArrayWorker worker = new IntArrayWorker();
    int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
    worker.setMatrix(nums2);
    int total = worker.getTotalFor();
    System.out.println("Total should be 21 and is " + total);
  }
  
  /**
   * Tests getTotalForEach method.
   */
  public static void testGetTotalForEach() {
    IntArrayWorker worker = new IntArrayWorker();
    int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
    worker.setMatrix(nums2);
    int total = worker.getTotalForEach();
    System.out.println("Total should be 21 and is " + total);
  }
  
  /**
   * Tests getCountFor method.
   */
  public static void testGetCountFor() {
    IntArrayWorker worker = new IntArrayWorker();
    int[][] nums = new int[3][4];
    worker.setMatrix(nums);
    worker.fillPattern();
    int count = worker.getCountFor(1);
    System.out.println("Count should be 6 and count is " + count);
  }
  
  /**
   * Tests getCountForEach method.
   */
  public static void testGetCountForEach() {
    IntArrayWorker worker = new IntArrayWorker();
    int[][] nums = new int[3][4];
    worker.setMatrix(nums);
    worker.fillPattern();
    int count = worker.getCountForEach(1);
    System.out.println("Count should be 6 and count is " + count);
  }
  
  /**
   * Tests getLargest method.
   */
  public static void testGetLargest() {
    // test when largest is last
    IntArrayWorker worker = new IntArrayWorker();
    int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
    worker.setMatrix(nums2);
    int largest = worker.getLargest();
    System.out.println("Largest should be 6 and is " + largest); 
    // test when largest is first
    int[][] nums3 = {{6, 2, 3}, {4, 5, 1}};
    worker.setMatrix(nums3);
    largest = worker.getLargest();    
    System.out.println("Largest should be 6 and is " + largest); 
    // test when largest is in the middle
    int[][] nums4 = {{1, 2, 3}, {6, 5, 1}};
   worker.setMatrix(nums4);
    largest = worker.getLargest();
   System.out.println("Largest should be 6 and is " + largest);
   // test when duplicate largest
   int[][] nums5 = {{6, 2, 6}, {4, 5, 1}};
    worker.setMatrix(nums5);
    largest = worker.getLargest();
    System.out.println("Largest should be 6 and is " + largest);
  }
  
  /**
   * Tests getColTotal method.
   */
  public static void testGetColTotal() {
    IntArrayWorker worker = new IntArrayWorker();
        int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
   worker.setMatrix(nums2);
    int total = worker.getColTotal(0);
    System.out.println("Total for column 0 should be 5 and is " + total);
    total = worker.getColTotal(1);
    System.out.println("Total for column 1 should be 7 and is " + total);
    total = worker.getColTotal(2);
    System.out.println("Total for column 2 should be 9 and is " + total);
  }
  
  /**
   * Runs tester methods.
   */
  public static void main(String[] args) {
    testSetMatrix();
    testFillPattern();
    testGetTotalFor();
    testGetTotalForEach();
    testGetCountFor();
    testGetCountForEach();
    testGetLargest();
    testGetColTotal();
  }
}