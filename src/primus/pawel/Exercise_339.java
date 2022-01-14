package primus.pawel;

import java.util.*;
import java.util.stream.IntStream;

// Sort Out The Men From Boys
// 7kyu
// https://www.codewars.com/kata/5af15a37de4c7f223e00012d/train/java
// 2022-01-12 T:21:37:54
class Exercise_339 {

    public static int[] menFromBoys(final int[] values) {
        TreeSet<Integer> odd = new TreeSet<>();
        TreeSet<Integer> even = new TreeSet<>();

        IntStream.of(values).filter(value -> value % 2 == 0).forEach(even::add);
        IntStream.of(values).filter(value -> value % 2 != 0).forEach(odd::add);
        List<Integer> result = new ArrayList();

        even.stream().forEach(result::add);
        odd.descendingSet().stream().forEach(result::add);

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        menFromBoys(new int[]{82, 91, 72, 76, 76, 100, 85});
    }


}
