/**
 * ClassVersusInstance demonstrates the use of instance and class
 * variables and methods.
 */
public class ClassVersusInstance {
  // instance variables
  private int privInstVar = 1;
  public int pubInstVar = 2;
  
  // class (static) variables
  private static int privClassVar = 3;
  public static int pubClassVar = 4;
  
  // utilizing default constructor (not shown)
  
  /**
   * Sets all instance and class variables to new values.
   */
  public void setAll() {
    privInstVar *= 10;  //
    privClassVar *= 10; // Object methods can access instance
    pubInstVar *= 10;   // and class variables.
    pubClassVar *= 10;  //
  }
  
  /**
   * Sets all instance and class variables to new values.
   */
  public static void classSetAll() {
//    privInstVar *= 20; // can't compile because class methods can only access class variables
//    pubInstVar *= 20;  // can't compile because class methods can only access class variables
    privClassVar *= 20; 
    pubClassVar *= 20;
  }
  
  /**
   * Returns the values of all instance and class variables.
   * 
   * @return  a string representation of the object and the class
   */
  public String toString() {
    String output = "Inst. variables: " + privInstVar + " " + pubInstVar; // Object methods can access instance
    output += "   Class variables: " + privClassVar + " " + pubClassVar;  // and class variables.
    return output;
  }
  
  /**
   * Returns the values of all instance and class variables.
   * 
   * @return  a string representation of the object and the class
   */
  public static String classToString() {
    String output = "";
//    output += "Inst. variables: " + privInstVar + " " + pubInstVar; // can't compile because class methods
                                                                      // can only access class variables
    output += "Class variables: " + privClassVar + " " + pubClassVar;  
    return output;
  }
}



