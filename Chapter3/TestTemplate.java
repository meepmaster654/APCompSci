// Will Leasure
import java.lang.Math;
public class TestTemplate {
  public static void main(String[] args) {
    String output = "The diagonal of a square prism with width: [1]\n";
    output = output + "and height: [2] is equal to [3]";
    int width = (int) ((Math.random()*13)+2);
    double height = (Math.random()*4)+5;
    double diagonal = Math.hypot(2*width, height);
    int locationOf1 = output.indexOf("[1]");
    int locationOf2 = output.indexOf("[2]");
    int locationOf3 = output.indexOf("[3]");

    String phraseTo1 = output.substring(0,locationOf1);
    String phrase1To2 = output.substring(locationOf1+3,locationOf2);
    String phrase2To3 = output.substring(locationOf2+3,locationOf3);
    output = phraseTo1 + width + phrase1To2 + height + phrase2To3 + diagonal;

    System.out.println(output);
  }
}