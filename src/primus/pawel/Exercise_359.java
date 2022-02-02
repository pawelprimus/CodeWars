package primus.pawel;

import java.util.Arrays;
import java.util.stream.IntStream;

// The Pony Express
// 7kyu
// https://www.codewars.com/kata/5b18e9e06aefb52e1d0001e9/train/java
// 2022-02-02 T:21:47:10
class Exercise_359 {

    public static int riders(final int[] stations) {
        int riders = 1;
        int loopSum = 0;
        for (Integer num : stations) {
            loopSum += num;
            if (loopSum > 100) {
                riders++;
                loopSum = num;
            }
        }
        return riders;
    }
}
