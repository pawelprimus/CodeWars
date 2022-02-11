package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Cartesian neighbors
// 7kyu
// https://www.codewars.com/kata/58989a079c70093f3e00008d/train/java
//
public class Exercise_367_todo {

    public static int[][] cartesianNeighbor(int x, int y) {

        int[][] result = new int[8][2];

        return result;
    }

    @Test
    public void ExampleTest() {
        assertArrayEquals(new int[][]{{1, 1}, {1, 2}, {1, 3}, {2, 1}, {2, 3}, {3, 1}, {3, 2}, {3, 3}}, Exercise_367_todo.cartesianNeighbor(2, 2));
    }
}
