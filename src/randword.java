import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class randword {
    public static String randword(int x) throws FileNotFoundException{

        String returns = "a";

            Scanner in = new Scanner(new File("Ord.txt"));


    for(int i = 0 ; i < x ; i++) {
        returns = in.nextLine();
    }
    return returns;

    }

}
