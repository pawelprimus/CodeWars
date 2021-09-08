package primus.pawel;

import java.util.LinkedHashSet;

// Remove Duplicates
// 7kyu
// https://www.codewars.com/kata/53e30ec0116393fe1a00060b/train/java
// 2021-09-08 T:20:14:58
class Exercise_207 {
    public static int[] unique(int[] integers) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        int[] resultArray = new int[linkedHashSet.size()];

        for (int i = 0; i < integers.length; i++) {
            linkedHashSet.add(integers[i]);
        }

        int i = 0;
        for (Integer number : linkedHashSet) {
            resultArray[i] = number;
            i++;
        }
        return resultArray;
    }
}

/*
*
public class UniqueArray {
  public static int[] unique(int[] integers) {
    Set<Integer> set = new LinkedHashSet<Integer>();
    for(int i: integers){
      set.add(i);
    }
    return set.stream().mapToInt(i->i).toArray();
  }
}*/
