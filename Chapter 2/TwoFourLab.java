public class TwoFourLab {
  public static void main(String[] args){
    Order customerOne = new Order(1,2,1);
    Piramid piraOne = new Piramid(4,6,4);
    Piramid piraTwo = new Piramid(7,12,7);
    System.out.println("   /#M#\\\n  |########\n  WWW  0|_\n   WW  \"\"\"\n   ----/\n _/ H H \\_\n|_| HHH |_|\n   HHHHH\n  HH   HH\n /__| |__\\\n");
  }
}
class Order {
  public Order(int bagels, int coffee, int gifts) {
    System.out.println("You are the 500th customer!");
    System.out.println("You get 4 free bagels for a total of " + (bagels + 4) + " bagels!");
    System.out.println("You get 2 free coffees for a total of " + (coffee + 2) + " coffees!");
    System.out.println("You get one $25 gift card for a total of " + (gifts + 1) +  "gift cards!");
  }
}
class Piramid {
  public Piramid(int faces, int edges, int vertices) {
    System.out.println("The piramid has " + faces + " faces, " + edges + " edges, and " + vertices + " vertices");
  }
}
