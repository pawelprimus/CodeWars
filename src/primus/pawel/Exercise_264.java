package primus.pawel;

// Series of integers from m to n
// 7kyu
// https://www.codewars.com/kata/5841f680c5c9b092950001ae/train/java
// 2021-10-28 T:22:15:46
class Exercise_264 {
    public static int[] generateIntegers(final int m, final int n) {
        int[] resultTab = new int[n - m + 1];
        int index = 0;
        for (int i = m; i <= n; i++) {
            resultTab[index] = i;
            index++;
        }
        return resultTab;
    }
}
