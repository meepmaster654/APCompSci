import java.util.Scanner;
public class TwoFiveNineLab {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Input a Fahrenheit temperature:");
    FToCTemp twoFive = new FToCTemp(userInput.nextDouble());
    System.out.println("Input the base sides of your pyramid:");
    Pyramids twoSix = new Pyramids(userInput.nextInt());
    System.out.println("Input the numerator of your fraction, click enter, then enter the denominator");
    ImproperFractions twoSeven = new ImproperFractions(userInput.nextInt(),userInput.nextInt());
    System.out.println("Input the amount of seconds to convert");
    Time twoEight = new Time(userInput.nextInt());
  }
}
class FToCTemp {
  public FToCTemp(double userTemp) {
    double convertedTemp = (userTemp-(double)32)/1.8;
    System.out.println(userTemp +" degrees Fahrenheit\n     is equal to\n"+ convertedTemp + "degrees Celsius");
  }
}
class Pyramids {
  public Pyramids(int userSides) {
    int verticies = userSides + 1;
    int edges = userSides * 2;
    int faces = userSides + 1;
    System.out.println("You input a pyramid with a base of "+ userSides + " sides.\nThe computer says, \"This pyramid has " + verticies + " faces, " + edges + " edges, and " + faces + " \nvertices.\"");
  }
}

class ImproperFractions {
  public ImproperFractions(int topNum, int botNum){//Testing out multiple cursors
    int newTop, whole;
    System.out.println(topNum + "/" + botNum+" = " + whole +" "+newTop + "/" + botNum);
  }//Testing out multiple cursors
}
class Time {
  public Time(int seconds){
    int hours, secNoHours, minutes, secNoHourMinutes;
    hours = seconds/3600;
    secNoHours = seconds % 3600;
    minutes = secNoHours / 60;
    secNoHourMinutes = secNoHours% 60;
    System.out.print("There are " + hours + " hours, " + minutes + " minutes, and " + secNoHourMinutes + " seconds in " + seconds + " seconds.");
    //Testing out multiple cursors
  }
}//Testing out multiple cursors