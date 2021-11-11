package primus.pawel;

// Simple string indices
// 7kyu
// https://www.codewars.com/kata/5a24254fe1ce0ec2eb000078/train/java
// 2021-11-11 T:13:03:00
class Exercise_282 {

    private static final Character LEFT_BRACKET = '(';
    private static final Character RIGHT_BRACKET = ')';

    public static int solve(String str, int index) {

        Character c;
        c = str.charAt(index);

        if (c != LEFT_BRACKET) {
            return -1;
        }

        int counter = 1;

        for (int i = index + 1; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == RIGHT_BRACKET) {
                counter--;
            }
            if (c == LEFT_BRACKET) {
                counter++;
            }
            if (counter == 0) {
                return i;
            }
        }
        return -1;
    }
}
