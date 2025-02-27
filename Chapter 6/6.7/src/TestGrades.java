import java.util.ArrayList;

/**
 * TestGrades contains a main method to construct and manipulate ArrayLists.
 */
public class TestGrades {
  public static void main(String[] args) {
    // Make an empty ArrayList that will hold the test grades of a class (grades
    // will be Doubles)
    ArrayList<Double> grades = new ArrayList<Double>();

    // Add five grades to the list
    for (int i = 1; i <= 10000; i++) {
      grades.add(Math.random() * 100);
    }

    // Calculate the average (double) test grade
    // Use a for-each loop to do this
    double average = 0;
    for (int i = 0; i < grades.size(); i++) {
      average += grades.get(i);
    }
    average /= (double) grades.size();
    // Find the lowest score
    // Use a for loop to do this

    double min = Integer.MAX_VALUE;
    for (int i = 0; i < grades.size(); i++) {
      if (grades.get(i) < min) {
        min = grades.get(i);
      }
    }
    // Find the highest score
    // Use a for-each loop to do this

    double max = Integer.MIN_VALUE;
    for (double i : grades) {
      if (i > max) {
        max = i;
      }
    }
    // Print all the info
    System.out.println("There are " + grades.size() + " students in this class.");
    System.out.println("The class average was " + average);
    System.out.println("The lowest score was " + min);
    System.out.println("The highest score was " + max);

    String[] gradeAmt = new String[5];

    gradeAmt[0] = "A: ";
    gradeAmt[1] = "B: ";
    gradeAmt[2] = "C: ";
    gradeAmt[3] = "D: ";
    gradeAmt[4] = "F: ";
    for (double i : grades) {
      if (i >= 90) {
        gradeAmt[0] += "*";
      } else if (i >= 80) {
        gradeAmt[1] += "*";
      } else if (i >= 70) {
        gradeAmt[2] += "*";
      } else if (i >= 60) {
        gradeAmt[3] += "*";
      } else {
        gradeAmt[4] += "*";
      }

    }
    for (String i : gradeAmt) {
      System.out.println(i);
    }

    // Print out a graph to show grade distribution like so:
    // A: *****
    // B: ***
    // C: *
    // D:
    // F: *
    // It should still print the correct graph if you change some of the values in
    // the ArrayList

  }
}
