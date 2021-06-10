package primus.pawel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Largest pair sum in array
// 7kyu
// https://www.codewars.com/kata/556196a6091a7e7f58000018/train/java
// 2021-06-10 T:21:42:09
class Exercise_153 {
    public static int largestPairSum(int[] numbers) {
        // Stream<Integer>
        List<Integer> list = Arrays.stream(numbers)     // IntStream
                .boxed().sorted().collect(Collectors.toList());

        return list.get(list.size()-1) + list.get(list.size() -2);
    }


}
