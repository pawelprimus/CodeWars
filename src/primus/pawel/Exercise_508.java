package src.primus.pawel;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//
// 7kyu
// https://www.codewars.com/kata/5838e2978bbc04b7cd000008/train/java
// 2023-03-05 T:12:30:00
public class Exercise_508 {


    public static String tenGreenBottles(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 1; i--) {
            sb.append(getLyrics(i));
        }
        sb.append(getFinalLyrics());
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(tenGreenBottles(4));
    }

    private static String getLyrics(int n) {
        return bootlesMap.get(n) + " hanging on the wall,\n" +
                bootlesMap.get(n) + " hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be " + bootlesMap.get(n - 1).toLowerCase() + " hanging on the wall.\n\n";
    }

    private static String getFinalLyrics() {
        return "One green bottle hanging on the wall,\n" +
                "One green bottle hanging on the wall,\n" +
                "If that one green bottle should accidentally fall,\n" +
                "There'll be no green bottles hanging on the wall.\n";
    }

    private static final Map<Integer, String> bootlesMap;

    static {
        Map<Integer, String> aMap = new TreeMap<>();
        aMap.put(1, "One green bottle");
        aMap.put(2, "Two green bottles");
        aMap.put(3, "Three green bottles");
        aMap.put(4, "Four green bottles");
        aMap.put(5, "Five green bottles");
        aMap.put(6, "Six green bottles");
        aMap.put(7, "Seven green bottles");
        aMap.put(8, "Eight green bottles");
        aMap.put(9, "Nine green bottles");
        aMap.put(10, "Ten green bottles");
        bootlesMap = Collections.unmodifiableMap(aMap);
    }

}
