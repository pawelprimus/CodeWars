package primus.pawel;

import java.util.HashMap;

// Texting with an old-school mobile phone
// 6kyu
// https://www.codewars.com/kata/5ca24526b534ce0018a137b5/train/java
// 2021-09-20 T:22:31:38
class Exercise_230_todo {

    public static HashMap<String, String> keysMap = new HashMap<>();

    public static String sendMessage(String message) {

        generateMap();
        boolean isUpperCase = false;
        boolean isClicked = false;
        StringBuilder result = new StringBuilder();
        char currentChar;
        char lastChar = 'a';

        String currentValue;
        String lastValue;

        for (int i = 0; i < message.length(); i++) {
            currentChar = message.charAt(i);
            if (i > 0) {
                lastChar = message.charAt(i - 1);
            }


            if (Character.isUpperCase(currentChar) && isUpperCase == false) {
                result.append("#");
                isUpperCase = true;
                isClicked = true;
            } else if (Character.isLowerCase(currentChar) && isUpperCase == true) {
                result.append("#");
                isUpperCase = false;
                isClicked = true;
            }

            if (isClicked == false) {
                if (i > 0 && currentChar == lastChar) {
                    result.append(" ");
                } else {
                    currentValue = keysMap.get(String.valueOf(Character.toLowerCase(currentChar)));
                    lastValue = keysMap.get(String.valueOf(Character.toLowerCase(lastChar)));

                    if (Character.isLetter(currentChar) && isContainSameLastChar(currentValue, lastValue) && isSameCase(currentChar, lastChar)) {
                        result.append(" ");
                    } else if (!Character.isDigit(currentChar) && !Character.isDigit(lastChar) && isContainSameFirstChar(currentValue, lastValue)) {
                        result.append(" ");
                    }
 
                }
            }

            isClicked = false;


            result.append(keysMap.get(String.valueOf(Character.toLowerCase(currentChar))));

        }


        return result.toString().trim();
    }

    static boolean isContainSameLastChar(String firstWord, String secondWord) {

        return firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(secondWord.length() - 1);
    }

    static boolean isContainSameFirstChar(String firstWord, String secondWord) {

        return firstWord.charAt(0) == secondWord.charAt(0);
    }

    static boolean isSameCase(char firstChar, char secondChar) {

        return (Character.isLowerCase(firstChar) && Character.isLowerCase(secondChar)) || (Character.isUpperCase(firstChar) && Character.isUpperCase(secondChar));
    }


    private static void generateMap() {


        keysMap.put(".", "1");
        keysMap.put(",", "11");
        keysMap.put("?", "111");
        keysMap.put("!", "1111");
        keysMap.put("a", "2");
        keysMap.put("b", "22");
        keysMap.put("c", "222");
        keysMap.put("d", "3");
        keysMap.put("e", "33");
        keysMap.put("f", "333");
        keysMap.put("g", "4");
        keysMap.put("h", "44");
        keysMap.put("i", "444");
        keysMap.put("j", "5");
        keysMap.put("k", "55");
        keysMap.put("l", "555");
        keysMap.put("m", "6");
        keysMap.put("n", "66");
        keysMap.put("o", "666");
        keysMap.put("p", "7");
        keysMap.put("q", "77");
        keysMap.put("r", "777");
        keysMap.put("s", "7777");
        keysMap.put("t", "8");
        keysMap.put("u", "88");
        keysMap.put("v", "888");
        keysMap.put("w", "9");
        keysMap.put("x", "99");
        keysMap.put("y", "999");
        keysMap.put("z", "9999");
        keysMap.put("1", "1-");
        keysMap.put("2", "2-");
        keysMap.put("3", "3-");
        keysMap.put("4", "4-");
        keysMap.put("5", "5-");
        keysMap.put("6", "6-");
        keysMap.put("7", "7-");
        keysMap.put("8", "8-");
        keysMap.put("9", "9-");
        keysMap.put("*", "*-");
        keysMap.put("'", "*");
        keysMap.put("-", "**");
        keysMap.put("+", "***");
        keysMap.put("=", "****");
        keysMap.put(" ", "0");

    }

    public static void main(String[] args) {
        generateMap();

        System.out.println(sendMessage("Big thanks for checking out my kata"));
    }

}
/*-------------------------
|   1   |   2   |   3   |  <-- hold a key to type a number
|  .,?! |  abc  |  def  |  <-- press a key to type a letter
-------------------------
|   4   |   5   |   6   |  <-- Top row
|  ghi  |  jkl  |  mno  |  <-- Bottom row
-------------------------
|   7   |   8   |   9   |
|  pqrs |  tuv  |  wxyz |
-------------------------
|   *   |   0   |   #   |  <-- hold for *, 0 or #
|  '-+= | space |  case |  <-- press # to switch between upper/lower case
-------------------------*/