package primus.pawel;

// Simple Fun #176: Reverse Letter
// 7kyu
// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java
// 2021-06-14 T:23:25:52
class Exercise_157 {

    public static String reverseLetter(final String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i))) {
                result.append(str.charAt(i));
            }

        }

        return result.toString();
    }

}
/* public static String reverseLetter(final String s) {
        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();


    }

    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("(?i)[^a-z]","")).reverse().toString();
    }

    */