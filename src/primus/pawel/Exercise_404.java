package primus.pawel;

import java.util.Arrays;

// Mean vs. Median
// 7kyu
// https://www.codewars.com/kata/5806445c3f1f9c2f72000031/train/java
// 2022-03-23 T:21:40:12
class Exercise_404 {

    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);
        int mean = mean(numbers);
        int media = median(numbers);

        if (mean == media) {
            return "same";
        }

        return mean > media ? "mean" : "median";
    }

    public static int mean(int[] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public static int median(int[] m) {
        int middle = m.length / 2;
        if (m.length % 2 == 1) {
            return m[middle];
        } else {
            return (m[middle - 1] + m[middle]) / 2;
        }
    }


}
