package primus.pawel;

import java.awt.geom.Point2D;
import java.text.DecimalFormat;

// Cartesian coordinates from degree angle
// 7kyu
// https://www.codewars.com/kata/555f43d8140a6df1dd00012b/train/java
// 2022-01-31 T:20:30:14
class Exercise_357 {

    private static DecimalFormat df = new DecimalFormat("0.0000000000");

    public static Point2D coordinates(Double degrees, Double radius) {

        double x = radius * Math.cos(Math.toRadians(degrees));
        double y = radius * Math.sin(Math.toRadians(degrees));

        double xFormatted = Double.parseDouble(new DecimalFormat("0.0000000000").format(x));
        double yFormatted = Double.parseDouble(new DecimalFormat("0.0000000000").format(y));

        return new Point2D.Double(xFormatted, yFormatted);
    }

    public static void main(String[] args) {
        System.out.println(coordinates(45.0, 1.0));
    }


}

/* public Double round(Double d, int p) {
    return new BigDecimal(d).setScale(p,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().doubleValue();
  }

  */
