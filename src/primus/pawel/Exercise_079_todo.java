package primus.pawel;
// Word a10n (abbreviation)
//  6kyu
// https://www.codewars.com/kata/5375f921003bf62192000746/train/java
// 2021-04-15 T:20:10:38

import java.util.ArrayList;
import java.util.regex.Pattern;

class Exercise_079_todo {

    public static String abbreviate(String string) {

        //String[] wordsArr = string.split(" ");
        StringBuilder sbResult = new StringBuilder();
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");

        ArrayList<String> result = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            while ()

        }


        System.out.println("Result " + sbResult.toString());
        return null;
    }

    public static String abbreviateWord(String word) {
        if (word.length() <= 3) return word;

        StringBuilder newWord = new StringBuilder();

        newWord.append(word.charAt(0)).append(word.length() - 2).append(word.charAt(word.length() - 1));

        return newWord.toString();
    }

    public static void main(String[] args) {
        abbreviate("elephant-rides are really fun!");
    }

}
