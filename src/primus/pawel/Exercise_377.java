package primus.pawel;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

// Sequences and Series
// 6kyu
// https://www.codewars.com/kata/5254bd1357d59fbbe90001ec/train/java
// 2022-02-19 T:13:19:38
class Exercise_377 {

    private static final long FIFTY = 50;

    public static long getScore(long n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i * FIFTY;
        }
        return result;
    }

}
