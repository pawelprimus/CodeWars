package primus.pawel;

import java.util.HashMap;
import java.util.Map;

// Sum of array singles
// 7kyu
// https://www.codewars.com/kata/59f11118a5e129e591000134/train/java
// 2021-05-05 T:20:32:04
class Exercise_107 {

    public static int repeats(int[] arr) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.replace(value, map.get(value) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //System.out.println(entry.getKey() + "/" + entry.getValue());
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        repeats(new int[]{16, 0, 11, 4, 8, 16, 0, 11});
    }
}
