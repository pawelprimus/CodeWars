package src.primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Simple Fun #170: Sum Groups
// 6kyu
// https://www.codewars.com/kata/58b3c2bd917a5caec0000017/train/java
// 2022-08-17 T:20:11:03
public class Exercise_462 {

  public static int sumGroups(int[] arr) {
    int moduloFlag;
    int sum ;
    boolean isNotReadyToFinish = true;

    List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());

    while (isNotReadyToFinish) {

      List<Integer> copy = new ArrayList<>(list);

      moduloFlag = copy.get(0) % 2 == 0 ? 1 : 0;
      list = new ArrayList<>();
      sum = 0;

      for (Integer integer : copy) {


        if (integer % 2 == moduloFlag) {
          moduloFlag = moduloFlag == 1 ? 0 : 1;
          list.add(sum);
          sum = 0;
        }
        sum += integer;

      }

      list.add(sum);

      if (copy.size() == list.size()) {
        isNotReadyToFinish = false;
      }
    }

    return list.size();
  }


  public static void main(String[] args) {
    System.out.println(sumGroups(new int[]{2, 1, 2, 2, 6, 5, 0, 2, 0, 5, 5, 7, 7, 4, 3, 3, 9}));
  }

}
