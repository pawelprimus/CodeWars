package primus.pawel;

import java.util.Collections;

// Exclamation marks series #8: Move all exclamation marks to the end of the sentence
// 7kyu
// https://www.codewars.com/kata/57fafd0ed80daac48800019f/train/java
// 2022-05-09 T:19:24:21
class Exercise_444 {


    public static String remove(String s){
        long exclamCount = s.chars().filter(i -> i == '!').count();
        return s.replaceAll("!", "") + String.join("", Collections.nCopies((int) exclamCount, "!"));
    }



}
