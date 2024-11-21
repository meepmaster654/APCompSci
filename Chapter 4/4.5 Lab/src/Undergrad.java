/**
 * An undergrad is a college student who has not yet completed a bachelor's
 * degree.
 */
public class Undergrad {
  // instance variables
  private String name = null;
  private int test1 = 0;
  private int test2 = 0;
  private int test3 = 0;
  private int testsTaken = 0;

  /**
   * Constructs an Undergrad object by initializing name.
   *
   * @param aName the name of this undergrad
   */

  public Undergrad(String name) {
    this.name = name;
    testsTaken = 0;
  }

  /**
   * Constructs an Undergrad object by initializing name and one test score.
   * 
   * @param aName  the name of this undergrad
   * @param aTest1 the score for the first test
   */

  public Undergrad(String name, int test1) {
    this.name = name;
    this.test1 = test1;
    testsTaken = 1;
  }

  /**
   * Constructs an Undergrad object by initializing name and two test scores.
   * 
   * @param aName  the name of this undergrad
   * @param aTest1 the score for the first test
   * @param aTest2 the score for the second test
   */

  public Undergrad(String name, int test1, int test2) {
    this.name = name;
    this.test1 = test1;
    this.test2 = test2;
    testsTaken = 2;
  }

  /**
   * Constructs an Undergrad object by initializing name and three test scores.
   * 
   * @param aName  the name of this undergrad
   * @param aTest1 the score for the first test
   * @param aTest2 the score for the second test
   * @param aTest3 the score for the third test
   */

  public Undergrad(String name, int test1, int test2, int test3) {
    this.name = name;
    this.test1 = test1;
    this.test2 = test2;
    this.test3 = test3;
    testsTaken = 3;
  }

  /**
   * Returns this undergad's name.
   * 
   * @return the name of this undergrad
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the first test score.
   *
   * @return the first test score
   */
  public int getTest1() {
    return test1;
  }

  /**
   * Returns the second test score.
   *
   * @return the second test score
   */
  public int getTest2() {
    return test2;
  }

  /**
   * Returns the third test score.
   *
   * @return the third test score
   */
  public int getTest3() {
    return test3;
  }

  /**
   * Adds new test to appropriate instance variable, if possible.
   * 
   * @param nextTest the next test score to be entered
   */

  public void addTest(int nextTest) {
    switch (testsTaken) {
      case 0:
        test1 = nextTest;
        break;
      case 1:
        test2 = nextTest;
        break;
      case 2:
        test3 = nextTest;
        break;
      default:
        System.out.println("Error: All Tests Have Been Taken");
        break;
    }
  }

  /**
   * Returns test average if number of tests is greater than 0; otherwise returns
   * 0.0.
   * 
   * @return average of all test scores, if there is at least one test;
   *         otherwise 0.0
   */
  public double calculateAverage() {
    switch (testsTaken) {
      case 0:
        return 0;
      case 1:
        return test1;
      case 2:
        return (test1 + test2)/(double)2;
      default:
        return (test1 + test2 + test3)/(double) 3;
    } }

  /**
   * Returns the name and current average of this undergrad.
   * 
   * @return a string representation of the object
   */
  public String toString() {
    return "Name: " + name + ", Current Average: " + calculateAverage();
  }

}