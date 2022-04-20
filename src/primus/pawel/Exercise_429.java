package primus.pawel;

import java.util.Arrays;
import java.util.HashMap;

// Pair of gloves
// 6kyu
// https://www.codewars.com/kata/58235a167a8cb37e1a0000db/train/java
// 2022-04-20 T:22:34:08
class Exercise_429 {

    public static int numberOfPairs(String[] gloves) {
        HashMap<String, Integer> boxWithGloves = new HashMap<>();

        Arrays.stream(gloves).forEach(glove ->{
            if (boxWithGloves.containsKey(glove)) {
                boxWithGloves.replace(glove, boxWithGloves.get(glove) + 1);
            } else {
                boxWithGloves.put(glove, 1);
            }
        });


        return (int) boxWithGloves.values().stream().mapToLong(i -> i / 2).sum();
    }

    public static void main(String[] args) {
        numberOfPairs(new String[]{"red", "green", "blue", "blue", "red", "green", "red", "red", "red"});
    }

}
