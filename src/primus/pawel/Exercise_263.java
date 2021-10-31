package primus.pawel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Flatten and sort an array
// 7kyu
// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java
// 2021-10-31 T:11:38:50
class Exercise_263 {

    public static int[] flattenAndSort(int[][] array) {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayList.add(array[i][j]);
            }
        }
        int[] sortedArray = arrayList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(sortedArray);

        return sortedArray;
    }

    public static void main(String[] args) {
        flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}});
    }
}
