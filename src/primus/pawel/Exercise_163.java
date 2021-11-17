package primus.pawel;

// Pascal's Triangle #2
// 6kyu
// https://www.codewars.com/kata/52945ce49bb38560fe0001d9/train/java
// 2021-06-24 T:22:45:19
class Exercise_163 {

    public static int[][] pascal(int depth) {

        int[][] resultArr = new int[depth][];
        int[] arr = new int[]{1};
        resultArr[0] = arr;

        if (depth == 0) {
            return null;
        }

        if (depth == 1) {
            return resultArr;
        }
        arr = new int[]{1, 1};
        resultArr[1] = arr;

        if (depth == 2) {

            return resultArr;
        }

        for (int i = 2; i < depth; i++) {

            arr = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    arr[0] = resultArr[i - 1][0];
                } else if (j == i) {
                    arr[j] = resultArr[i - 1][j - 1];
                } else {
                    arr[j] = resultArr[i - 1][j - 1] + resultArr[i - 1][j];

                }
            }
            resultArr[i] = arr;
        }

        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                System.out.print(resultArr[i][j] + " ") ;
            }
            System.out.println();
        }
        return resultArr;
    }


    public static void main(String[] args) {
        pascal(5);
    }
}

