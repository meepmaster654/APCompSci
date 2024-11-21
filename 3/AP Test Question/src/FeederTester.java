import java.util.Scanner;

/**
 * FeederTester contains a main method to test a Feeder object.
 * 
 * The tester constructs a Feeder object and repeatedly invokes the
 * simulateManyDays method.
 */
public class FeederTester {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("To exit this simulation at any time,");
    System.out.println(" enter a negative number for food, birds, or days.\n");
    while (true) {
      System.out.print("Enter the initial bird feeder food in grams: ");
      int initialFood = userInput.nextInt();
      if (initialFood < 0) {
        break;
      }

      System.out.print("Enter the number of birds at the feeder: ");
      int initialBirds = userInput.nextInt();
      if (initialBirds < 0) {
        break;
      }

      System.out.print("Enter the number of days to siumulate: ");
      int initialDays = userInput.nextInt();
      if (initialDays < 0) {
        break;
      }

      Feeder myFeeder = new Feeder(initialFood);
      System.out.println(myFeeder.simulateManyDays(initialBirds, initialDays));
    }

    userInput.close();

  }
}
