package primus.pawel;

import java.util.Arrays;

// Casino chips
// 6kyu
// https://www.codewars.com/kata/5e0b72d2d772160011133654/train/java
// 2021-07-29 T:19:01:27
class Exercise_191 {

    public static int solve(int[] arr) {
        int[] copyOfArr = Arrays.copyOf(arr, 3);
        Arrays.sort(copyOfArr);
        int count = 0;
        while (copyOfArr[0] != 0 || copyOfArr[1] != 0) {
            copyOfArr[1] -= 1;
            copyOfArr[2] -= 1;
            Arrays.sort(copyOfArr);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
