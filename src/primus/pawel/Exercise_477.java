package src.primus.pawel;

import java.util.Arrays;
import java.util.HashSet;

// Closest to Zero
// 7kyu
// https://www.codewars.com/kata/59887207635904314100007b/train/java
// 2022-09-04 20:23
public class Exercise_477 {

  public static Integer find(int[] arr) {
    int minInt = Arrays.stream(arr).map(Math::abs).min().getAsInt();
    if (minInt == 0) {
      return 0;
    }
    HashSet<Integer> set = new HashSet<>();
    for (Integer number : arr) {
      if (Math.abs(number) == minInt) {
        set.add(number);
      }
    }
    return set.size() == 2 ? null : set.iterator().next();
  }

  public static void main(String[] args) {

    //find(new int[]{10, 3, 9, 1});
    //find(new int[]{2, 4, -1, -3});
    find(new int[]{5, 1, -1, 2, -10});
  }


}
