package primus.pawel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

// Numbers with this digit inside
// 7kyu
// https://www.codewars.com/kata/57ad85bb7cb1f3ae7c000039/train/java
// 2022-04-27 T:19:04:03
class Exercise_435 {

    public static long[] NumbersWithDigitInside(long x, long d) {

        List<Long> filteredLongs = LongStream.rangeClosed(1, x)
                .filter(strNum -> String.valueOf(strNum).contains(String.valueOf(d))).boxed().collect(Collectors.toList());

        if (filteredLongs.size() < 1) {
            return new long[]{0, 0, 0};
        } else {
            long count = filteredLongs.size();
            long sum = filteredLongs.stream().mapToLong(Long::longValue).sum();
            long product = filteredLongs.stream().reduce((subtotal, element) -> subtotal * element).orElse(0L);
            return new long[]{count, sum, product};
        }
    }

    public static void main(String[] args) {

        Arrays.stream(NumbersWithDigitInside(11, 1)).forEach(System.out::println);
    }

}
