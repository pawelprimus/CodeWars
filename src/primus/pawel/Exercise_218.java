package primus.pawel;

// Row of the odd triangle
// 6kyu
// https://www.codewars.com/kata/5d5a7525207a674b71aa25b5/train/java
// 2021-09-11 T:15:44:12
class Exercise_218 {

    public static long[] oddRow(int n) {
        long newN = n;
        long firstNumberInNRow = newN * newN - n + 1;
        long[] result = new long[n];

        for (int i = 0; i < newN; i++) {
            result[i] = firstNumberInNRow + i * 2;
        }
        return result;
    }


}
