package primus.pawel;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

// Sort by binary ones
//
// https://www.codewars.com/kata/59eb28fb0a2bffafbb0000d6/train/java
// 2022-02-27 T:14:03:26
public class Exercise_383 {

    public static Integer[] sort(Integer list[]) {

        List<String> binaries = Arrays.stream(list).map(Integer::toBinaryString).collect(Collectors.toList());

        List<Integer> integers = binaries.stream()
                .sorted(Comparator
                        .comparing(Exercise_383::onesInWord).reversed()
                        .thenComparing(Exercise_383::wordLength)
                        .thenComparing(Exercise_383::stringToNumber))
                .map(i -> Integer.parseInt(i, 2)).collect(Collectors.toList());

        return integers.toArray(new Integer[0]);
    }

    private static long onesInWord(String word) {
        return word.chars().filter(ch -> ch == '1').count();
    }

    private static long wordLength(String word) {
        return word.length();
    }

    private static long stringToNumber(String word) {
        return Long.parseLong(word);
    }


    public static void main(String[] args) {
        Exercise_383.sort(new Integer[]{1, 15,5,7,3});
    }

    @Test
    public void testSort() {
        assertEquals(sort(new Integer[]{1, 3}), new Integer[]{3, 1});
        assertEquals(sort(new Integer[]{1, 2, 3, 4}), new Integer[]{3, 1, 2, 4});
    }
}
