package src.primus.pawel;

// Simple Fun #63: Shape Area
// 7kyu
// https://www.codewars.com/kata/5893e0c41a88085c330000a0/train/java
// 2022-09-17 T:19:24:49
public class Exercise_478 {

  public static int shapeArea(int n) {
    int result = 2 * n - 1;
    for (int i = n - 1; i >= 1; i--) {
      result += 2 * (2 * i - 1);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(shapeArea(3));
  }
}
