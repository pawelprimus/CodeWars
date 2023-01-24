package src.primus.pawel;

import java.util.Arrays;

// Simple Fun #40: Timed Reading
// 7kyu
// https://www.codewars.com/kata/588817db5fb13af14a000020/train/java
// 2023-01-24 T:20:13:03
public class Exercise_498 {

    public static int timedReading(final int maxLength, final String text) {
        return (int) Arrays.stream(
                        text.replaceAll("[^A-Za-z]", " ").split("\s+"))
                .filter(i -> i.length() <= maxLength && i.length() > 0)
                .count();
    }


}
