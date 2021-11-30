package primus.pawel;

// Alternate Square Sum
// 7kyu
// https://www.codewars.com/kata/559d7951ce5e0da654000073/train/java
// 2021-11-30 T:20:42:12
class Exercise_301 {

    public static int alternateSqSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            } else {
                sum += arr[i] * arr[i];
            }
        }
        return sum;
    }


}
