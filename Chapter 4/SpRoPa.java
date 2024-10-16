import java.util.Scanner;
import java.lang.Math;
public class SpRoPa {
  public static void main(String[] args) {
    //Setup
    Scanner userIn = new Scanner(System.in);
    int gameWins, compWins, meWins, choiceNum;
    System.out.println("How many rounds should it take to win?");
    gameWins = userIn.nextInt();
    compWins = 0;
    meWins = 0;
    String compChoice = "";
    String meChoice;
    
    //Main Code
    while (compWins < gameWins && meWins < gameWins) {
      choiceNum = (int) (Math.random()*3)+1;
      switch(choiceNum) {
        case 1:
          compChoice = "Spartan";
        case 2:
          compChoice = "Rocket";
        case 3:
          compChoice = "Panther";
      }
      System.out.println("Enter Spartan, Rocket, or Panther(Uppercase does matter)");
      meChoice = userIn.next();
      while (!(meChoice.equals("Spartan") || meChoice.equals("Rocket") || meChoice.equals("Panther"))) {
        System.out.println("That wasn't one of the choices");
        System.out.println("Enter Spartan, Rocket, or Panther(Uppercase does matter)");
        meChoice = userIn.next();
      }
      System.out.println("You chose " + meChoice + " and I chose " + compChoice);
      if (meChoice.equals(compChoice)) {
        System.out.println("It was a tie, both mine and your score increaces");
        meWins++;
        compWins++;
      } else if(meChoice.equals("Spartan")) {
        if (compChoice.equals("Panther")) {
          System.out.println("You beat me");
          meWins++;
        } else {
          System.out.println("I win");
          compWins++;
        }
      } else if(meChoice.equals("Rocket")) {
        if (compChoice.equals("Panther")) {
          System.out.println("I win");
          compWins++;
        } else {
          System.out.println("You beat me");
          meWins++;
        }
      } else {
        if (compChoice.equals("Spartan")) {
          System.out.println("I win");
          compWins++;
        } else {
          System.out.println("You beat me");
          meWins++;
        }
      }
   }
  }
}