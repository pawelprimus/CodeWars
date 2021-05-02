package primus.pawel;

import java.util.Arrays;

// minimum sum of array
// 7kyu
// https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/train/java
// 2021-05-01 T:20:44:49
class Exercise_102 {

    public static int minSum(int[] passed)
    {
        int result = 0;
        final int[] clonedArr = passed.clone();
        Arrays.sort(clonedArr);
        for (int i = 0; i < clonedArr.length/2; i++) {
            result += clonedArr[i]* clonedArr[clonedArr.length-1-i];
        }
        return result;
    }

    public static void main(String[] args) {
        minSum((new int[]{12,6,10,26,3,24}));
    }


}
