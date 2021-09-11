package primus.pawel;
// Matrix Addition
// 6kyu
// https://www.codewars.com/kata/526233aefd4764272800036f/train/java
// 2021-09-11 T:15:37:35
class Exercise_217 {

    public static int[][] matrixAddition(int[][] a, int[][] b) {

        int [][] additionResult = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                additionResult[i][j] = a[i][j] + b[i][j];
            }
        }

        return additionResult;
    }
}
