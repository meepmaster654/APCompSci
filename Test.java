import java.util.*;
public class Test {
  public static void main(String[] args) {  
    System.out.println("This is a test program");
    double x = 3/4.0;
    System.out.println(x);
    Scanner scanObj = new Scanner(System.in);
    
    System.out.println("How queen are you? 1-10");

    float queenValue = scanObj.nextFloat();  // Read user input
    
    System.out.println("you are " + (queenValue*10) + "% Queen");  // Output user input
    
    System.out.println("What is your age?");
    
    byte userAge = scanObj.nextByte();
    
    if (userAge > 16) {
      System.out.println("Your too old");
    } else if (userAge <= 16 && userAge >=13) {
      System.out.println("Tesfa wants you");
    } else {
      System.out.println("Malcolm wants you");
      
    }
  }
}