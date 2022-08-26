package src.primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Common Substrings
// 7kyu
// https://www.codewars.com/kata/5669a5113c8ebf16ed00004c/train/java
// 2022-08-26 T:18:09:40
public class Exercise_465 {

  public static boolean SubstringTest(String str1, String str2) {

    if (str1.length() <= 1 || str2.length() <= 1) {
      return false;
    }

    List<String> wordsToCheck;

    if (str1.length() < str2.length()) {
      wordsToCheck = getAllSubstrings(str1);
      str2 = str2.toUpperCase();
      for (String word : wordsToCheck) {
        if (str2.contains(word)) {
          return true;
        }
      }

    } else {
      wordsToCheck = getAllSubstrings(str2);
      str1 = str1.toUpperCase();

      for (String word : wordsToCheck) {
        if (str1.contains(word)) {
          return true;
        }
      }
    }

    return false;
  }

  static List<String> getAllSubstrings(String line) {
    List<String> subsList = new ArrayList<>();
    for (int i = 2; i <= line.length(); i++) {
      for (int j = 0; j <= line.length() - i; j++) {
        subsList.add(line.substring(j, j + i).toUpperCase());
      }
    }
    return subsList;
  }

  public static void main(String[] args) {
    getAllSubstrings("abcd").forEach(System.out::println);
  }

}
