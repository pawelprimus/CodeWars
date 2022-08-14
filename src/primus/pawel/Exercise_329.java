package src.primus.pawel;

import java.util.Arrays;
import java.util.stream.Collectors;

// Password System
// 7kyu
// https://www.codewars.com/kata/57a23e3753ba332b8e0008da/train/java
//
class Exercise_329 {

  public static String helpZoom(final int[] key) {

    String number = Arrays.stream(key)
        .mapToObj(i -> String.valueOf(i))
        .collect(Collectors.joining());

    return isPalindrome(number) ? "Yes" : "Nn";
  }

  public static boolean isPalindrome(String num) {
    for (int i = 0; i < num.length() / 2; i++) {
      if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    helpZoom(new int[]{1, 1, 0, 0, 0, 0, 1, 1, 0});
  }
}
