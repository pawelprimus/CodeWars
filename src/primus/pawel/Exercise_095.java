package primus.pawel;

// Buying a car
// 6kyu
// https://www.codewars.com/kata/554a44516729e4d80b000012/train/java
// 2021-04-24 T:00:26:44
class Exercise_095 {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double startPriceOldDouble = startPriceOld;
        double startPriceNewDouble = startPriceNew;
        double goal = startPriceOldDouble - startPriceNewDouble;
        int savedMoney = 0;
        double lossPercentage = percentLossByMonth / 100;
        while (goal < 0) {
            savedMoney += savingperMonth;
            month++;
            if (month % 2 == 0) lossPercentage += 0.005;
            startPriceNewDouble = calculateNewPrice(startPriceNewDouble, lossPercentage);
            startPriceOldDouble = calculateNewPrice(startPriceOldDouble, lossPercentage);
            goal = startPriceOldDouble - startPriceNewDouble + savedMoney;
        }

        return new int[]{month, (int) Math.round(goal)};
    }

    static double calculateNewPrice(double price, double lossPercentage) {
        return (price - price * lossPercentage);
    }


    public static void main(String[] args) {
        nbMonths(2000, 8000, 1000, 1.5);
    }

}
