package primus.pawel;
// Tidy Number (Special Numbers Series #9)
// 7kyu
// https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java
// 2022-01-11 T:21:42:33

class Exercise_338 {

    public static boolean tidyNumber(int number) {
        char[] chars = String.valueOf(number).toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
