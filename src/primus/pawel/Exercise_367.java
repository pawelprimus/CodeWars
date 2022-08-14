package src.primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Cartesian neighbors
// 7kyu
// https://www.codewars.com/kata/58989a079c70093f3e00008d/train/java
//
public class Exercise_367 {

  public static int[][] cartesianNeighbor(int x, int y) {

    int[][] result = new int[8][2];

    result[0][0] = x;
    result[0][1] = y + 1;

    result[4][0] = x;
    result[4][1] = y - 1;

    result[1][0] = x + 1;
    result[1][1] = y + 1;

    result[2][0] = x + 1;
    result[2][1] = y;

    result[3][0] = x + 1;
    result[3][1] = y - 1;

    result[5][0] = x - 1;
    result[5][1] = y - 1;

    result[6][0] = x - 1;
    result[6][1] = y;

    result[7][0] = x - 1;
    result[7][1] = y + 1;

    return result;
  }

  @Test
  public void ExampleTest() {
    assertArrayEquals(new int[][]{{1, 1}, {1, 2}, {1, 3}, {2, 1}, {2, 3}, {3, 1}, {3, 2}, {3, 3}}, Exercise_367.cartesianNeighbor(2, 2));
  }
}
