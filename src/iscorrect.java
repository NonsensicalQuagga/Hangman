public class iscorrect {
    public static String correct(String ordet, String guess, String underscore){

        String blank = "";
        String imBad = "_";
        for (int i = 0  ; i < ordet.length(); i++){
            if (ordet.charAt(i) == guess.charAt(0))blank = blank + guess;
            if (ordet.charAt(i) != guess.charAt(0) && underscore.charAt(i) ==imBad.charAt(0)) blank = blank + "_";
            if (ordet.charAt(i) != guess.charAt(0) && underscore.charAt(i) != imBad.charAt(0))blank = blank + underscore.charAt(i);
        }
        underscore = blank;
        return underscore;
    }
}
