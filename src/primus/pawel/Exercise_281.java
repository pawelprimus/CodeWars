package primus.pawel;

import java.util.HashMap;
import java.util.Map;

// Character Counter
// 7kyu
// https://www.codewars.com/kata/56786a687e9a88d1cf00005d/train/java
// 2021-11-11 T:12:44:52
class Exercise_281 {
    public static boolean validateWord(String word) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Character c;
        for (int i = 0; i < word.length(); i++) {
            c = Character.toLowerCase(word.charAt(i));
            if (hashMap.containsKey(c)) {
                hashMap.replace(c, hashMap.get(c), hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        Map.Entry<Character, Integer> entry = hashMap.entrySet().iterator().next();
        Integer value = entry.getValue();

        for (Integer key : hashMap.values()) {
            if(!key.equals(value)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        validateWord("AbcabcC");
    }
}
