public class CompoundWord {
    private String firstWord, secondWord;

    public CompoundWord(String first, String second) {
        firstWord = first;
        secondWord = second;
    }
    // Getting and setting methods
    public String getFirstWord() {
        return firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setFirstWord(String newInput) {
        firstWord = newInput;
    }

    public void setSecondWord(String newInput) {
        secondWord = newInput;
    } 
    // main methods
    public int findTotalLength() {
        return firstWord.length() + secondWord.length();
    }
    public void swapWords() {
        String x = firstWord;
        firstWord = secondWord;
        secondWord = x;
    }
    public String toString() {
        return firstWord + secondWord;
    }
}
/*
Write a method named swapWords that switches the values of the instance variables.

Write a toString method that returns a String stating the compound word.
*/