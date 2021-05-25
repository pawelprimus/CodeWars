package primus.pawel;

// Are the numbers in order?
// 7kyu
// https://www.codewars.com/kata/56b7f2f3f18876033f000307/train/java
// 2021-04-24 T:16:00:59
class Exercise_096 {
    public static boolean isAscOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }


}
