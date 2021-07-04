package primus.pawel;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Simple frequency sort
// 6kyu
// https://www.codewars.com/kata/5a8d2bf60025e9163c0000bc/train/java
// 2021-07-04 T:13:17:53
class Exercise_170 {

    public static int[] sortByFrequency(int[] array) {

        HashMap<Integer, Integer> hashMapOfUccurences = new HashMap<>();

        int[] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            hashMapOfUccurences.merge(array[i], 1, Integer::sum);
        }

        Map<Integer, Integer> sortedMapOfOccurences = hashMapOfUccurences.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getKey()))
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

        sortedMapOfOccurences.entrySet().forEach(System.out::println);

        int i = 0;

        for (Map.Entry<Integer, Integer> en : sortedMapOfOccurences.entrySet()) {
            for (int j = 0; j < en.getValue(); j++) {
                resultArray[i] = en.getKey();
                i++;
            }

        }

        return resultArray;
    }


    public static void main(String[] args) {
        sortByFrequency(new int[]{1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1});
    }
}
