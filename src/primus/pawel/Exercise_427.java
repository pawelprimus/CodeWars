package primus.pawel;

// String prefix and suffix
// 7kyu
// https://www.codewars.com/kata/5ce969ab07d4b7002dcaa7a1/train/java
// 2022-04-19 T:23:38:03
class Exercise_427 {

    public static int solve(String s) {
        final int LENGTH = s.length();

        if (LENGTH < 2) {
            return 0;
        }
        if (LENGTH == 2) {
            return s.charAt(0) == s.charAt(1) ? 1 : 0;
        }

        final int HALF_OF_S = LENGTH / 2;
        int isEven = LENGTH % 2 == 0 ? 0 : 1;

        String firstPart = s.substring(0, HALF_OF_S);
        String secondPart = s.substring(HALF_OF_S + isEven);

        for (int i = 0; i < HALF_OF_S; i++) {
            if (firstPart.substring(0, HALF_OF_S - i).equals(secondPart.substring(i, HALF_OF_S))) {
                return HALF_OF_S - i;
            }
        }
        return 0;
    }


}
