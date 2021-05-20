package primus.pawel;

import java.util.Arrays;

// Count of positives / sum of negatives
// 8kyu
// https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
// 2021-04-10 T:04:25:50
class Exercise_064 {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input.length == 0 || input == null) return new int[]{};

        int positivesCount = (int) Arrays.stream(input)
                .filter(n -> n > 0)
                .count();
        int negativesSum = (int) Arrays.stream(input)
                .filter(n -> n < 0)
                .sum();
        return new int[]{positivesCount, negativesSum};
    }


    public static void main(String[] args) {
        countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
    }
}
