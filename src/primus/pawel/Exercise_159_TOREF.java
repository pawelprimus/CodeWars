package primus.pawel;

// Missing Alphabet
// 6kyu
// https://www.codewars.com/kata/5ad1e412cc2be1dbfb000016
// 2021-06-16 T:23:17:27
class Exercise_159_TOREF {

    public static String insertMissingLetters(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] missingLetters = new boolean[26];
        boolean[] letterOccurences = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            missingLetters[(int)str.charAt(i) - 97] = true;
        }
        char currentChar;

        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);
            if(!letterOccurences[currentChar-97]){
                result.append(currentChar).append(addingContiniousLetters(currentChar, missingLetters));
                letterOccurences[currentChar-97] = true;
            } else {
                result.append(currentChar);
            }

        }
        return result.toString();
    }

    public static String addingContiniousLetters(Character digit, boolean[] missLetters) {
        StringBuilder sb = new StringBuilder();
        char charToAdd;
        for (int i = digit +1; i <= 122; i++) {
            charToAdd = (char) i;
            if(!missLetters[i - 97]){
                sb.append(charToAdd);
            }
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        insertMissingLetters("hello");
    }


}
