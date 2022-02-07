package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Basics 08: Find next higher number with same Bits (1's)
// 6kyu
// https://www.codewars.com/kata/56bdd0aec5dc03d7780010a5/train/java
// 2022-02-07 T:18:51:47
public class Exercise_364 {
    public static int nextHigher(int n) {
        long initOneCounts = Integer.toBinaryString(n).chars().filter(ch -> ch == '1').count();
        while (true) {
            n++;
            if (initOneCounts == Integer.toBinaryString(n).chars().filter(ch -> ch == '1').count()) {
                return n;
            }
        }
    }

    @Test
    public void basicTests() {
        assertEquals(256, Exercise_364.nextHigher(128));
        assertEquals(2, Exercise_364.nextHigher(1));
        assertEquals(1279, Exercise_364.nextHigher(1022));
        assertEquals(191, Exercise_364.nextHigher(127));
        assertEquals(1253359, Exercise_364.nextHigher(1253343));
    }
}

/* static int nextHigher(int n) {
    return iterate(n + 1, i -> i + 1).filter(i -> Integer.bitCount(i) == Integer.bitCount(n)).findFirst().orElse(0);
  }*/