import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class randword {
    public static String randomword(int x) throws FileNotFoundException{

        String out = "";
            Scanner in = new Scanner(new File("Ord.txt"));

    for(int i = 0 ; i < x ; i++) {
        out = in.nextLine();
    }
    String imBad = "-";
    out = out.replace("é" , "e");
    out = out.replace("è" , "e");
    out = out.replace("ê" , "e");
    if (out.charAt(0) == imBad.charAt(0)) out = out.substring(1);


    return out;

    }

}
