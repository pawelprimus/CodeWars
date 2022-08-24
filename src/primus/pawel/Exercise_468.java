package src.primus.pawel;

// Matrix Addition of Elements
// 7kyu
// https://www.codewars.com/kata/58bc8304b238c8e29b0000f6/train/java
// 2022-08-24 T:19:48:33
public class Exercise_468 {

  public static int sumOfElements(int matrix[][]) {
    int sum = 0;

    for (int[] tab : matrix) {
      for (int i : tab) {
        sum += i;
      }
    }
    return sum;
  }

}

/*public static int sumOfElements(int matrix[][]) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }    */
