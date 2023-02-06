package src.primus.pawel;
// Debug Sum of Digits of a Number
// 7kyu
// https://www.codewars.com/kata/563d59dd8e47a5ed220000ba/train/java
// 2023-02-06 T:19:52:50
public class Exercise_506 {

    public static int sumOfDigits(int n) {
        int sum = 0;
        String digits = n + "";
        for (int i = 0; i < digits.length(); i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }
        return sum;
    }

}
