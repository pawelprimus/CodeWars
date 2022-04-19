package primus.pawel;

import java.util.stream.IntStream;

// Extra Perfect Numbers (Special Numbers Series #7)
// 7kyu
// https://www.codewars.com/kata/5a662a02e626c54e87000123/train/java
// 2022-04-19 T:23:21:54
class Exercise_422 {

    public static int[] extraPerfect(int number) {
        return IntStream.rangeClosed(1, number)
                .filter(i -> isPerfect(i))
                .toArray();
    }

    static boolean isPerfect(int number) {
        if (number % 2 == 0) {
            return false;
        }
        String bit = Integer.toBinaryString(number);

        if (bit.charAt(0) == '1' && bit.charAt(bit.length() - 1) == '1') {
            return true;
        }
        return false;
    }


}
