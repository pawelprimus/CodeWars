package primus.pawel;

// Pizza Payments
// 7kyu
// https://www.codewars.com/kata/5b043e3886d0752685000009/train/java
// 2022-04-24 T:12:46:33
class Exercise_433 {

    public static double michaelPays(double cost) {
        if (cost < 5.0) {
            return round(cost, 2 );
        }
        double oneThird = cost / 3.0;
        double twoThird = cost * (2.0 / 3.0);

        return oneThird <= 10.0 ? round(twoThird, 2) : round((twoThird + (oneThird - 10.0)), 2);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
