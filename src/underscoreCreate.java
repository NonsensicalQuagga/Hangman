public class underscoreCreate {
    public static String u(String theWord) {


        String underscore = "";
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ".toUpperCase();


        for (int i = 0; i < theWord.length(); i++) {
            if (abc.contains(String.valueOf(theWord.charAt(i)))) underscore = underscore + "_";
            else underscore = underscore + theWord.charAt(i);
        }


        return underscore;
    }
}
