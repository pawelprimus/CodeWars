package primus.pawel;
// Money, Money, Money
// 7kyu
// https://www.codewars.com/kata/563f037412e5ada593000114/train/java
// 2021-12-07 T:19:50:15
class Exercise_307 {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        if (desired == principal){
            return 0;
        }
        double currentAmount = principal + calculateProfit( principal, interest,  tax);
        int counter = 1;
        while (currentAmount < desired){
            currentAmount = currentAmount + calculateProfit( currentAmount, interest,  tax);
            counter++;
        }
        return counter;
    }


    public static double calculateProfit(double amount, double interest, double tax){
        return (amount*interest) - (amount*interest*tax);
    }


    public static void main(String[] args) {

        System.out.println(calculateProfit(1000,0.05,0.18));

    }
}
