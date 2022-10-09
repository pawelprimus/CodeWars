package src.primus.pawel;

import java.util.Arrays;
import java.util.stream.Collectors;

// V A P O R C O D E
// 7kyu
// https://www.codewars.com/kata/5966eeb31b229e44eb00007a/train/java
// 2022-10-09 T:15:41:19
public class Exercise_487 {


  public static String vaporcode(String s) {
    return Arrays.asList(s.split(""))
        .stream().map(i -> vaporChar(i))
        .collect(Collectors.joining()).trim();
  }

  private static String vaporChar(String charToVapor) {
    return charToVapor.equals(" ") ? "" : charToVapor.toUpperCase() + "  ";
  }
}
