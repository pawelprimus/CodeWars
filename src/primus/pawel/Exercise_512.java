package src.primus.pawel;

import java.time.DayOfWeek;
import java.util.*;
import java.util.stream.Collectors;

// Sum a list but ignore any duplicates
// 7kyu
// https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2/train/java
// 2023-04-23 T:16:34:55
public class Exercise_512 {

    public static int sumNoDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).mapToInt(Map.Entry::getKey).sum();
    }

}


/*   for (int num: nums) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }*/