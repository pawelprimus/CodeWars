package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 6kyu
// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
// 2021-03-20 T:12:18:58
class Exercise_28 {

    public static String order(String words) {

        if(words.isEmpty()){
            return "";
        }

        String[] splitedWords = words.split("\\s+");
        String[] orderedWords = new String[splitedWords.length];
        int orderNum = 0;
        for (int i = 0; i < splitedWords.length; i++) {
            Matcher m = Pattern.compile("\\d+").matcher(splitedWords[i]);
            while (m.find()) {
                orderNum = Integer.valueOf(m.group());
                // System.out.println(m.group());
            }
            orderedWords[orderNum-1] = splitedWords[i];
        }

        StringBuilder builder = new StringBuilder();
        for(String s : orderedWords) {
            builder.append(s + " ");
        }

        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(order(""));
    }

}

/* public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }*/