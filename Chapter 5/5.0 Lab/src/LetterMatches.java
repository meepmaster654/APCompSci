import java.util.Scanner;
import java.util.ArrayList;

public class LetterMatches {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input a word");
            String word = in.nextLine();
            System.out.println("Input a word to compare");
            String wordTwo = in.nextLine();
            int numFound = 0;
            ArrayList<String> coupList = new ArrayList<String>();
            for (int i = 0; i < wordTwo.length() - 1; i++) {
                for (int s = 0; s < word.length() - 1; s++) {
                    if (wordTwo.substring(i, i + 2).equals(word.substring(s, s + 2))) {
                        numFound++;
                        coupList.add(wordTwo.substring(i, i + 2));
                    }
                }
            }
            System.out.println("There were " + numFound + " similar couplets in the words " + word + " and " + wordTwo);
            System.out.println("They were ");
            for (int i = 0; i < coupList.size(); i++) {
                System.out.print(coupList.get(i) + " ");
            }
        }
    }
}
