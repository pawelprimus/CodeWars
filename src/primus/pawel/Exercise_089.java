package primus.pawel;

import java.util.HashSet;
import java.util.Set;

// Form The Minimum
// 7kyu
// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java
// 2021-04-20 T:23:53:02
class Exercise_089 {
    public static int minValue(int[] values){

        boolean[] numberOccuerences = new boolean[10];
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            numberOccuerences[values[i]] = true;
        }
        for (int i = 0; i < numberOccuerences.length; i++) {

            if(numberOccuerences[i]) sbResult.append(i);
        }
        return Integer.valueOf(sbResult.toString());
    }

}

/*String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
        */