package primus.pawel;

import java.util.ArrayList;
import java.util.stream.Collectors;

// scrambles
// 6kyu
// https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
// 2021-04-09 T:17:34:51
class Exercise_063 {
    public static boolean scramble(String str1, String str2) {
        ArrayList<Character> charLL;
        charLL = (ArrayList<Character>) str1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for (int i = 0; i < str2.length(); i++) {
            if (charLL.contains(str2.charAt(i))) {
                charLL.remove((Character) str2.charAt(i));
                //System.out.println(str2.charAt(i));
            } else return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx", "javascript"));
    }


}
