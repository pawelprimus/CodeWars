package src.primus.pawel;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Exercise_486_todo {

  public static void main(String[] args) {
    System.out.println(numberOfRoutes(7,8));
  }

  public static BigInteger numberOfRoutes (int m, int n) {
    return  LongStream.range(m + 1, m + n + 1).mapToObj(x ->new BigInteger(String.valueOf(x))).reduce((x, y)-> x.multiply(y)).get().
        divide(LongStream.range(1, n + 1).mapToObj(x ->new BigInteger(String.valueOf(x))).reduce((x,y)-> x.multiply(y)).get());
  }
}
