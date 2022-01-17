package primus.pawel;

import java.util.stream.IntStream;

// Scoring Tests
// 7kyu
// https://www.codewars.com/kata/55d2aee99f30dbbf8b000001/train/java
// 2022-01-17 T:17:39:24
class Exercise_343 {
    private static int CORRECT = 0;
    private static int OMITTED = 1;
    private static int WRONG = 2;

    public static int sol(int[] arr, int r, int o, int w) {

        long correctPoints = IntStream.of(arr).filter(i -> i == CORRECT).count() * r;
        long omittedPoints = IntStream.of(arr).filter(i -> i == OMITTED).count() * o;
        long wrongPoints = IntStream.of(arr).filter(i -> i == WRONG).count() * w;

        return (int)(correctPoints + omittedPoints - wrongPoints);
    }
}
