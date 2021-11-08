package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// An English Twist on a Japanese Classic
// 7kyu
// https://www.codewars.com/kata/5b04be641839f1a0ab000151/train/javascript
// 2021-11-08 T:20:11:57
class Exercise_276 {

    public static List<String> theGame(List<String> words) {
        List<String> arrayList = new ArrayList<>();

        if (words.size() == 0) {
            return arrayList;
        }

        if (isStringNotEmpty(words.get(0))) {
            arrayList.add(words.get(0));
        }

        for (int i = 1; i < words.size(); i++) {

            if (!isStringNotEmpty(words.get(i))) {
                break;
            } else {
                if (words.get(i).charAt(0) != words.get(i - 1).charAt(words.get(i - 1).length() - 1)) {
                    break;
                } else {
                    arrayList.add(words.get(i));
                }
            }
        }

        System.out.println(Arrays.asList(arrayList));
        return arrayList;

    }

    static boolean isStringNotEmpty(String word) {
        return word != null && !word.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc"));
        theGame(words);

    }

}
