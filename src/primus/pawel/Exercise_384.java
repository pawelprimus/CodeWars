package primus.pawel;

import java.util.HashSet;
import java.util.stream.IntStream;

// How many days are we represented in a foreign country?
// 7kyu
// https://www.codewars.com/kata/58e93b4706db4d24ee000096/train/java
// 2022-02-27 T:14:46:51
class Exercise_384 {

    public static int daysRepresented(int[][] trips) {
        HashSet<Integer> days = new HashSet<>();
        for (int i = 0; i < trips.length; i++) {
            IntStream.rangeClosed(trips[i][0], trips[i][1]).forEach(days::add);
        }
        return days.size();
    }

    public static void main(String[] args) {

        daysRepresented(new int[][]{{2, 8}, {220, 229}, {10, 16}});
    }
}
