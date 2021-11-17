package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;

// Mexican Wave
// 6kyu
// https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java
// 2021-04-12 T:19:55:10
class Exercise_069 {
    public static String[] wave(String str) {

        if (str.length() == 0 || str == null) return new String[]{};

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                StringBuilder word = new StringBuilder(str);
                word.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                result.add(word.toString());
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(wave("hello i eloo")));
    }
}
