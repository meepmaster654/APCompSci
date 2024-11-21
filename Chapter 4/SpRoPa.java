import java.util.Scanner;
import java.lang.Math;
public class SpRoPa {
  public static void main(String[] args) {
    //Setup
    Scanner userIn = new Scanner(System.in);
    int gameWins, compWins, meWins;
    System.out.println("How many rounds should it take to win?");
    gameWins = userIn.nextInt();
    compWins = 0;
    meWins = 0;
    String meChoice;
    String compChoice = "";
    String choiceAnalyze = "";
    
    //Main Code
    while (compWins < gameWins && meWins < gameWins) {
      int choiceNum = (int) (Math.random()*3)+1;
      //Determine comp choice
      switch(choiceNum) {
        case 1:
          compChoice = "Spartan";
          choiceAnalyze += " Spartan";
          break;
        case 2:
          compChoice = "Rocket";
          if (choiceAnalyze.indexOf("S") != -1) {
            choiceAnalyze = choiceAnalyze.substring(0,choiceAnalyze.indexOf("S"))  + "Rocket " + choiceAnalyze.substring(choiceAnalyze.indexOf("S"), choiceAnalyze.length());
          } else {
            choiceAnalyze += "Rocket ";
          }
          break;
        case 3:
          compChoice = "Panther";
          choiceAnalyze = "Panther " + choiceAnalyze;
          break;
      }
      System.out.println("Enter Spartan, Rocket, or Panther(Uppercase does matter)"); //This makes sure the user dosent type something that the computer cant take
      meChoice = userIn.next();
      while (!(meChoice.equals("Spartan") || meChoice.equals("Rocket") || meChoice.equals("Panther"))) {
        System.out.println("That wasn't one of the choices");
        System.out.println("Enter Spartan, Rocket, or Panther(Uppercase does matter)");
        meChoice = userIn.next();
      }//this makes sure the user inputs something that works
      System.out.println("You chose " + meChoice + " and I chose " + compChoice);
      //Determine winner
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
    //end game print
    System.out.println("The score was You: " + meWins + " Me: " + compWins);
    System.out.println("Computer choice analysis: " + choiceAnalyze);
  }
}