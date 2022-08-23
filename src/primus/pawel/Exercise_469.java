package src.primus.pawel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// Suzuki needs help lining up his students!
// 7kyu
// https://www.codewars.com/kata/5701800886306a876a001031/train/java
// 2022-08-23 T:17:14:04
public class Exercise_469 {

  public static String[] lineupStudents(String students)
  {
    return Arrays.asList(students.split(" ")).stream()
        .sorted(Exercise_469::compare)
        .toArray(String[]::new);
  }

  public static int compare(String o1, String o2) {
    if(o1.length() == o2.length()){
      return o2.compareTo(o1);
    }
    return o1.length() > o2.length() ? -1 : 1;
  }

  public static void main(String[] args) {
    lineupStudents("Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi Takeshi");
  }
}
