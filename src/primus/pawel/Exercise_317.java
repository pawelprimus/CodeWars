package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Split By Value
// 7kyu
// https://www.codewars.com/kata/5a433c7a8f27f23bb00000dc/train/java
// 2022-01-03 T:19:23:47
class Exercise_317 {
    int[] splitByValue(int k, int[] elements) {
        List<Integer> smallerNumbers = new ArrayList<>();
        List<Integer> biggerOrEqualsNumbers = new ArrayList<>();
        for (int num : elements){
            if(num < k) {
                smallerNumbers.add(num);
            } else {
                biggerOrEqualsNumbers.add(num);
            }
        }
        smallerNumbers.addAll(biggerOrEqualsNumbers);
        int[] result = smallerNumbers.stream().mapToInt(i -> i).toArray();
        return result;
    }


}
