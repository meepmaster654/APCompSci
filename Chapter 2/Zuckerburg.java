public class Zuckerburg {
  public static void main(String[] args){
    System.out.println("\"We want to make it so that anyone, anywhere can go to a store, get a phone, \nget online, and get access to all of the same things that you \nand I appreciate about the Internet.\"\n      -Mark Zuckerberg, interview with CNNs \"New Day\" Chris Cuomo.");
    TextAsPicture();
  }
  public static void TextAsPicture(){
    int randomNum = (int)(1+ (Math.random() * 3));
    System.out.println(randomNum);
    for (int i = 0; i < 200; i++) {
      randomNum = (int)(1+ (Math.random() * 7));
      switch(randomNum){
        case 1:
          System.out.print("   ");
          break;
        case 2:
          System.out.print("\n");
          break;
         case 3:
          System.out.print("   ");
          break;
        default:
          System.out.print("/|\\^._.^/|\\");
      }
    }
    System.out.println("\n^^Swarm of Bats^^");
  }
}
    