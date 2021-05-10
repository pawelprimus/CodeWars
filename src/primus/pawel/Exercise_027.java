package primus.pawel;
// Sum of positive
// 8 kyu
// https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
// 2021-03-20 T:12:02:16


import java.util.Arrays;

class Exercise_027 {

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(s -> s >= 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, -5}));
    }

}
