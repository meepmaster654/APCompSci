//--------------------------------------------------
// Name:Will Leasure
//--------------------------------------------------

/* 1 point for following Google Style Guide and Clean Code */
public class WordStorage {
  private String[] words = null;
  
  /* 1 point */
  public WordStorage(int maxLength) {
    words = new String[maxLength];
    

    resetWords(1, maxLength); // do not change this line
  }
  
  
  /* 1 point */
  public void resetWords(int min, int max) {
    for (int i = min - 1; i < max; i++) {
      words[i] = "";
    } 
  }
  
  
  /* 1 point */
  public boolean addWord(String word) {
    if (word.equals("quit")){
      return false;
    } else {
      words[word.length()-1] += word;
      return true;
    }
  }
  
  
  /* 1 point */
  public int getLetterTotal() {
    int total = 0;
    for (String i : words) {
      total += i.length();
    }
    return total;
  }
  
  
  /* 2 points */
  public String getAcronym() {
    String acro = "";
    for (String i : words) {
      if (i.length() > 1) {
        acro += i.substring(0,1);
      } else if(i.length() == 1) {
        acro += i;
      }
    }
    return acro;
  }
  
  
  /* 1 point */
  public String toString() {
    String output = "";
    for (int i = 0; i < words.length; i++) {
      output += i+1 + ": " + words[i] + "\n";
    }
    return output;
  }
  
}