package primus.pawel;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

// Srot the inner ctonnet in dsnnieedcg oredr
// 6kyu
// https://www.codewars.com/kata/5898b4b71d298e51b600014b/train/java
// 2022-02-27 T:15:05:17
public class Exercise_385 {

    public static String sortTheInnerContent(String words) {
        return Arrays.stream(words.split(" ")).map(i -> sortInnerWord(i)).collect(Collectors.joining(" "));
    }

    private static String sortInnerWord(String word) {
        if (word.length() <= 2) {
            return word;
        }

        StringBuilder innerWord = new StringBuilder(word.substring(1, word.length() - 1)
                .chars().sorted().mapToObj(c -> (char) c).map(Object::toString).collect(Collectors.joining(""))).reverse();

        return word.charAt(0) + innerWord.toString() + word.charAt(word.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(sortInnerWord("azbcgdze"));
    }

    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", Exercise_385.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", Exercise_385.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", Exercise_385.sortTheInnerContent("this kata is easy"));
    }

}
