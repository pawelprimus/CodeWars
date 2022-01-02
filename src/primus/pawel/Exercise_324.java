package primus.pawel;
// Find sum of top-left to bottom-right diagonals
// 7kyu
// https://www.codewars.com/kata/5497a3c181dd7291ce000700/train/java
// 2022-01-02 T:13:04:13
class Exercise_324 {

    public static int diagonalSum(final int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


}

/*  public static int diagonalSum(final int[][] matrix) {
    return IntStream.range(0, matrix.length).map(i -> matrix[i][i]).sum();
  }*/