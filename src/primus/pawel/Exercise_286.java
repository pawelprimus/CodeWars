package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Array Leaders (Array Series #3)
// 7kyu
// https://www.codewars.com/kata/5a651865fd56cb55760000e0/train/java
// 2021-11-15 T:18:50:09
class Exercise_286 {

    public static List arrayLeaders(int[] numbers) {
        List<Integer> results = new ArrayList<>();
        int sum = Arrays.stream(numbers).sum();

        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
            if (numbers[i] > sum) {
                results.add(numbers[i]);
            }
        }
        return results;
    }
}
