package primus.pawel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Wave Sorting
// 6kyu
// https://www.codewars.com/kata/596f28fd9be8ebe6ec0000c1/train/java
// 2022-02-06 T:14:01:42
class Exercise_363 {

    public static void waveSort(int[] array) {

        List<Integer> sortedArr = Arrays.stream(array).sorted().boxed().collect(Collectors.toList());

        int startIndex = 0;
        int endIndex = (array.length - array.length / 2) - array.length % 2;

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                array[i] = sortedArr.get(endIndex);
                endIndex++;
            } else {
                array[i] = sortedArr.get(startIndex);
                startIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 34, 4, 5, 5, 5, 65, 6, 65, 5454, 4, 1000};
        waveSort(arr2);
        for (int num : arr2) {
            System.out.println(num);
        }
    }
}
