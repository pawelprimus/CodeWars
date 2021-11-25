package primus.pawel;

import java.util.HashMap;

// Find all pairs
// 7kyu
// https://www.codewars.com/kata/5c55ad8c9d76d41a62b4ede3/train/java
// 2021-11-25 T:22:59:22
class Exercise_296 {

    public static int duplicates(int[] array) {
        HashMap<Integer,Integer> numMap = new HashMap<>();
        int pairs = 0;
        Integer num;
        Integer newNum;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            if(numMap.containsKey(num)){
                newNum = numMap.get(num) + 1;
                numMap.replace(num, newNum);
            } else {
                numMap.put(num, 1);
            }
        }

        for (Integer name: numMap.keySet()) {
            Integer value = numMap.get(name);
            pairs += value/2;
        }

        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{1, 2, 2, 20, 6, 20, 2, 6, 2}));
    }
}
