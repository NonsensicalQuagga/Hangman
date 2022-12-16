import java.io.FileNotFoundException;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {

        int max = 122312;
        int min = 1;
        int range = max - min + 1;

    String ordet = randword.randomword((int)(Math.random() * range) + min).toUpperCase();
    while  (ordet.length()<2) ordet = randword.randomword((int)(Math.random() * range) + min).toUpperCase();
    System.out.println(ordet);

    }
}
