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
        int wrongGuessCounter = 0;
        int illegalGuessCounter= 0;
        String guessedLetters2 = "";

        String theWord = randomWord.u((int)(Math.random() * range) + min).toUpperCase();
        while  (theWord.length()<2) theWord = randomWord.u((int)(Math.random() * range) + min).toUpperCase();

        String underscore = underscoreCreate.u(theWord);

        while (!Objects.equals(underscore, theWord) && wrongGuessCounter != 11) {
            System.out.println(underscore);

            guess = in.nextLine().toUpperCase();
            legalWord = legalGuess.u(guess, theWord, guessedLetters, guessedWords);
            if (legalWord) {
                String blank = goodGuess.u(theWord, guess, underscore);
                if (underscore.equals(blank)) wrongGuessCounter++;
                if (!Objects.equals(underscore, blank)) underscore = blank;
            }

            if (!guessedLetters.contains(guess) && guess.length() == 1 && legalWord)
                guessedLetters = guessedLetters + " " + guess;
            if (!guessedLetters2.contains(guess) && guess.length() == 1 && legalWord && !theWord.contains(guess))
                guessedLetters2 = guessedLetters2 + " " + guess;
            if (!guessedWords.contains(guess) && !Objects.equals(guess, theWord) && guess.length() == theWord.length() && legalWord)
                guessedWords = guessedWords + " " + guess;
            if (!legalWord) illegalGuessCounter++;
            if (illegalGuessCounter == 3) {
                illegalGuessCounter = 0;
                wrongGuessCounter++;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("");
                hangdGubbe.art(wrongGuessCounter);
                System.out.printf(guessedLetters2);
                System.out.println(" " + guessedWords);
                System.out.println("");
            }
        }
        if (wrongGuessCounter == 11){
            for (int i = 0; i < 10; i++){ System.out.println("");}
            hangdGubbe.art(wrongGuessCounter);
            System.out.println("Du förlorade det korrekta ordet är " + theWord);
        }
        if (underscore.equals(theWord)){
            for (int i = 0; i < 10; i++){ System.out.println("");}
            System.out.println("Boyo lived");
            System.out.println("     \\O/");
            System.out.println("      |");
            System.out.println("     / \\");
            System.out.println("Nedre texten");
        }
    }
}
