package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Count the Characters
// 7kyu
// https://www.codewars.com/kata/577ad961ae2807182f000c29/train/java
// 2021-07-19 T:22:38:07
class Exercise_184 {
    public static int charCount(String str, char c) {
        Pattern p = Pattern.compile(String.valueOf(c).toLowerCase());
        Matcher m = p.matcher(str.toLowerCase());

        return (int) m.results().count();
    }

}
