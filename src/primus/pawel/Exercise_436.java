package primus.pawel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Sectional Array Sort
// 7kyu
// https://www.codewars.com/kata/58ef87dc4db9b24c6c000092/train/java
// 2022-04-28 T:22:54:10
class Exercise_436 {


    static int[] sort(final int[] array, final int start, final int... length) {


        int endOfSorted = (length == null) || (length.length == 0) ? array.length : start + length[0] - 1;

        if(endOfSorted > array.length){
            endOfSorted = array.length;
        }

        List<Integer> notToSort = new ArrayList<>();
        List<Integer> toSort = new ArrayList<>();

        for (int i = 0; i < start; i++) {
            notToSort.add(array[i]);
        }

        for (int i = start; i <= endOfSorted; i++) {
            if(i < array.length){
                toSort.add(array[i]);
            }
        }


        List<Integer> newList = Stream.concat(notToSort.stream(), toSort.stream().sorted())
                .collect(Collectors.toList());

        if (endOfSorted != array.length) {

            for (int i = endOfSorted + 1 ; i < array.length; i++) {
                    newList.add(array[i]);
            }
        }


        newList.forEach(System.out::println);

        return newList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        sort(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8);

    }

}
