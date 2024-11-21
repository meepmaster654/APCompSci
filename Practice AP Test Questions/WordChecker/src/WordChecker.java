import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    // ["catch", "bobcat", "catchacat", "cat", "at"]
    // This is not part of the test it is just for testing
    public WordChecker() {
        wordList = new ArrayList<String>();
        wordList.add("catch");
        wordList.add("bobcat");
        wordList.add("catchacat");
        wordList.add("cat");
        wordList.add("at");
    }

    // This is where the actual code for the AP question starts
    public boolean isWordChain() { /* to be implemented in part (a) */
        String currentWord = wordList.get(0);
        for (int i = 1; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf(currentWord) == -1) {
                return false;
            } else {
                currentWord = wordList.get(i);
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf(target) == 0) {
                output.add(wordList.get(i).substring(target.length()));
            }
        }
        return output;
    }
}
