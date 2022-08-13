package primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Partial Word Searching
// 7kyu
// https://www.codewars.com/kata/54b81566cd7f51408300022d/train/java
// 2021-12-31 T:13:56:56
class Exercise_322 {

    static String[] findWord(String x, String[] y) {
        List<String> strings = new ArrayList<>();
        for (String word : y){
            if(word.toLowerCase().contains(x)){
                strings.add(word);
            }
        }
        if(strings.isEmpty()){
            strings.add("Empty");
        }
        return strings.toArray(new String[0]);
    }
}
