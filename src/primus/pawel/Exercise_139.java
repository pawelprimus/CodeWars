package primus.pawel;

import java.util.HashMap;

// Loose Change
// 6kyu
// https://www.codewars.com/kata/5571f712ddf00b54420000ee/train/java
// 2021-05-28 T:23:30:21
class Exercise_139 {

    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        //your code here
        return map;
    }
}
