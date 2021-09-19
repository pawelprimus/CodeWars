package primus.pawel;

// Adding values of arrays in a shifted way
// 7kyu
// https://www.codewars.com/kata/57c7231c484cf9e6ac000090/train/java
// 2021-09-19 T:15:56:45
class Exercise_223_todo {

    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int arraysAmount = arrayOfArrays.length;
        int fullLength = arrayOfArrays[0].length + (arraysAmount - 1)*shift;
        int oneArrayLength = arrayOfArrays[0].length;
        int[] resultArray = new int[fullLength];

        for (int i = 0; i < arraysAmount; i++) {
            for (int j = 0; j < oneArrayLength; j++) {
                resultArray[j + i*shift] =+  arrayOfArrays[i][j];
            }
        }
        return resultArray;
    }


    public static void main(String[] args) {

        int[][] arrayOfArrays = new int[][]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 7, 7, -7, 7, 7}, new int[]{1, 1, 1, 1, 1, 1}};
        System.out.println(addingShifted(arrayOfArrays, 3));


    }

}
