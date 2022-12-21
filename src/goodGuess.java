public class goodGuess {
    public static String u(String theWord, String guess, String underscore){

        String blank = "";
        String imBad = "_";
        if (guess.length()==1){
            for (int i = 0  ; i < theWord.length(); i++){
                if (theWord.charAt(i) == guess.charAt(0))blank = blank + guess;
                if (theWord.charAt(i) != guess.charAt(0) && underscore.charAt(i) == imBad.charAt(0)) blank = blank + "_";
                if (theWord.charAt(i) != guess.charAt(0) && underscore.charAt(i) != imBad.charAt(0))blank = blank + underscore.charAt(i);
            }
        }
        if (guess.length() == theWord.length() && guess.equals(theWord)) blank = guess;
        else blank = underscore;
        return blank;
    }
}
