package primus.pawel;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
//
// https://www.codewars.com/kata/5914e068f05d9a011e000054/train/java
// 2021-09-30 T:21:53:25
class Exercise_239 {

    public static String compress(String s) {
        StringBuilder sbResult = new StringBuilder("[");
        StringBuilder currentWord = new StringBuilder("");
        char currentChar;
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);

            if (i == s.length() - 1) {
                if (currentChar == s.charAt(i - 1)) {
                    counter++;
                } else {
                    counter = 1;
                }
                currentWord.append("[").append(counter).append(",\"").append(currentChar).append("\"]");
                sbResult.append(currentWord).append(",");
                currentWord = new StringBuilder("");
            } else if (currentChar == s.charAt(i + 1)) {
                counter++;
            } else {
                currentWord.append("[").append(counter).append(",\"").append(currentChar).append("\"]");
                sbResult.append(currentWord).append(",");
                currentWord = new StringBuilder("");
                counter = 1;
            }

        }
        System.out.println(sbResult.length());
        System.out.println(s.length());
        return sbResult.toString().length() < s.length() ? sbResult.toString() : s;
    }

    public static String decompress(String s) {
        StringBuilder sb = new StringBuilder();
        Pattern digitPattern = Pattern.compile("\\d+");
        Pattern characterPattern = Pattern.compile("[A-Za-z]");

        Matcher matcher = digitPattern.matcher(s);

        List<String> occurencesCount = new ArrayList<>();
        List<String> charactersCount = new ArrayList<>();

        while (matcher.find()) {
            occurencesCount.add(matcher.group());
        }

        matcher = characterPattern.matcher(s);
        while (matcher.find()) {
            charactersCount.add(String.valueOf(matcher.group()));
        }

        if (occurencesCount.size() == charactersCount.size()) {
            for (int i = 0; i < occurencesCount.size(); i++) {
                sb.append(charactersCount.get(i).repeat(Integer.valueOf(occurencesCount.get(i))));
            }
        } else {
            return s;
        }


        if (occurencesCount.size() == 0) return s;
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("666666666xxxxxxxxx666fffffffffffffff33333333hhhhhhhhhhhaqqqqqqqkkkkkkkkkkfkkkkkkkxxxxxyyyyyyyyyyyyyyyyyyyyyyyyyyyypcccccccccc777777777ssssssss" +
                "....hhhhhhhhhhhhhh4444444444444vvvvvvvvvvvvvvjjjjjjjjjjyyyyyyyyy77777" +
                "yyyyyyyyyyyyzzzzzzzzzzzzkkkkkkkkkkcccccccccccccxxxxxxxxxxxxxxmooooooooooxxxxxiiiiiiiiiiiii" +
                "444444444...vvvvv,,,,,,,nnnn33333333,,,,,,,,,,,,,555555555xxxxxxxxxxxxxxxuuuuuuuuuuuuuukkkkkkkkkkkkkkkddddddddddddfffffuuuuuuuuuuuuuuu"));
        System.out.println(compress("3333333333666"));
        System.out.println(decompress("[14,\\\"a\\\"],[1,\\\"b\\\"],[41,\\\"a\\\"],[1,\\\"c\\\"]"));
        System.out.println(decompress("3333333333666"));
    }
}


