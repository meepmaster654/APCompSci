import java.lang.Math;
public class NumberWord {
  private int number;
  private String word;
  public NumberWord(int number, String word) {
    this.number = number;
    this.word = word;
  }
  public NumberWord(String word) {
    this.word = word;
    number = (int) (Math.random()*9) + 1;
  }
  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    this.number = number;
  }
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }
  public String multiplyWord() {
    String output = "";
    for (int i = 0;  i < number; i++){
      output += word;
    }
    return output;
  }
  public String multiplyWord(int addNum) {
    String output = "";
    for (int i = 0;  i < number; i++){
      output += word;
      for (int x = 0;  x < addNum; x++) {
        output += number;
      }
    }
    return output;
  }
  public String toString(){
    return "This number-word is comprised of " + number + " and " + word;
  }
}