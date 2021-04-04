package primus.pawel;

import java.util.Arrays;
import java.util.stream.IntStream;

// Odd or even
// 7kyu
// https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
// 2021-04-04 T:20:29:17
class Exercise_057 {

    public static String oddOrEven (int[] array) {
        if(array.length == 0) return "even";
        int sum = IntStream.of(array).sum();
        return (sum%2) == 0 ? "even" :  "odd";
    }
}

/* static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }*/
