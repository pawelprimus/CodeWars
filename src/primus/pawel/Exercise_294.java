package primus.pawel;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Between Extremes
// 7kyu
// https://www.codewars.com/kata/56d19b2ac05aed1a20000430
// 2021-11-23 T:20:32:03
class Exercise_294 {

    public static int betweenExtremes(int[] numbers)
    {
        int max = IntStream.of(numbers).max().getAsInt();
        int min = IntStream.of(numbers).min().getAsInt();

        return max-min;
    }

    public static void main(String[] args) {

        betweenExtremes(new int[]{21, 34, 54, 43, 26, 12});
    }

}

/*  IntSummaryStatistics stats = IntStream.of(numbers).summaryStatistics();
    return stats.getMax() - stats.getMin()*/