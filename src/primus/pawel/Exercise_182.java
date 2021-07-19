package primus.pawel;

import java.util.Arrays;
import java.util.List;

// Summy
// 7kyu
// https://www.codewars.com/kata/599c20626bd8795ce900001d/train/java
// 2021-07-18 T:12:23:29
class Exercise_182 {

    static long summy(String stringOfInts) {

        List<String> integersList = Arrays.asList(stringOfInts.split(" "));
        long result = 0;

        for (String num : integersList) {
            result += Long.parseLong(num);
        }
        return result;
    }

    public static void main(String[] args) {
        summy("1 2 3 4 5");
    }

}
/*  static long summy(String stringOfInts) {
        return Arrays
                .stream(stringOfInts.split(" "))
                .mapToLong(num -> Long.parseLong(num))
                 .sum();
    }*/