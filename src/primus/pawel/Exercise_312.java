package primus.pawel;

// Changing letters
// 7kyu
// https://www.codewars.com/kata/5831c204a31721e2ae000294/train/java
// 2021-12-13 T:20:59:01
class Exercise_312 {

    public static String swap(String st) {
        StringBuilder stringBuilder = new StringBuilder();
        String currentChar;
        for (int i = 0; i < st.length(); i++) {
            currentChar = String.valueOf(st.charAt(i));
            if (isVowel(currentChar)) {
                stringBuilder.append(currentChar.toUpperCase());
            } else {
                stringBuilder.append(currentChar);
            }

        }
        return stringBuilder.toString();
    }

    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }

}
