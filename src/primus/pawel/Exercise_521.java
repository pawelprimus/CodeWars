package src.primus.pawel;

import java.util.stream.IntStream;

// Grasshopper - Summation
// 8kyu
// https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java
// 2023-07-15 T:21:24:29
public class Exercise_521 {

    public static int summation(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }

}
