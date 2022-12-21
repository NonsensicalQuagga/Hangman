import java.util.Objects;

public class legalGuess {
    public static boolean u(String guess, String theWord, String guessedLetters , String guessedWords) {
        boolean legalWord = (guessedLetters.length() == 0 && guess.length() == 1) || Objects.equals(guess, theWord);
        if (guess.length() == 1 && guessedLetters.length()>0) {
            for (int i = 0; i < guessedLetters.length(); i++) {
                if (guessedLetters.charAt(i) == guess.charAt(0)){
                    legalWord = false;
                    break;
                }
                else legalWord = true;
            }
        }
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ".toUpperCase();
              if (!abc.contains(guess.toUpperCase()) && guess.length() == 1) legalWord = false;

        if (guess.length() == theWord.length() && !legalWord && !guessedWords.contains(guess)){
            for (int i = 0; i < guess.length(); i++){
                if (!abc.contains(String.valueOf(guess.charAt(i)))){
                    legalWord = false;
                    break;
                }
                else legalWord = true;
            }
        }

        return legalWord;
    }
}