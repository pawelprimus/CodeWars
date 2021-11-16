package primus.pawel;

import java.util.Arrays;

// Alphabet symetry
// 7kyu
// https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0/train/java
// 2021-05-07 T:21:07:19
class Exercise_111 {
    public static int[] solve(String[] arr) {
        int[] results = new int[arr.length];
        String[] copyArr = Arrays.copyOf(arr, arr.length);
        int sum = 0;
        for (int j = 0; j < copyArr.length; j++) {
            for (int i = 0; i < copyArr[j].length(); i++) {
                if (Integer.valueOf(copyArr[j].toLowerCase().charAt(i)) == 97 + i) {
                    sum++;
                }
            }
            results[j] = sum;
            sum = 0;
        }
        return results;
    }

    public static void main(String[] args) {

        solve(new String[]{"abcde", "thedefgh", "xyzDEFghijabc"});
    }
}
/**/