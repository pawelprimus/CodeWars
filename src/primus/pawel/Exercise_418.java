package primus.pawel;

// Single character palindromes
// 6kyu
// https://www.codewars.com/kata/5a2c22271f7f709eaa0005d3/train/java
// 2022-04-12 T:19:30:30
class Exercise_418 {

    private static final String OK = "OK";
    private static final String REMOVE_ONE = "remove one";
    private static final String NOT_POSSIBLE = "not possible";

    public static String solve(String s) {
        if (checkIfPalindrome(s)) {
            return OK;
        }
        StringBuilder sWithoutOneChar;
        for (int i = 0; i < s.length(); i++) {
            sWithoutOneChar = new StringBuilder(s).deleteCharAt(i);
            if (checkIfPalindrome(sWithoutOneChar.toString())) {
                return REMOVE_ONE;
            }

        }
        return NOT_POSSIBLE;
    }

    public static boolean checkIfPalindrome(final String s) {
        if (s.length() == 1) return true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }


}
