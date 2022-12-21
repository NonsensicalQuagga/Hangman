public class underscoreCreate {
    public static String u(String ord) {


        String underscore = "";
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ".toUpperCase();


        for (int i = 0; i < ord.length(); i++) {
            if (abc.contains(String.valueOf(ord.charAt(i)))) underscore = underscore + "_";
            else underscore = underscore + ord.charAt(i);
        }


        return underscore;
    }
}
