package primus.pawel;

import java.util.Arrays;

// Stanton measure
// 7kyu
// https://www.codewars.com/kata/59a1cdde9f922b83ee00003b/train/java
// 2022-03-01 T:19:42:14
class Exercise_387 {

    public static int stantonMeasure(int[] arr) {
        long ones = Arrays.stream(arr).filter(i -> i == 1).count();
        return (int)(Arrays.stream(arr).filter(i -> i == ones).count());
    }

    public static void main(String[] args) {
        stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2});
    }

}
