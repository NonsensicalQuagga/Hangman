import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        int max = 122312;
        int min = 1;
        int range = max - min + 1;
        String guess;
        boolean legalWord;
        String guessedLetters = "";
        String guessedWords = "";

        String ordet = randword.randomword((int)(Math.random() * range) + min).toUpperCase();
        while  (ordet.length()<2) ordet = randword.randomword((int)(Math.random() * range) + min).toUpperCase();
        System.out.println(ordet);

        String underscore = "";
        for (int i = 0; i < ordet.length(); i++) {
            underscore = underscore + "_";
        }
        while (!Objects.equals(underscore, ordet)) {
            System.out.println(underscore);
            guess = in.nextLine().toUpperCase();
            legalWord = goodGuess.legalGuess(guess, ordet, guessedLetters);
            if (legalWord){
                String isTrue = iscorrect.correct(ordet, guess, underscore);

            System.out.println(isTrue);
            // add more logic with underscore and isTrue
            underscore = isTrue;
            }

            if (!guessedLetters.contains(guess) && guess.length() == 1) guessedLetters = guessedLetters + guess;
            if (!guessedWords.contains(guess) && !Objects.equals(guess, ordet) && guess.length() == ordet.length()) guessedWords = guessedWords + " " + guess;
            System.out.println(legalWord);
        }
    }
}
