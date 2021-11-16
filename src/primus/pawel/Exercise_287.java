package primus.pawel;

// Plus - minus - plus - plus - ... - Count
// 7kyu
// https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca/train/java
// 2021-11-16 T:21:41:27
class Exercise_287 {

    public static int signChange(int[] arr) {

        if(arr.length == 0){
            return 0;
        }

        boolean isPositive;
        int count = 0;
        if (arr[0] >= 0) {
            isPositive = true;
        } else {
            isPositive = false;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (!isPositive) {
                    count++;
                    isPositive = true;
                }
            } else {
                if (isPositive) {
                    count++;
                    isPositive = false;
                }
            }

        }
        return count;
    }
}
