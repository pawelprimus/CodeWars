package src.primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Emotional Sort ( ︶︿︶)
// 7kyu
// https://www.codewars.com/kata/5a86073fb17101e453000258
// 2023-04-25 T:21:34:18
public class Exercise_516 {

    public static String[] sortEmotions(boolean order, String[] emotions) {
        if (emotions == null || emotions.length == 0) {
            return emotions;
        }

        return Arrays.stream(emotions)
                .map(Exercise_516::emotionToValue).toList()
                .stream()
                .sorted(order ? Comparator.reverseOrder() : Comparator.naturalOrder())
                .map(Exercise_516::valueToEmotion).toArray(String[]::new);
    }

    private static int emotionToValue(String emotion) {
        return switch (emotion) {
            case ":D" -> 5;
            case ":)" -> 4;
            case ":|" -> 3;
            case ":(" -> 2;
            case "T_T" -> 1;
            default -> -1;
        };
    }

    private static String valueToEmotion(int value) {
        return switch (value) {
            case 5 -> ":D";
            case 4 -> ":)";
            case 3 -> ":|";
            case 2 -> ":(";
            case 1 -> "T_T";
            default -> "";
        };
    }

    public static void main(String[] args) {
        sortEmotions(true, new String[]{":D", ":D", ":(", "T_T"});
    }

}


