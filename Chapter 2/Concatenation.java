// Examples of concatenation
// Adapted from Listing 2.2 and Listing 2.3 on pages 58 and 59

public class Concatenation
{
  public static void main(String[] args)
  {
    // Concatenating two Strings
    System.out.println("We present the" + " following facts:");
    
    // Concatenating a String and an integer as a String
    System.out.println("Letters in the Hawaiian alphabet: " + "12");
    
    // Concatenating a String and an integer
    System.out.println("Dialing code for Antarctica: " + 672);
    
    // Concatenating a String and two integers
    System.out.println("Year of Independence: " + 17 + 76);
    
    // Concatenating a String and two added integers
    System.out.println("Year Leonardo invented parachute: " + (1000 + 515));
    
    // Add integers, then concatenate with a String and two integers
    System.out.println(180 + 185 + " days in a year " + 36 + 5);
    
    // Add integers, then concatenate with a String and two integers
    System.out.println("52" + "80" + " feet in a mile " + (5200 + 80));
    
    // Add integers, then concatenate with a String and two integers
    System.out.println("" + 12 + 8 + " ounces in a gallon " + 1 + 28);

  }
}