/**
 * The Feeder class simulates a bird feeder in tracking the level of bird food
 * remaining per day.
 */
public class Feeder {
  /**
   * The amount of food, in grams, currently in the bird feeder; initialized in
   * the constructor and always greater than or equal to zero.
   */
  private int currentFood;

  /**
   * Instantiates current food in this feeder.
   * Not included in the original AP question.
   * 
   * @param theCurrentFood  the initial food in the feeder
   */
  public Feeder(int theCurrentFood) {
    currentFood = theCurrentFood;
  }

  /**
   * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
   * as described in part (a).
   * Precondition: numBirds > 0
   * 
   * @param numBirds the number of birds visiting the feeder each day
   */
  public void simulateOneDay(int numBirds){
    if (Math.random() > .95) {
      currentFood = 0;
    }
    int foodEaten = ((int) (Math.random() * 41) + 10)*numBirds;
    if (foodEaten > currentFood) {
      currentFood = 0;
    } else {
      currentFood -= foodEaten;
    }
   }


  /**
   * Returns the number of days birds or a bear found food to eat at the feeder in
   * this simulation, as described in part (b).
   * Preconditions: numBirds > 0, numDays > 0
   * 
   * @param numBirds the number of birds visiting the feeder each eay
   * @param numDays  the number of days to be siumlated
   * @return         the number of days some food was found in the feeder 
   */
  public int simulateManyDays(int numBirds, int numDays) {
    for (int i = 0; i < numDays; i++) {
      if (currentFood != 0) {
        simulateOneDay(numBirds);
      } else {
        return 0;
      }
    }
    return currentFood;
  }
  

}
