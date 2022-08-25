package src.primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Mind the Gap
// 7kyu
// https://www.codewars.com/kata/57c75baffa9fc534f7001475/train/java
// 2022-08-25 T:15:21:04
public class Exercise_466 {

  public static int countMissingCarriages(String train) {
    int[] asci = Stream.of(train.split("")).map(i -> (int)i.charAt(0)).mapToInt(i -> i).toArray();
    int index = 0;
    int result = 0;
    for (int i = 65; i <= asci[asci.length - 1]; i++) {

      if(asci[index] == i){
        index++;
      } else {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(countMissingCarriages("ACDF"));
  }

}
