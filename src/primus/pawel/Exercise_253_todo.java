package primus.pawel;

import java.util.*;

// Duplicates. Duplicates Everywhere.
// 6kyu
// https://www.codewars.com/kata/5e8dd197c122f6001a8637ca/train/java
// 2021-10-17 T:01:00:13
class Exercise_253_todo {

    public static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {


        for (Integer key_1 : obj.keySet()) {

            List<String> loop_1 = obj.get(key_1);




        }


        return obj;
    }

    public static void main(String[] args) {

        Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>() {
        };
        map.put(432, Arrays.asList(new String[]{"A", "A", "B", "D"}));
        map.put(53123, Arrays.asList(new String[]{"L", "G", "B", "C"}));
        map.put(236, Arrays.asList(new String[]{"L", "A", "X", "G", "H", "X"}));
        map.put(11, Arrays.asList(new String[]{"P", "R", "S", "D"}));

        removeDuplicateIds(map);

    }


}
