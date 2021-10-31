package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Exercise_267_todo {

    private static final String FURY = "FURY";
    private static final String FIRE = "FIRE";
    private static final String FAKE = "Fake tweet.";

    static final List<Character> possibleLetters = new ArrayList<Character>() {{
        add('E');
        add('F');
        add('I');
        add('R');
        add('U');
        add('Y');
    }};

    public static String fireAndFury(final String tweet) {
        if (!isTweetNotFake(tweet)) {
            return FAKE;
        }

        StringBuilder finalTweet = new StringBuilder();

        int fury = 0;
        int fire = 0;

        String currentCheck;
        for (int i = 0; i < tweet.length() - 3; i++) {
            currentCheck = tweet.substring(i, i + 4);

            if (currentCheck.equals(FIRE)) {
                if (fury == 0 && fire == 0) {
                    fire++;
                } else if (fury == 0) {
                    fire++;
                } else {
                    fire++;
                    finalTweet.append(generateMessage(FURY, fury));
                    fury = 0;
                }
            }

            if (currentCheck.equals(FURY)) {
                if (fury == 0 && fire == 0) {
                    fury++;
                } else if (fire == 0) {
                    fury++;
                } else {
                    fury++;
                    finalTweet.append(generateMessage(FIRE, fire));
                    fire = 0;
                }

            }

        }

        if(fire > 0) {
            finalTweet.append(generateMessage(FIRE, fire));
        }
        if(fury > 0) {
            finalTweet.append(generateMessage(FURY, fury));
        }

        return finalTweet.length()==0 ? FAKE :  finalTweet.toString().trim();
    }

    private static boolean isTweetNotFake(String tweet) {
        for (int i = 0; i < tweet.length(); i++) {
            if (!possibleLetters.contains(tweet.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String generateMessage(String typeOfMessage, int ntimes) {

        if(typeOfMessage.equals(FIRE)){
                String result = String.join("", Collections.nCopies(ntimes -1, "you and ")) + "you are fired! ";
                return result.substring(0, 1).toUpperCase() + result.substring(1);
        }
        if(typeOfMessage.equals(FURY)){
            String result = "I am" + String.join("", Collections.nCopies(ntimes -1, " really")) + " furious. ";
            return result;
        }
        return "";
    }

    public static void main(String[] args) {

        fireAndFury("FIREYYFURYYFURYYFURRYFIRE");

        //System.out.println(isTweetNotFake("FIREYYFURYYFURYYFURRYFIREE"));
        //System.out.println(isTweetNotFake("FYRYFIRUFIRUFUREy"));
    }


}
