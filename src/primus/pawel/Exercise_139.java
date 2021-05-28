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

        if (cent >= 25) {
            map.replace("Quarters", cent / 25);
            cent = cent % 25;
        }
        if (cent >= 10) {
            map.replace("Dimes", cent / 10);
            cent = cent % 10;
        }
        if (cent >= 5) {
            map.replace("Nickels", cent / 5);
            cent = cent % 5;
        }
        if (cent >= 1) {
            map.replace("Pennies", cent);
            cent = 0;
        }
        return map;
    }
}
