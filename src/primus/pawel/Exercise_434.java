package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Where is my parent!?(cry)
// 6kyu
// https://www.codewars.com/kata/58539230879867a8cd00011c/train/java
// 2022-04-26 T:19:32:31
class Exercise_434 {

    static String findChildren(final String text) {

        Map<Character, String> charGroups = new TreeMap<>();

        for (Character c : text.toCharArray()) {
            Character upperCase = Character.toUpperCase(c);
            if (charGroups.containsKey(upperCase)) {
                charGroups.put(upperCase, charGroups.get(upperCase) + c);
            } else {
                charGroups.put(upperCase, String.valueOf(c));
            }
        }

        return new ArrayList<>(charGroups.values()).stream().map(i -> sortString(i)).collect(Collectors.joining());
    }

    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) {
        findChildren("CbcBcbaA");
    }

}

/* static String findChildren(final String text) {
        String[] sorted = text.split("");
        Arrays.sort(sorted);
        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        return String.join("", sorted);
    }
    */
