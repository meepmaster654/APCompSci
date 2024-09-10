public class TwoTreeNotesCheck {
  public static void main(String[] args){
    String ick = "Tesfa";
    boolean demure = false;
    System.out.println(ick + " gives me the ick");
    if (demure) {
      System.out.println(ick + " is demure");
    } else {
      System.out.println(ick + " is not very demure");
    }
    Person = new Person("Tesfa", false, true);
  }
}
class Person {
  String name;
  boolean demure;
  boolean ick;
  public Person(String nameDef, boolean demureDef, boolean ickDef){
    name = nameDef;
    demure = demureDef;
    ick = ickDef;
  }
}