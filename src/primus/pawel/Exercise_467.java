package src.primus.pawel;

import java.util.Arrays;
import java.util.Collections;

// Rotate Array
// 7kyu
// https://www.codewars.com/kata/5469e0798a3502f4a90005c9/train/java
// 2022-08-24 T:19:58:55
public class Exercise_467 {

  public static Object[] rotate(Object[] data, int n) {

    if (n == 0) {
      return data;
    }
    Object[] result = new Object[data.length];
    int rotateIndex = n % data.length;
    if (rotateIndex < 0) {
      rotateIndex = data.length + rotateIndex;
    }

    for (int i = 0; i < data.length; i++) {
      if (rotateIndex >= data.length) {
        rotateIndex = 0;
      }
      result[rotateIndex] = data[i];
      rotateIndex++;
    }
    return result;
  }


  public static void main(String[] args) {

    Arrays.stream(rotate(new Object[]{1, 2, 3, 4, 5}, -1)).forEach(System.out::println);
    System.out.println("---------");

  }

}
