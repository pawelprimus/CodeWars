package src.primus.pawel;

// More Zeros than Ones
// 6kyu
// https://www.codewars.com/kata/5d41e16d8bad42002208fe1a/train/java
// 2023-01-12 T:23:28:17

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_490 {

    public static char[] moreZeros(String s) {
        List<Character> characters = s.chars().distinct().mapToObj(c -> (char) c).filter(i -> containsMoreZerosThanOnes(i)).toList();
        char[] result = new char[characters.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = characters.get(i);
        }
        return result;
    }

    private static boolean containsMoreZerosThanOnes(char c) {
        String binaryString = Integer.toBinaryString(c);
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                ones++;
            } else {
                zeros++;
            }
        }
        return zeros > ones;
    }

    public static void main(String[] args) {

        for (char c : moreZeros("thequickbrownfoxjumpsoverthelazydog")) {
            System.out.print(c + " ");
        }
    }


}
