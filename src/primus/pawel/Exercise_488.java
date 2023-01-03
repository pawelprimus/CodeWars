package src.primus.pawel;

import java.util.Arrays;
import java.util.stream.Collectors;

// V A P O R C O D E
// 7kyu
// https://www.codewars.com/kata/5966eeb31b229e44eb00007a/train/java
// 2022-10-09 T:15:41:19
public class Exercise_488 {

    public static boolean cyclops(long n) {
        String binaryNumber = Long.toBinaryString(n);
        if (binaryNumber.length() % 2 == 0 || binaryNumber.length() <= 2) {
            return false;
        }
        if (binaryNumber.charAt(binaryNumber.length() / 2) != '0') {
            return false;
        }
        return binaryNumber.chars().filter(i -> i == '1').count() == binaryNumber.length() - 1;
    }

    public static void main(String[] args) {

        System.out.println(cyclops(5));

    }
}
