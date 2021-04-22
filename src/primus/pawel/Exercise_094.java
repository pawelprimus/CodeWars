package primus.pawel;

// Most digits
// 7 kyu
// https://www.codewars.com/kata/58daa7617332e59593000006/train/java
// 2021-04-23 T:01:37:16
class Exercise_094 {

    public static int findLongest(int[] numbers) {
        int result = Integer.MIN_VALUE;
        int resultIndex = 0;
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            temp =numbers[i];
            if(temp < 0 ) temp *= -1;
            if (String.valueOf(temp).length() > result) {
                result = String.valueOf(temp).length();
                resultIndex = i;
            }
        }
        return numbers[resultIndex];
    }

}

/*public class MostDigits {
  public static int findLongest(int[] numbers) {
    int index = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
        index = i;
      }
    }
    return numbers[index];
  }
}*/