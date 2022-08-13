package primus.pawel;

import java.util.LinkedHashSet;
import java.util.Set;

// Remove duplicate words
// 7kyu
// https://www.codewars.com/kata/5b39e3772ae7545f650000fc/train/java
// 2021-04-21 T:20:11:00
class Exercise_090 {

    public static String removeDuplicateWords(String s) {
        if (s.length() == 0) return "";

        String[] wordsArr = s.split(" ");
        Set<String> wordsHash = new LinkedHashSet<>();
        for (int i = 0; i < wordsArr.length; i++) {
            wordsHash.add(wordsArr[i]);
        }
        StringBuilder result = new StringBuilder();

        for (String hash : wordsHash) {
            result.append(hash).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        removeDuplicateWords("f");
    }

}

/*public static String removeDuplicateWords(String s) {

        return String.join(" ", new LinkedHashSet<>(Arrays.asList(s.split(" "))));
    }
    */
