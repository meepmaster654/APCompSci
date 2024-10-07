import java.util.Scanner;
import java.lang.Math;
public class Sigma {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String sentence = in.nextLine();
    String[] sigma = sentence.split(" ");
    System.out.println(sigma[1] + sigma[2].toUpperCase() + sigma[0] + sigma[4] + sigma[3]);
  }
}