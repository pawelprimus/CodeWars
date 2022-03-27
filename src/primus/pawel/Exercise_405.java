package primus.pawel;

import java.util.stream.Collectors;

// Digits explosion
// 7kyu
// https://www.codewars.com/kata/585b1fafe08bae9988000314/train/java
// 2022-03-27 T:16:50:24
class Exercise_405 {

    public static String explode(String digits) {
        return digits.chars()
                .mapToObj(Character::toString)
                .map(i -> i.repeat(Integer.parseInt(i)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
