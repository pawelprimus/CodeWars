package primus.pawel;

import java.util.Arrays;

// Nth Smallest Element (Array Series #4)
// 7kyu
// https://www.codewars.com/kata/5a512f6a80eba857280000fc/train/java
// 2022-04-12 T:00:00:09
class Exercise_415 {

    public static int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }

}

/* public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().skip(n-1).findFirst().getAsInt();
    }
    */