package primus.pawel;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// Maximum Triplet Sum (Array Series #7)
// 7kyu
// https://www.codewars.com/kata/5aa1bcda373c2eb596000112/train/java
// 2021-09-09 T:18:59:12
class Exercise_211 {
    public static int maxTriSum(int[] numbers) {

        int biggesTripleSum = 0;
        int[] uniqueArray = unique(numbers);
        Arrays.sort(uniqueArray);

        biggesTripleSum += uniqueArray[uniqueArray.length - 1];
        biggesTripleSum += uniqueArray[uniqueArray.length - 2];
        biggesTripleSum += uniqueArray[uniqueArray.length - 3];

        return biggesTripleSum; // Do your magic!
    }

    public static int[] unique(int[] integers) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i : integers) {
            set.add(i);
        }
        return set.stream().mapToInt(i -> i).toArray();
    }

}

/*  public static int maxTriSum (int[] numbers)
    {       return Arrays.stream(numbers)
               .boxed()
               .sorted(Collections.reverseOrder())
               .distinct()
               .limit(3)
               .mapToInt(i -> i)
               .sum();
    }
    */