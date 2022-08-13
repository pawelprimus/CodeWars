package src.primus.pawel;

// Find the missing term in an Arithmetic Progression
// 6kyu
// https://www.codewars.com/kata/52de553ebb55d1fca3000371/train/javascript
// 2022-08-13 T:20:05:10

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Exercise_458 {

  public static void main(String[] args) {

    System.out.println(findMissing(new int[]{90, -107, -304, -501, -698, -895, -1289, -1486, -1683, -1880, -2077, -2274, -2471, -2668, -2865}));

    System.out.println("Hello");
  }

  public static int findMissing(int[] numbers) {

    if (numbers[1] < numbers[0]) {
      for (int start = 0, end = numbers.length - 1; start <= end; start++, end--) {
        int aux = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = aux;
      }
    }

    int firstDifference = numbers[1] - numbers[0];
    int edgeDifference = numbers[numbers.length - 1] - numbers[numbers.length - 2];

    if (firstDifference == edgeDifference) {

      if (firstDifference == 0) {
        return numbers[0];
      }

      for (int i = 1; i < numbers.length; i++) {
        if (Math.abs(numbers[i + 1] - numbers[i]) > firstDifference) {
          return numbers[i] + firstDifference;
        }
      }
    }

    return firstDifference > edgeDifference ? numbers[0] + edgeDifference : numbers[numbers.length - 1] - firstDifference;
  }

  public static Object[] reverse(int[] arr) {
    List<Object> list = Arrays.asList(arr);
    Collections.reverse(list);
    return list.toArray();
  }

}

