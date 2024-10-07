import java.util.Scanner;
import java.lang.Math;

public class notesCheckThree {
  public static void main(String[] args){
    //Guess the number
    Scanner in = new Scanner(System.in);
    System.out.println("Pick a number between 1 & 3");
    int userNumber = (int) in.nextDouble();
    if (userNumber <= 3 && userNumber >= 1) {
      int compNum = (int) (Math.random() *3 + 1);
      if (userNumber == compNum) {
        System.out.println("Your number is equal to the computers");
      } else if (userNumber > compNum) {
        System.out.println("Your number is greater than the computers");
      } else {
        System.out.println("Your number is less then the computers");
      }
    } else {
      System.out.println("Thats not a number between 1 & 3");
    }
    //Double Flip
    System.out.println("Pick one for heads and two for tails \n There will be two coin flips");
    int guessOne = in.nextInt();
    int guessTwo = in.nextInt();
    int flipOne = (int) (Math.random() *2 + 1);
    int flipTwo = (int) (Math.random() *2 + 1);
    if (guessOne != 1 && guessOne != 2 || guessTwo != 1 && guessTwo != 2) {
      System.out.println("You inputed a number not between one and two");
    } else {
      if (guessOne == flipOne) {
        System.out.println("You got the first flip right!");
      } else {
        System.out.println("You got the first flip wrong");
      }
      if (guessTwo == flipTwo) {
        System.out.println("You got the second flip right!");
      } else {
        System.out.println("You got the second flip wrong");
      }
    }
  }
}