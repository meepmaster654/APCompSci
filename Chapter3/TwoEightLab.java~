import java.lang.Math;
import java.util.Scanner;
public class TwoEightLab {
  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);
    System.out.println("Input radius of sphere");
    sphere(userIn.nextDouble());
    System.out.println("Input the first x value, the first y value, the second x value, and the second y value");
    distance(userIn.nextDouble(),userIn.nextDouble(),userIn.nextDouble(),userIn.nextDouble());
    System.out.println("Here is your phone number");
    phoneNumber();
  }
  static void sphere(double radius) {
    double volume = (double) 4/(double)3*(Math.PI*(Math.pow(radius,3)));
    double surfaceArea = (double) 4 * (Math.PI*(Math.pow(radius,2)));
    System.out.println("Radius: " + radius);
    System.out.println("Volume " + volume);
    System.out.println("Surface Area: " + surfaceArea);
  }
  static void distance(double xOne, double yOne, double xTwo, double yTwo) {
    final double dist = Math.hypot((xTwo - xOne), (yTwo - yOne));
    System.out.println("The distance between (" + xOne + ", " + yOne + ") and (" + xTwo + ", " + yTwo + ") is: " + dist);
  }
  static void phoneNumber() {
    String phoneNum = "";
    for (int i = 0; i < 9; i++) {
      phoneNum = phoneNum + String.valueOf((int) (Math.random() * 10));
    }
    System.out.println(phoneNum);
  }
}
