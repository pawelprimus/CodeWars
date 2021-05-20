package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sort the odd
// 6kyu
// https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
// 2021-03-29 T:23:09:46
class Exercise_043 {

    public static int[] sortArray(int[] array) {

        List<Integer> oddIndexes = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                //System.out.println(i);
                oddIndexes.add(i);
                oddNumbers.add(array[i]);
            }
        }

        Collections.sort(oddNumbers);

        int i = 0;
        for (int index : oddIndexes) {
            array[index] = oddNumbers.get(i);
            i++;
        }

        return array;
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, 2, 8, 1, 4};

        int[] sortedArr = sortArray(arr);

       /* for(int value : sortedArr){
            System.out.println(value);
        }*/

    }

}

//List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
