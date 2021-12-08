package primus.pawel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Last
// 7kyu
// https://www.codewars.com/kata/541629460b198da04e000bb9/train/java
// 2021-12-08 T:18:18:50
class Exercise_308 {
    public static <T> T last(final List<T> list) {
        return list.get(list.size()-1);
    }
    public static char last(final String string) {
        return string.charAt(string.length()-1);
    }
    public static <T> T last(final T... list) {
        return Arrays.asList(list).get(list.length-1);
    }

    public static void main(String[] args) {
        last("aa", "bbb", "ccc");
    }
}

/*    public static <T> T last(final List<T> list) {
        return list.stream()
            .reduce((a,b) -> b).orElse(null);
    }
    public static char last(final String string) {
        return string.chars().mapToObj(c -> (char) c)
            .reduce((a,b) -> b).orElse(null);
    }
    public static <T> T last(final T... list) {
        return Arrays.stream(list)
            .reduce((a,b) -> b).orElse(null);
    }*/
