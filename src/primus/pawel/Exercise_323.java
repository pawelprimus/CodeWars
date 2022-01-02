package primus.pawel;

import java.util.Arrays;

// Maximum Gap (Array Series #4)
// 7kyu
// https://www.codewars.com/kata/5a7893ef0025e9eb50000013/train/java
// 2022-01-02 T:13:10:12
class Exercise_323 {

    public static int maxGap(int[] numbers) {
        int[] copiedArr = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copiedArr);

        int maximumGap = Integer.MIN_VALUE;
        int currentGap;
        for (int i = 1; i < copiedArr.length; i++) {
            currentGap = copiedArr[i] - copiedArr[i - 1];
            if (currentGap > maximumGap) {
                maximumGap = currentGap;
            }
        }
        return maximumGap;
    }
}
/*  public static int maxGap(int[] numbers){
        Arrays.sort(numbers);
        return IntStream.range(1,numbers.length).map(i -> numbers[i] - numbers[i-1]).max().getAsInt(); // Do your magic!
    }*/