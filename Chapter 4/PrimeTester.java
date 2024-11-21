// Will Leasure

import java.util.Scanner;

public class PrimeTester {
  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);
    System.out.println("Enter a number to find its factors and see if its prime (0 to cancel)");
    int numberInput = userIn.nextInt();
    while (numberInput != 0) {
      int factorsAmount = 0;
      String factors =  "";
      for (int i = 1; i <= numberInput; i++) {
        if (numberInput % i == 0) {
          factorsAmount++;
          factors += i + " ";
        }
      }
      System.out.println("The factors of " + numberInput + " are: " + factors);
      if (factorsAmount == 2) {
        System.out.println(numberInput + " has " + factorsAmount + " factors, so it is prime");
      } else if (factorsAmount > 2) {
        System.out.println(numberInput + " has " + factorsAmount + " factors, so it is composite");
      } else {
        System.out.println(numberInput + " has " + factorsAmount + " factors, so it is neither prime nor composite");
      }
      System.out.println("Enter another number to test (0 to stop)");
      numberInput = userIn.nextInt();
    }
  }
}