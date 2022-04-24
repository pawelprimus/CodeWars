package primus.pawel;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

// Predict your age!
// 7kyu
// https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java
// 2022-04-24 T:12:56:12
public class Exercise_428 {

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {

        int[] arr = new int[]{age1, age2, age3, age4, age5, age6, age7, age8};
        double sumOfSquaredNumbersArray = IntStream.of(arr).mapToObj(i -> i * i).reduce(0, Integer::sum);
        double result = Math.sqrt(sumOfSquaredNumbersArray) / 2;
        return (int) result;
    }


    @Test
    public void FixedTests() {
        assertEquals(86, Exercise_428.predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        assertEquals(79, Exercise_428.predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }
}
