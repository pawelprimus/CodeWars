package primus.pawel;
// makeBackronym
// 7kyu
// https://www.codewars.com/kata/55805ab490c73741b7000064/train/java
// 2021-04-22 T:00:12:14

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.stream.*;

public class Backronym {

    private static Map<String, String> dictionary = Preload.dictionary;
    public static String makeBackronym(String acronym) {
        List<String> result = new ArrayList<String>();
        for (char character : acronym.toUpperCase().toCharArray()) {
            result.add(dictionary.get(String.valueOf(character)));
        }
        return String.join(" ", result);
    }
}


class Exercise_093_todo {




    public static void main(String[] args) {

    }

}
