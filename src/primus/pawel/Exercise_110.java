package primus.pawel;

import java.util.Collections;

// Reverse a Number
// 7kyu
// https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5/train/java
// 2021-05-06 T:23:58:22
class Exercise_110 {
    public static int reverse(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        if(sb.charAt(0) == '-'){
            sb.deleteCharAt(0);
            sb.append("-");
        }
        sb.reverse();
        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverse(-12345));
    }

}
