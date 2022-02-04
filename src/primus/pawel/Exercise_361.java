package primus.pawel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Find Count of Most Frequent Item in an Array
// 7kyu
// https://www.codewars.com/kata/56582133c932d8239900002e/train/java
// 2022-02-04 T:17:46:53
//  2022-02-04 T:17:47:55
class Exercise_361 {

    public static int mostFrequentItemCount(int[] collection) {

        if (collection == null || collection.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : collection) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        //return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentItemCount(new int[]{-14, -14, -13, -10, -10, -8, -7, -3, -2, -1, -1, 3, 5, 9, 8, -12, -14, -12, -11, -7, -7, -6, -6, -4, -4, -3, -1, -1, 2, 2, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 10, 10, -15, -13, -11, -10, -9, -8, -5, -4, -2, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 5, 5, 7, 8, 8, 9, 11, 13, 14, -10, 3, -15, -14, -14, -10, -9, -9, -7, -6, -4, -3, -3, -2, 0, 3, 9, 11, 12, 12, 13, 14, -15, -14, -13, -13, -9, -8, -8, -7, -4, 0, 0, 2, 4, 4, 5, 5, 7, 8, 8, 9, 10, 11, 12, 12, 13, 14, 14, -11, 3, -15, -15, -15, -14, -14, -10, -4, -2, -1, 0, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 9, 11, 11, 12, 12, 14, -13, -15, -13, -11, -10, -10, -8, -6, -3, 5, 8, 8, 9, 14, -15, -12, -10, -9, -7, -4, 8, 8, 12, 12, -10, -8, -1, 7, 8, 11, 11, -15, -14, -13, -10, -8, -7, -1, 3, 5, 5, 6, 7, 12, 13, -14, -11, -9, -8, -7, -6, -6, -6, -4, -2, 4, 4, 4, 4, 6, 6, 6, 6, 14}));
    }


}
