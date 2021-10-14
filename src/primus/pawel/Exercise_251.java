package primus.pawel;

import java.util.Arrays;

// Sums of Parts
// 6kyu
// https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java
// 2021-10-14 T:20:49:42
class Exercise_251 {

    public static int[] sumParts(int[] ls) {

        int[] result = new int[ls.length + 1];
        if (ls.length == 0) {
            result[0] = 0;
            return result;
        }
        int sum = Arrays.stream(ls).sum();
        result[0] = sum;
        for (int i = 1; i < ls.length; i++) {
            result[i] = result[i - 1] - ls[i - 1];
            System.out.println(result[i]);
        }
        result[result.length - 1] = 0;
        return result;
    }

    public static void main(String[] args) {

        sumParts(new int[]{0, 1, 3, 6, 10});
    }
}
