package src.primus.pawel;

// Complete The Pattern #1
// 7kyu
// https://www.codewars.com/kata/5572f7c346eb58ae9c000047/train/java
// 2023-01-18 T:21:12:13
public class Exercise_493 {

    public static String pattern(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            sb.append(String.valueOf(i).repeat(i)).append("\n");
        }
        sb.append(String.valueOf(n).repeat(n));
        return sb.toString();
    }

    //   return IntStream.rangeClosed(1, n).mapToObj(num -> String.valueOf(num).repeat(num)).collect(Collectors.joining("\n"));
}
