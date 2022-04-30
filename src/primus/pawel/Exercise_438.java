package primus.pawel;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Formatting decimal places #1
// 7kyu
// https://www.codewars.com/kata/5641c3f809bf31f008000042/train/java
// 2022-04-30 T:11:00:04
class Exercise_438 {

    public static double twoDecimalPlaces(double number)
    {
        BigDecimal bg = new BigDecimal(number).setScale(2, RoundingMode.DOWN);
        return bg.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(twoDecimalPlaces(10.1289767789));
    }
}
