package primus.pawel;

import java.util.LinkedList;
import java.util.List;

// Simple string reversal
// 7kyu
// https://www.codewars.com/kata/5a71939d373c2e634200008e/train/java
// 2021-05-19 T:18:27:31
class Exercise_133_todo {
    public static String solve(String s) {
        List<Integer> spaceIndexes = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes.add(i);
            }
        }

        StringBuilder sb = new StringBuilder(s.replaceAll("\\s", ""));
        StringBuilder sbResult = new StringBuilder();
        sb.reverse();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (spaceIndexes.contains(i)) {
                sbResult.append(" ");
            } else {
                sbResult.append(sb.charAt(j));
                j++;
            }

        }

        return sbResult.toString().trim();
    }
}
