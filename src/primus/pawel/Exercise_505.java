package src.primus.pawel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Set Reducer
// 7kyu
// https://www.codewars.com/kata/63cbe409959401003e09978b/train/java
// 2023-02-02 T:23:10:36
public class Exercise_505 {

    public static int setReducer(int[] input) {
        List<Integer> integerList = IntStream.of(input)
                .boxed().collect(Collectors.toList());
        while (!isFullyReduced(integerList)) {
            integerList = reduce(integerList);
        }
        return integerList.size();
    }

    public static List<Integer> reduce(List<Integer> list) {
        int num = list.get(0);
        int counter = 1;
        List<Integer> reducedList = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (num == list.get(i)) {
                counter++;
            } else {
                reducedList.add(counter);
                counter = 1;
            }
            num = list.get(i);
        }
        reducedList.add(counter);
        return reducedList;
    }

    public static boolean isFullyReduced(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(setReducer(new int[] {2, 4, 4, 6, 2, 1, 1, 5, 6, 7, 8, 8, 8, 8, 9, 0, 1, 1, 5, 4, 4}));
    }

}
