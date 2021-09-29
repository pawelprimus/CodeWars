package primus.pawel;

import java.util.Collections;

// Thinkful - String Drills: Repeate
// 7kyu
// https://www.codewars.com/kata/585a1a227cb58d8d740001c3/train/java
// 2021-09-29 T:20:34:49
class Exercise_238 {
    public static String repeat(String string, long n) {
        return String.join("", Collections.nCopies((int) n, string));
    }
}
//return string.repeat((int)n);