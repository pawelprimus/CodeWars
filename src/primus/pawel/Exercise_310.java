package primus.pawel;

// Arithmetic progression
// 7kyu
// https://www.codewars.com/kata/55caf1fd8063ddfa8e000018/train/java
//
class Exercise_310 {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        StringBuilder result = new StringBuilder();

        int number = first;
        result.append(first).append(", ");
        for (int i = 1; i < total; i++) {
            number += step;
            result.append(number).append(", ");
        }

        return result.replace(result.length() -2, result.length()-1, "").toString();
    }
}
/*public static String arithmeticSequenceElements(int first, int step, long total) {
    return LongStream.range(0, total)
      .map(i -> first + step * i)
      .mapToObj(Long::toString)
      .collect(Collectors.joining(", "));
  }
  */