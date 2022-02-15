package primus.pawel;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// Double Every Other
// 7kyu
// https://www.codewars.com/kata/5809c661f15835266900010a/train/java
// 2022-02-15 T:21:07:12
public class Exercise_371 {

    public static int[] doubleEveryOther(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                result[i] = a[i];
            } else {
                result[i] = a[i] * 2;
            }
        }
        return result;
    }

    @Test
    void basicTest() {
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a1s = new int[]{1, 4, 3, 8};
        int[] a2 = new int[]{1, 19, 6, 2, 12, -3};
        int[] a2s = new int[]{1, 38, 6, 4, 12, -6};
        int[] a3 = new int[]{-1000, 1653, 210, 0, 1};
        int[] a3s = new int[]{-1000, 3306, 210, 0, 1};
        assertArrayEquals(a1s, Exercise_371.doubleEveryOther(a1), "For input [1,2,3,4]");
        assertArrayEquals(a2s, Exercise_371.doubleEveryOther(a2), "For input [1,19,6,2,12,-3]");
        assertArrayEquals(a3s, Exercise_371.doubleEveryOther(a3), "For input [-1000,1653,210,0,1]");
    }
}
