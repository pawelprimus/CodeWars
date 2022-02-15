package primus.pawel;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// Count all the sheep on farm in the heights of New Zealand
// 7kyu
// https://www.codewars.com/kata/58e0f0bf92d04ccf0a000010/train/java
// 2022-02-15 T:21:26:36
public class Exercise_372 {

    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {

        int totalReturnedSheeps = Arrays.stream(fridayNightCounting).sum();
        totalReturnedSheeps += Arrays.stream(saturdayNightCounting).sum();
        return sheepTotal - totalReturnedSheeps;
    }

    @Test
    public void basicTests() {
        assertEquals(5, Exercise_372.lostSheep(new int[]{1, 2}, new int[]{3, 4}, 15));
        assertEquals(6, Exercise_372.lostSheep(new int[]{3, 1, 2}, new int[]{4, 5}, 21));
    }
}
