package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regexp Basics - is it a vowel?
// 7kyu
// https://www.codewars.com/kata/567bed99ee3451292c000025/train/java
// 2021-07-13 T:22:10:59
class Exercise_178 {

    public static boolean isVowel(String s) {

        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s.toLowerCase());

        if (s.length() == 1) {
            return m.matches();
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isVowel("o"));
    }

}
