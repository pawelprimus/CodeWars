package primus.pawel;

// Simple Fun #37: House Numbers Sum
// 7kyu
// https://www.codewars.com/kata/58880c6e79a0a3e459000004/train/java
// 2022-05-09 T:18:27:31
class Exercise_440 {
    public static int houseNumbersSum(final int[] arr) {

        int sum = 0;
        for (int number : arr) {
            sum += number;
            if (number == 0) {
                return sum;
            }

        }

        return sum;
    }
}
/*  static int houseNumbersSum(int[] arr) {
    return of(arr).takeWhile(i -> i > 0).sum();
  }
  */
