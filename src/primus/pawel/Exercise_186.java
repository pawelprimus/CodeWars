package primus.pawel;

// Compare Strings by Sum of Chars
// 7kyu
// https://www.codewars.com/kata/576bb3c4b1abc497ec000065/train/java
// 2021-07-23 T:20:04:03
class Exercise_186 {

    public static boolean compare(String s1, String s2) {
        int firstStringValue = 0;
        int secondStringValue = 0;

        if ((s1 == null || s1 == "") && (s2 == null || s2 == "")) {
            return true;
        }
        if (s1 == null) {
            return false;
        }

        if (s2 == null) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLetter(s1.charAt(i))) {
                firstStringValue += Character.toUpperCase(s1.charAt(i));
            } else {
                firstStringValue = 0;
                break;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (Character.isLetter(s2.charAt(i))) {
                secondStringValue += Character.toUpperCase(s2.charAt(i));
            } else {
                secondStringValue = 0;
                break;
            }
        }

        return firstStringValue == secondStringValue;
    }

}
