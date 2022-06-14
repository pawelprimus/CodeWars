package primus.pawel;


import java.util.Collections;

// String repeat
// 8kyu
// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
// 2021-04-11 T:20:32:33
class Exercise_065 {

    public static String repeatStr(final int repeat, final String string) {
        return String.join("", Collections.nCopies(repeat, string));
    }
}
