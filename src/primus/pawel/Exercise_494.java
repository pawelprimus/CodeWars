package src.primus.pawel;

// Name That Number!
// 7kyu
// https://www.codewars.com/kata/579ba41ce298a73aaa000255/train/java
// 2023-01-21 T:12:46:40

public class Exercise_494 {

    public static void main(String[] args) {
        nameThatNumber(20);
    }

    public static String nameThatNumber(int x) {
        if (x < 10) {
            return getDigitName(x);
        } else if (x < 20) {
            return getSpecialNumberName(x);
        }
        System.out.println(x % 10);

        String digit = x % 10 == 0 ? "" : " " + getDigitName(x % 10);

        return getDecimalNumberName(x - x % 10) + digit;
    }

    private static String getDigitName(int digit) {
        return switch (digit) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 0 -> "zero";
            default -> "";
        };
    }

    private static String getSpecialNumberName(int specialNumber) {
        return switch (specialNumber) {
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "fifteen";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            default -> "";
        };
    }

    private static String getDecimalNumberName(int specialNumber) {
        return switch (specialNumber) {
            case 20 -> "twenty";
            case 30 -> "thirty";
            case 40 -> "forty";
            case 50 -> "fifty";
            case 60 -> "sixty";
            case 70 -> "seventy";
            case 80 -> "eighty";
            case 90 -> "ninety";
            default -> "";
        };
    }
}
