package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regexp Basics - is it a letter?
// 7kyu
// https://www.codewars.com/kata/567de72e8b3621b3c300000b/train/java
// 2021-07-14 T:21:23:04
class Exercise_179 {

    public static boolean isLetter(String s) {
        return s.matches("[a-zA-Z]");
    }

}
