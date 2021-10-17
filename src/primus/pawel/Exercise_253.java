package primus.pawel;

import java.util.*;

// Duplicates. Duplicates Everywhere.
// 6kyu
// https://www.codewars.com/kata/5e8dd197c122f6001a8637ca/train/java
// 2021-10-17 T:01:00:13
class Exercise_253 {

    public static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {

        Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>() {};

        List<String> list = null;
        list.add("aa");
        map.put(345 , null);
        ArrayList<Integer> keys = new ArrayList<Integer>(obj.keySet());
        String currentKey;
        for(int i=obj.size()-1; i>=0;i--){
            //System.out.println(obj.get(keys.get(i)));

            for (int j = 0; j < obj.get(keys.get(i)).size(); j++) {
                currentKey = obj.get(keys.get(i)).get(j);

                for (int k = i -2 ; k >= 0 ; k--) {
                    if (obj.get(keys.get(k)).contains(currentKey)){
                        //obj.get(keys.get(k)).remove(currentKey);
                        System.out.println(currentKey);
                        System.out.println(obj.get(keys.get(k)).remove(0));
                    }
                }
               // System.out.println(obj.get(keys.get(i)).get(j));
            }

        }

        return obj;
    }

    public static void main(String[] args) {

        Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>() {};
        map.put(432, Arrays.asList(new String[]{"A", "A", "B", "D"}));
        map.put(53, Arrays.asList(new String[]{"L", "G", "B", "C"}));
        map.put(236, Arrays.asList(new String[]{"L", "A", "X", "G", "H", "X"}));
        map.put(11, Arrays.asList(new String[]{"P", "R", "S", "D"}));

        removeDuplicateIds(map);

    }

}
