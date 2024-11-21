/**
 * A student has a name, grade, gpa, number of classes, email address, and energy.
 */
public class Student {
  // instance variables
  private String name = null;
  private int grade = 0;
  private double gpa = 0.0;
  private int classes = 0;
  private String email = null;
  private int energy = 0;
  private Address house;
  
  /**
   * Constucts a Student object by storing all parameters as instance variables and setting energy to 30.
   * 
   * @param aName     the name of this student
   * @param aGrade    the current grade (0-12)
   * @param aGpa      the current GPA
   * @param aClasses  the current number of classes being taken
   * @param anEmail   the email address of this student
   */
  public Student(String aName, int aGrade, double aGpa, int aClasses, String anEmail, Address house) {
    name = aName;
    grade = aGrade;
    gpa = aGpa;
    classes = aClasses;
    email = anEmail;
    energy = 30;
    this.house = house;
  }
  
  /**
   * Returns this student's name.
   * 
   * @return  the name of this student
   */
  public String getName() {
    return name;
  }

  /**
   * Returns current grade level.
   *
   * @return  the current grade level
   */
  public int getGrade() {
    return grade;
  }
  
  /**
   * Iterates grade positively one year.
   */
  public void advanceGrade() {
    grade++;
    energy -= 3;
  }
  
  /**
   * Returns current GPA.
   *
   * @return  the current GPA
   */
  public double getGpa() {
    return gpa;
  }
  
  /**
   * Returns the current number of classes. 
   *
   * @return  the number of classes being taken
   */
  public int getClasses() {
    return classes;
  }
  
  /**
   * Adds parameter to classes, if classes remain less than or equal to 7.
   * Results in a loss of energy equal to 3.
   *
   * @param additionalClasses  the number of classes to be added
   */
  public void addClass(int additonalClasses) {
    if (additonalClasses + classes > 7) {
      System.out.println("You can't add that many classes.");
    } else {
      classes = additonalClasses + classes;
    }
    energy -= 3;
  }
  
  /** 
   * Removes parameter from classes, if classes remain above 6.
   * Results in a loss of energy equal to 3.
   * 
   * @param dropClasses  the number of classes to be dropped
   */
  public void dropClass(int drop) {
    if (classes - drop < 6) {
      System.out.println("Stay in school.");
    } else {
      classes = classes - drop;
    }
    energy -= 3;
  }
  
  /** 
   * Returns email address.
   * 
   * @return the email address of this student
   */
  public String getEmail() {
    return email;
  }
  
  /** Returns energy level.
    * 
    * @return  the current energy level
    */
  public int getEnergy() {
    return energy;
  }
  
  /** 
   * Returns all pertinent data for this student.
   * 
   * @return  a string representation of the object. 
   */
  public String toString() {
    String result = name + ", grade " + grade + "\n";
    result += "GPA: " + gpa + ", number of classes: " + classes + "\n";
    result += email + ", energy: " + energy;
    result += ", Address" + house;
    return result;
  }
  
}