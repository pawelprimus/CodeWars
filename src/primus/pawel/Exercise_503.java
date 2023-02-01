package src.primus.pawel;

import java.util.stream.IntStream;

// Largest Elements
// 7kyu
// https://www.codewars.com/kata/53d32bea2f2a21f666000256/train/java
// 2023-02-01 T:22:45:38
public class Exercise_503 {

    public static int[] largest(int n, int[] arr) {
        return IntStream.of(arr)
                .boxed()
                .sorted()
                .toList()
                .subList(arr.length - n, arr.length)
                .stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        largest(3, new int[]{1, 2, 1, 1});
    }
    //return Arrays.copyOfRange(arr,arr.length-n,arr.length);
    //return of(arr).sorted().skip(arr.length - n).toArray();
}
