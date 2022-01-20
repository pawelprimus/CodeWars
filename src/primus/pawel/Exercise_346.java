package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Remove consecutive duplicate words
// 7kyu
// https://www.codewars.com/kata/5b39e91ee7a2c103300018b3/train/java
// 2022-01-20 T:22:53:38
class Exercise_346 {

    public static String removeConsecutiveDuplicates(String s) {
        List<String> strings = Arrays.asList(s.split(" "));

        List<String> result = new ArrayList<>();
        result.add(strings.get(0));

        for (String word : strings) {

            if (!word.equals(result.get(result.size() - 1))) {
                result.add(word);
            }

        }
        StringBuilder resultWord = new StringBuilder();
        for (String word : result) {
            resultWord.append(word).append(" ");
        }

        return resultWord.toString().trim();
    }
}
