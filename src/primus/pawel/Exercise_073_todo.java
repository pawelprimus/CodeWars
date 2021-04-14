package primus.pawel;

import java.util.Collections;

// Give me a Diamond
// 6kyu
// https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
//
class Exercise_073_todo {

    public static String print(int n) {
        if (n%2 == 0 || n < 0) return null;
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                sbResult.append(String.join("", Collections.nCopies(n/2 - i, " ")))
                        .append(String.join("", Collections.nCopies(i*2 + 1, "*")))
                        .append("\n");
            } else {
                sbResult.append(String.join("", Collections.nCopies(i - n/2, " ")))
                        .append(String.join("", Collections.nCopies( 2 * (n - i) - 1, "*")))
                        .append("\n");
            }
        }
        return sbResult.toString();
    }

    public static void main(String[] args) {
        print(7);
    }


}
