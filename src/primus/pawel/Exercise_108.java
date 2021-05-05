package primus.pawel;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// Difference of 2
// 6kyu
// https://www.codewars.com/kata/5340298112fa30e786000688/train/java
// 2021-05-06 T:01:02:57
class Exercise_108 {
    public static int[][] twosDifference(int[] array) {

        if(array.length == 0 || array.length == 1 ) return new int[][]{};

        List<Integer> arr = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(arr);
        LinkedList<Integer> resultList = new LinkedList<>();
        if (Math.abs(arr.get(1)) - Math.abs(arr.get(0)) == 2) {
            resultList.add(arr.get(0));
            resultList.add(arr.get(1));
        }
        for (int i = 2; i < arr.size(); i++) {
            if (Math.abs(arr.get(i)) - Math.abs(arr.get(i - 1)) == 2) {
                resultList.add(arr.get(i - 1));
                resultList.add(arr.get(i));
            }
            if (Math.abs(arr.get(i)) - Math.abs(arr.get(i - 2)) == 2) {
                resultList.add(arr.get(i - 2));
                resultList.add(arr.get(i));
            }
        }

        int[][] resultArray = new int[resultList.size() / 2][2];
        int j = 0;
        for (int i = 0; i < resultList.size() / 2; i++) {
            resultArray[i][0] = resultList.get(j);
            j++;
            resultArray[i][1] = resultList.get(j);
            j++;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        twosDifference(new int[]{4, 3, 1, 5, 6});
    }
}
