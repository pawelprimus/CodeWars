package primus.pawel;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.LinkedList;

// Going to zero or to infinity?
// 5kyu
// https://www.codewars.com/kata/55a29405bc7d2efaff00007c/train/java
// 2021-05-29 T:16:45:58
class Exercise_142 {

    public static double going(int n) {
        double result = 1.0;
        double frac = 1.0;
        while (n > 1) {
            frac /= n--;
            result += frac;
        }
        return (int) (result * 1e6) / 1e6;
    }

    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {
            System.out.println(i + " -> " + going(i));
        }

    }


}


/*public class Suite {
  private static final BigInteger BIG_MAX = BigInteger.valueOf(10000000000L);
  private static final BigDecimal UNLIMITED_ONE = new BigDecimal(1, MathContext.DECIMAL128);
  public static double going(int n) {
    BigDecimal running = UNLIMITED_ONE;
    for(int i = (n > 150 ? n - 150 : 1); i < n; i++) {
      BigInteger amt = IntStream.range(i + 1, n + 1).mapToObj(j -> BigInteger.valueOf(j)).reduce(BigInteger.ONE, (p, c) -> p.multiply(c));
      if(amt.compareTo(BIG_MAX) < 0) {
        running = running.add(UNLIMITED_ONE.divide(new BigDecimal(amt, MathContext.DECIMAL128), MathContext.DECIMAL128), MathContext.DECIMAL128);
      }
    }
    return running.scaleByPowerOfTen(6).setScale(0, RoundingMode.FLOOR).scaleByPowerOfTen(-6).doubleValue();
  }
}
*/
