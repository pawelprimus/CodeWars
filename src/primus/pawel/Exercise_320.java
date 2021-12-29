package primus.pawel;

// Incrementer
// 7kyu
// https://www.codewars.com/kata/590e03aef55cab099a0002e8/train/java
// 2021-12-29 T:19:49:06
class Exercise_320 {

    public static int[] incrementer(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] result = new int[numbers.length];
        int currentNum;
        for (int i = 0; i < numbers.length; i++) {
            currentNum = numbers[i] + i + 1;
            if (currentNum >= 9) {
                result[i] = currentNum % 10;
            } else {
                result[i] = currentNum;
            }
        }
        return result;
    }

}

/* public static int[] incrementer(int[] numbers) {
    return IntStream.range(0, numbers.length).map(i -> (numbers[i] + i + 1) % 10).toArray();
  }
  */
