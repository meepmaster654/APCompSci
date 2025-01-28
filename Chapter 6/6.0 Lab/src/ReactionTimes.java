import java.util.Scanner;

/**
 * ReactionTimes contains a main method to construct an array to hold the reaction
 * times of the user in a game.  The method finds the average of these reaction
 * times and prints it out.
 */
public class ReactionTimes {
  public static void main(String[] args) {
    // 1. Create a Scanner object.
    Scanner in = new Scanner(System.in);

    
    // 2. Declare and instantiate an array called "times" that contains 5 double elements.
    //    Don't initialize any values yet.
    double[] times = new double[5];

    
    // 3. Create a for loop that will fill the times array with values.
    //    Each time the for loop is iterated, ask the user for their reaction time.
    
    for (int i = 0; i < times.length-1; i++) {
      System.out.println("Input a dbouel")
      times[i] = in.nextDouble();
    }
    
    // 4. Create a double variable called firstAverage that will contain the average reaction time of the user.
    //    Use a for each loop to calculate and store firstAverage.
    double sum = 0;
    for (double s: times) {
      sum += s;
    }
    double firstAverage = sum/times.length;
    
    // 5. Print a message stating the first average reaction times of the user.
    System.out.println("Average: " + firstAverage);
                       
    // 6. Create a for loop that will fill the times array with new values.
    //    Each time the for loop is iterated, ask the user for their reaction time.
    
    for (int i = 0; i < times.length-1; i++) {
      times[i] = in.nextDouble();
    }
        
    // 7. Create a double variable called secondAverage that will contain the new average reaction time of the user.
    //    Use a for-each loop to calculate and store secondAverage.
    sum = 0;
    for (double s: times) {
      sum += s;
    }
    double secondAverage = sum/times.length;
    
    // 8. Print a message stating the second average reaction times of the user.
    System.out.println("Average: " + secondAverage);
    
  }
}