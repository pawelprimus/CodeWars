package primus.pawel;

// Lost number in number sequence
// 7kyu
// https://www.codewars.com/kata/595aa94353e43a8746000120/train/java
// 2021-09-09 T:18:35:32
class Exercise_208 {

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {

        if (arr.length == mixedArr.length) {
            return 0;
        }
        
        int sumArr = 0;
        int sumMixedArr = 0;

        for (int i = 0; i < mixedArr.length; i++) {
            sumArr += arr[i];
            sumMixedArr += mixedArr[i];
        }
        sumArr += arr[arr.length - 1];
        return sumArr - sumMixedArr;
    }

}
