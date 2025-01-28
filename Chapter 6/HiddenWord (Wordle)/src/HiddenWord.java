public class HiddenWord {
    String secret;

    public HiddenWord(String secret) {
        this.secret = secret;
    }

    public String getHint(String guess) {
        guess = guess.toUpperCase();
        char[] secretArr = secret.toCharArray();
        char[] guessArr = guess.toCharArray();
        String output = "";
        for (int i = 0; i < guessArr.length; i++) {
            if (secretArr[i] == guessArr[i]) {
                output += guessArr[i];
            } else if (contains(secretArr, guessArr[i])) {
                output += "+";
            } else {
                output += "*";
            }
        }
        return output;
    }

    public static boolean contains(char[] arr, char val) {
        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                contains = true;
            }
        }
        return contains;
    }
}