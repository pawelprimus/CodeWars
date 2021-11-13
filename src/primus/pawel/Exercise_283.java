package primus.pawel;

import java.util.Arrays;

// Product Of Maximums Of Array (Array Series #2)
// 7kyu
// https://www.codewars.com/kata/5a63948acadebff56f000018/train/java
// 2021-11-13 T:13:08:54
class Exercise_283 {

    public static long maxProduct(int[] numbers, int sub_size) {
        long sum = 1;
        Arrays.sort(numbers);
        for (int i = numbers.length - sub_size; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum *= numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10, 3, -27, -1}, 3));
    }
}

/*
return stream(numbers)
            .sorted()
            .skip(numbers.length-subSize)
            .mapToLong(Long::valueOf)
            .reduce(1, (x,y)->x*y);

            */