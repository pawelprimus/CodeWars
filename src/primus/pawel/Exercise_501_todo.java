package src.primus.pawel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// The First Non Repeated Character In A String
// 7kyu
// https://www.codewars.com/kata/570f6436b29c708a32000826/train/java
// 2023-01-29 T:22:58:25
public class Exercise_501_todo {

    public static Character firstNonRepeated(String source) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < source.length(); i++) {
            Character c = source.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        if (map.size() == source.length()) {
            return source.charAt(0);
        }
        for (int i = 0; i < source.length(); i++) {
            Character c = source.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
