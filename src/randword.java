import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class randword {
    public static String randword(int x){
     try {
        String returns = "a";

            Scanner in = new Scanner(new File("Ord.txt"));


    for(int i = 0 ; i < x ; i++){
    returns = in.nextLine();
    }
    return returns;
     }catch (FileNotFoundException e){return "hej";}
    }

}
