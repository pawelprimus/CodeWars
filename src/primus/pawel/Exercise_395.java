package primus.pawel;

import java.util.stream.IntStream;

// Nth power rules them all!
// 7kyu
// https://www.codewars.com/kata/58aed2cafab8faca1d000e20/train/java
// 2022-03-12 T:12:14:21
class Exercise_395 {

    public static int modifiedSum(int[] array, int power) {
        return IntStream.of(array).map(i -> (int) Math.pow(i, power) - i).sum();
    }
}
