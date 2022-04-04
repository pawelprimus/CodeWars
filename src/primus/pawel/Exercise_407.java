package primus.pawel;

import java.util.Arrays;

// Parallel resistors
// 7kyu
// https://www.codewars.com/kata/5723b111101f5f905f0000a5/train/java
// 2022-04-04 T:23:48:07
class Exercise_407 {

    public static double resistance(double... resistors) {
        return 1 / Arrays.stream(resistors).map(r1 -> 1.0 /r1).sum();
    }

    public static void main(String[] args) {
        System.out.println(resistance(20, 20));
    }

}
