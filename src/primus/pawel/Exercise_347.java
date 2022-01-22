package primus.pawel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

// Keypad horror
// 7kyu
// https://www.codewars.com/kata/5572392fee5b0180480001ae/train/java
// 2022-01-22 T:11:22:43
class Exercise_347 {

    public static String computerToPhone(String number) {

        String result = number.replaceAll("1", "a").replaceAll("2", "b").replaceAll("3", "c")
                .replaceAll("7", "1").replaceAll("8", "2").replaceAll("9", "3")
                .replaceAll("a", "7").replaceAll("b", "8").replaceAll("c", "9").replaceAll("d", "6");

        return result;
    }

    public static void main(String[] args) {

        System.out.println(computerToPhone("0123456789"));
    }



}
