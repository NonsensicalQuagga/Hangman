import java.util.Objects;

public class goodGuess {
    public static boolean legalGuess(String guess, String ordet, String guessedLetters) {
        boolean legalWord = guessedLetters.length() == 0 && guess.length() == 1 || Objects.equals(guess, ordet);
        if (guess.length() == 1 && guessedLetters.length()>0) {
            for (int i = 0; i < guessedLetters.length(); i++) {
                if (guessedLetters.charAt(i) == guess.charAt(0)){
                    legalWord = false;
                    break;
                }
                else legalWord = true;
            }
        }
        return legalWord;
    }
}
// needs to be put in main
// boolean legalWord;
// String guessedLetters = "";
// String guessedWords = "";
// legalWord = goodguess.legalGuess(guess, ordet, guessedWords, guessedLetters);
// if (!guessedLetters.contains(guess) && guess.length() == ordet.length()) guessedLetters = guessedLetters + guess;
// if (!guessedWords.contains(guess) && !Objects.equals(guess, ordet) && guess.length() == ordet.length()) guessedWords = guessedWords + " " + guess;