package src.primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Max sum between two negatives
// 7kyu
// https://www.codewars.com/kata/6066ae080168ff0032c4107a
// 2023-04-27 T:22:22:26
public class Exercise_519 {

    public static int maxSum(int[] arr) {

        int firstNegativeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        int currentSum = 0;
        int maxSum = 0;
        for (int i = firstNegativeIndex + 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
                currentSum = 0;
            } else {
                currentSum += arr[i];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{-1, 6, -2, 3, 5, -7}));
    }
}
