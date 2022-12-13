import java.io.FileNotFoundException;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {

        int max = 122312;
        int min = 1;
        int range = max - min + 1;

    int rand = (int)(Math.random() * range) + min;
        System.out.println(rand);

    String ordet = randword.randomword(rand);
        System.out.println(ordet);

    }
}
