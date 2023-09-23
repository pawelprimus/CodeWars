package src.primus.pawel;

// The Freeway Game
// 6kyu
// https://www.codewars.com/kata/59279aea8270cc30080000df/train/java
// 2023-09-22 T:21:34:54
public class Exercise_526 {

    public static int freewayGame(final double distKmToExit, final double mySpeedKph, final double[][] otherCars) {
        double driveTime = distKmToExit * 60 / mySpeedKph;
        int result = 0;
        for (double[] otherCar : otherCars) {
            double otherCarTimeDiff = otherCar[0];
            double otherCarSpeed = otherCar[1];

            double distanceMadeByOtherCar = otherCarSpeed * (otherCarTimeDiff * (-1.0) + driveTime) / 60;

            if (otherCarTimeDiff < 0) {
                if (distKmToExit > distanceMadeByOtherCar) {
                    result++;
                }
            } else {
                if (distKmToExit < distanceMadeByOtherCar) {
                    result--;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        final int count = freewayGame(50.0, 130.0, new double[][]{{-1.0, 120.0}, {-1.5, 120.0}});
        System.out.println(count);
    }
}
