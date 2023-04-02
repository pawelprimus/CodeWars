package src.primus.pawel;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Where's Wally
// 7kyu
// https://www.codewars.com/kata/55f91a98db47502cfc00001b
// 2023-04-02 T:19:50:44
public class Exercise_510 {

    private static final String WALLY = "Wally";

    public static int wheresWally(String str) {
        if (str == null || str.length() < WALLY.length()) {
            return -1;
        }
        str = " " + str + " str ";
        String regex = "[\s+]Wally[\s+.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int index = -1;
        if (matcher.find()) {
            index = matcher.start() ;
        }

        return index;
    }

}
