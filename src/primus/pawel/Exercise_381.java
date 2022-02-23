package primus.pawel;

// Nice Array
// 7kyu
// https://www.codewars.com/kata/59b844528bcb7735560000a0/train/java
// 2022-02-23 T:20:11:49
class Exercise_381 {

    public static boolean isNice(Integer[] arr) {
        if (arr.length < 2) {
            return false;
        }
        for (final Integer integer : arr) {
            if (!findAnyCorrect(integer, arr)) {
                return false;
            }
        }
        return true;
    }

    public static boolean findAnyCorrect(int num, Integer[] arr) {

        for (int arrNumber : arr) {
            if ((num == arrNumber - 1) || (num == arrNumber + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isNice(new Integer[]{2, 5, 4, 3, 2}));
    }

}
