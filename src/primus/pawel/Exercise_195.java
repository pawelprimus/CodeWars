package primus.pawel;

import java.util.HashMap;

// Cryptanalysis Word Patterns
// 7kyu
// https://www.codewars.com/kata/5f3142b3a28d9b002ef58f5e/train/java
// 2021-08-02 T:23:36:17
class Exercise_195 {

    public static String wordPattern(final String word) {
        if(word.length()==1) {
            return "0";
        }

        String lowerCaseWord = word.toLowerCase();
        HashMap<Character, Integer> charsMap = new HashMap<>();
        charsMap.put(lowerCaseWord.charAt(0), 0);
        int currentValue = 1;
        StringBuilder result = new StringBuilder();
        result.append(charsMap.get(lowerCaseWord.charAt(0))).append(".");
        char currentLoopChar;
        for (int i = 1; i < lowerCaseWord.length(); i++) {
            currentLoopChar = lowerCaseWord.charAt(i);
            if (charsMap.containsKey(currentLoopChar)) {
                result.append(charsMap.get(currentLoopChar)).append(".");
            } else {
                charsMap.put(currentLoopChar, currentValue);
                result.append(charsMap.get(currentLoopChar)).append(".");
                currentValue++;
            }
        }

        return result.deleteCharAt(result.length()-1).toString();
    }

    public static void main(String[] args) {
        wordPattern("Hippopotomonstrosesquippedaliophobia");
    }
}
