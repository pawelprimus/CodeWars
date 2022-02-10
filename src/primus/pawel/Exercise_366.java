package primus.pawel;

import java.util.stream.IntStream;

// Series of integers from 0 to n
// 7kyu
// https://www.codewars.com/kata/5841f4fb673ea2a2ae000111/train/java
// 2022-02-10 T:22:02:32
class Exercise_366 {
    public static int[] generateIntegers(int n) {
        return IntStream.rangeClosed(0, n).toArray();
    }
}
