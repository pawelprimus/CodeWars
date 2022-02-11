package primus.pawel;

import java.util.Arrays;

// Valid Spacing
// 7kyu
// https://www.codewars.com/kata/5f77d62851f6bc0033616bd8/train/java
// 2022-02-11 T:20:12:10
class Exercise_368 {

    public static boolean validSpacing(String s) {
        return !(s.trim().length() != s.length() || Arrays.stream(s.split(" ")).toArray().length != Arrays.stream(s.split("\\s+")).toArray().length);
    }
}
