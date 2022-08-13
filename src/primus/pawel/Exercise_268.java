package primus.pawel;

import java.util.Collections;

// Data compression using run-length encoding
// 6kyu
// https://www.codewars.com/kata/578bf2d8daa01a4ee8000046/train/java
// 2021-11-01 T:10:04:36
class Exercise_268 {
    public static String encode(String input) {

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {

            if(input.charAt(i) != currentChar){
                result.append(counter).append(currentChar);
                counter = 1;
                currentChar = input.charAt(i);
            } else {
                counter++;
            }
        }
        result.append(counter).append(currentChar);

        return result.toString();
    }

    public static String decode(String input) {
        StringBuilder result = new StringBuilder();
        String[] chars = input.split("\\d+");
        String[] numbers = input.split("[A-Z]");

        for (int i = 0; i < numbers.length; i++) {
            result.append(String.join("", Collections.nCopies(Integer.parseInt(numbers[i]),chars[i+1] )));
        }
        return result.toString();
    }


    public static void main(String[] args) {

        System.out.println(encode("AAABBBCCCA"));
        System.out.println(decode("3A3B3C1A"));
    }

}

/*  static String encode(String input) {
    return compile("(.)\\1*").matcher(input).replaceAll(m -> m.end() - m.start() + m.group(1));
  }

  static String decode(String input) {
    return compile("(\\d+)(\\D)").matcher(input).replaceAll(m -> m.group(2).repeat(Integer.parseInt(m.group(1))));
  }
  */