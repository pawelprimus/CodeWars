package primus.pawel;

import java.util.Arrays;

// Anagram Detecion
// 7kyu
// https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java
// 2021-09-07 T:20:30:37
class Exercise_205 {
    public static boolean isAnagram(String test, String original) {

        if (test == null || original == null || test.length() != original.length()) {
            return false;
        }

        char testArray[] = test.toLowerCase().toCharArray();
        char originalArray[] = original.toLowerCase().toCharArray();
        Arrays.sort(testArray);
        Arrays.sort(originalArray);
        for (int i = 0; i < test.length(); i++) {
            if (testArray[i] != originalArray[i]) {
                return false;
            }
        }
        return true;
    }

}
