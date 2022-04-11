package primus.pawel;
// Return the first M multiples of N
// 7kyu
// https://www.codewars.com/kata/593c9175933500f33400003e/train/java
// 2022-04-11 T:23:47:59

import java.util.stream.IntStream;

class Exercise_413 {
    public static int[] multiples(int m, int n) {
        return IntStream.rangeClosed(1, m)
                .map(x -> x * n)
                .toArray();

//        int[] result = new int[m];
//        for (int i = 1; i <= m; i++) {
//            result[i - 1] = i * n;
//        }
//        return result;
    }

}
