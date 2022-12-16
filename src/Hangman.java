import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        int max = 122312;
        int min = 1;
        int range = max - min + 1;
        String guess = "";

        String ordet = randword.randomword((int)(Math.random() * range) + min).toUpperCase();
        while  (ordet.length()<2) ordet = randword.randomword((int)(Math.random() * range) + min).toUpperCase();
        System.out.println(ordet);

        String underscore = "";
        for (int i = 0; i < ordet.length(); i++) {
            underscore = underscore + "_";
        }
        while (!Objects.equals(underscore, ordet)) {
            guess = in.nextLine().toUpperCase();
            String istrue = iscorrect.correct(ordet, guess, underscore);
            System.out.println(istrue);
            // add more logic with underscore and istrue
            underscore = istrue;
        }
    }
}
