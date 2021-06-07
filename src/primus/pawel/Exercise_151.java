package primus.pawel;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// My Languages
// 7kyu
// https://www.codewars.com/kata/5b16490986b6d336c900007d/train/java
// 2021-06-07 T:23:35:13
class Exercise_151 {
    public static List<String> myLanguages(final Map<String, Integer> results) {

        //LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        List<String> resultLists = new LinkedList<>();

        results.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(x -> x.getValue() >= 60)
                .forEachOrdered(x -> resultLists.add(x.getKey()));

        return resultLists;
    }

}
