package primus.pawel;
// Speed Control
// 7kyu
// https://www.codewars.com/kata/56484848ba95170a8000004d/train/java
// 2021-10-11 T:19:15:59
class Exercise_247 {

    public static int gps(int s, double[] x) {
        if(x.length <= 1) {
            return 0;
        }

        double fastestInterval = Integer.MIN_VALUE;

        double currentInterval = 0;
        for (int i = 1; i < x.length; i++) {
            currentInterval = calculateInterval(x[i] - x[i-1], s);
            System.out.println(currentInterval);
            if(currentInterval> fastestInterval){
                fastestInterval = currentInterval;
            }
        }
        return (int) fastestInterval;
    }

    public static double calculateInterval(double interval, int seconds){
        return 3600*interval/seconds;
    }

    public static void main(String[] args) {

         double[] x =  {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84};

         gps(20, x);
    }


}
