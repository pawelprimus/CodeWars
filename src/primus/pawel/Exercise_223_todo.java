package primus.pawel;

//
//
// https://www.codewars.com/kata/57c7231c484cf9e6ac000090/train/java
//
class Exercise_223_todo {

    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int fullLength = arrayOfArrays[0].length + shift;
        int oneArrayLength = arrayOfArrays[0].length;
        int[] resultArray = new int[oneArrayLength + shift];

        int currentNum = 0;
        for (int i = 0; i < fullLength; i++) {
            if (i < oneArrayLength) {
                currentNum += arrayOfArrays[0][i];
            }

            if (i >= shift) {
                currentNum += arrayOfArrays[1][i - shift];
            }

            resultArray[i] = currentNum;
            currentNum = 0;
        }

        return resultArray;
    }

}
