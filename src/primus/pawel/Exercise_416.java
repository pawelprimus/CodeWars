package primus.pawel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Dashatize it
// 7kyu
// https://www.codewars.com/kata/58223370aef9fc03fd000071/train/java
// 2022-04-12 T:00:31:08
class Exercise_416 {

    public static String dashatize(int num) {
        List<String> numbers = new ArrayList<>();
        StringBuilder sbStart = new StringBuilder(String.valueOf(num));
        if (sbStart.charAt(0) == '-') {
            sbStart.deleteCharAt(0);
        }
        char[] chars = sbStart.toString().toCharArray();
        for (char ch : chars) {

            if (ch % 2 == 1) {

                numbers.add("-" + ch + "-");

            } else {
                numbers.add(ch + "");
            }
        }

        StringBuilder sb = new StringBuilder(String.join("", numbers));
        if (sb.charAt(0) == '-') {
            sb.deleteCharAt(0);
        }
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString().replaceAll("--" , "-");
    }

    public static void main(String[] args) {
        dashatize(274);
    }

}
