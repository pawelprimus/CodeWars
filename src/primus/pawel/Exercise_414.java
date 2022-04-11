package primus.pawel;

import java.util.Arrays;

// Last Survivor
// 7kyu
// https://www.codewars.com/kata/609eee71109f860006c377d1/train/java
// 2022-04-11 T:23:53:40
class Exercise_414 {

    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);
        for (final int coord : coords) {
            sb.deleteCharAt(coord);
        }
        return sb.toString();
    }
}
