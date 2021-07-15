package primus.pawel;

import java.util.regex.Pattern;

// Simple String characters
// 7kyu
// https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/java
// 2021-07-15 T:18:32:14
class Exercise_180 {

    public static int[] Solve(String word) {
        Pattern upperCases = Pattern.compile("[A-Z]");
        Pattern lowerCases = Pattern.compile("[a-z]");
        Pattern numbers = Pattern.compile("[0-9]");
        Pattern specialCharacters = Pattern.compile("ab");

        int numberOfUpperCases = (int)upperCases.matcher(word).results().count();
        int numberOfLowerCases = (int)lowerCases.matcher(word).results().count();
        int numberOfNumbers = (int)numbers.matcher(word).results().count();
        int numberOfSpecialCases = word.length() - numberOfUpperCases - numberOfLowerCases - numberOfNumbers;

        int[] result = new int[]{numberOfUpperCases, numberOfLowerCases, numberOfNumbers, numberOfSpecialCases};

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Solve("AABcaaEEe11231"));
    }


}

/*   return new int[]{
            word.replaceAll("[^\\p{Upper}]", "").length(),
            word.replaceAll("[^\\p{Lower}]", "").length(),
            word.replaceAll("[^\\p{Digit}]", "").length(),
            word.replaceAll("[\\p{Alnum}]", "").length(),
    };

    */
