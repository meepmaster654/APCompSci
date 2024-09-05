public class ClassTest 
{
  public static void main(String[] args)
  {
    System.out.println("hello world");
    Testing testObj = new Testing(3);
    System.out.println(testObj.x);
    testObj.tMethod();
    System.out.println(testObj.x);
  }
}

class Testing {
  public Testing(int y) {
    static int z = y;
  }
  static int x = 9;
  public void tMethod() {
    x += z;
  }
}
  