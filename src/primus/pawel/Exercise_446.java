package primus.pawel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Complete The Pattern #4
// 7kyu
// https://www.codewars.com/kata/55736129f78b30311300010f/train/java
// 2022-05-09 T:19:38:58
class Exercise_446 {

    public static String pattern(int n) {
        System.out.println(n);
        if (n <= 0) {
            return "";
        }

        List<String> nums = IntStream.rangeClosed(1, n).mapToObj(String::valueOf).collect(Collectors.toList());
        StringBuilder result = new StringBuilder(String.join("", nums)).append("\n");
        for (int i = 0; i < n - 1; i++) {
            nums.remove(0);
            result.append(String.join("", nums)).append("\n");
        }
        return result.toString().stripTrailing();
    }

    public static void main(String[] args) {
        System.out.println(pattern(419));
    }

}
