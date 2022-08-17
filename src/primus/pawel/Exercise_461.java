package src.primus.pawel;

// Reach Me and Sum my Digits
// 6kyu
// https://www.codewars.com/kata/55ffb44050558fdb200000a4/train/java
// 2022-08-17 T:19:55:54

public class Exercise_461 {


  public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
    int patternlIndex = 0;

    for (int i = 0; i < nthterm - 1; i++) {
      if (patternlIndex >= patternl.length) {
        patternlIndex = 0;
      }
      initval += patternl[patternlIndex++];
    }

    return String.valueOf(initval).chars().map(i -> i - 48).reduce(0 , (a, b) -> a+b);
  }

  public static void main(String[] args) {

    System.out.println(sumDigNthTerm(10, new long[]{2, 1, 3}, 6));
    System.out.println(sumDigNthTerm(10, new long[] {2, 1, 3}, 15));
  }

}
