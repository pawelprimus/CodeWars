package primus.pawel;

import java.util.Arrays;

// Minimum Steps (Array Series #6)
// 7kyu
// https://www.codewars.com/kata/5a91a7c5fd8c061367000002/train/java
// 2021-10-27 T:19:50:56
class Exercise_260 {

    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int sum = numbers[0];
        if (sum >= k) {
            return 0;
        }
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if(sum >= k){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(minimumSteps(new int[]{8,9,4,2}, 23));
    }

}
