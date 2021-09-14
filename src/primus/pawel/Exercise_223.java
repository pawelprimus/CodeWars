package primus.pawel;

//
//
//
//
class Exercise_223 {

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
