package primus.pawel;

// Averages of numbers
// 7kyu
// https://www.codewars.com/kata/57d2807295497e652b000139/train/java
// 2021-05-16 T:20:59:41
class Exercise_127 {

    public static double[] averages(int[] numbers) {

        if(numbers == null || numbers.length <= 1) return new double[0];

        double[] results = new double[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            results[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
        }
        return results;
    }

    public static void main(String[] args) {

    }
}
