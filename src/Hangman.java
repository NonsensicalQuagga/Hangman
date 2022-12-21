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

        String theWord = randomWord.u((int)(Math.random() * range) + min).toUpperCase();
        while  (theWord.length()<2) theWord = randomWord.u((int)(Math.random() * range) + min).toUpperCase();
        System.out.println(theWord);

        String underscore = underscoreCreate.u(theWord);

        while (!Objects.equals(underscore, theWord)) {
            System.out.println(underscore);
            guess = in.nextLine().toUpperCase();
            legalWord = legalGuess.u(guess, theWord, guessedLetters, guessedWords);
            if (legalWord){
                String blank = goodGuess.u(theWord, guess, underscore);

            System.out.println(blank);
            // add more logic with underscore and isTrue
            underscore = blank;
            }

            if (!guessedLetters.contains(guess) && guess.length() == 1 && legalWord) guessedLetters = guessedLetters + guess;
            if (!guessedWords.contains(guess) && !Objects.equals(guess, theWord) && guess.length() == theWord.length() && legalWord) guessedWords = guessedWords + " " + guess;
            System.out.println(legalWord);
        }
    }
}
