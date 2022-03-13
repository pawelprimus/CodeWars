package primus.pawel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

// String searching with wildcard
// 6kyu
// https://www.codewars.com/kata/546c7f89bed2e12fb300056f/train/java
// 2022-03-13 T:11:46:23
public class Exercise_397_todo {

    private static final String DASH = "_+";

    static int find(String needle, String haystack) {

        if (needle.equals(haystack)) {
            return 0;
        }


        System.out.println("need [" + needle + "]");
        System.out.println("haystack = [" + haystack + "]");
        Pattern patternOfNeedle = Pattern.compile(DASH);
        Matcher matcherOfNeedle = patternOfNeedle.matcher(needle);

        List<Integer> occAmount = new ArrayList<>();
        int numbers = 0;
        while (matcherOfNeedle.find()) {
            numbers = matcherOfNeedle.end() - matcherOfNeedle.start();
            occAmount.add(numbers);
        }

        for (Integer occ : occAmount) {
            needle = needle.replaceFirst(DASH, String.valueOf("\\\\w{" + occ + "}"));
        }
        System.out.println("new needle = [" + needle + "]");

        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);
        int index = -1;

        if (matcher.find()) {
            index = matcher.start();
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println(find("ex_", "googgoogleggggoooglxeplexhexflexmexkex"));
        //System.out.println(find("(\\w{1})+(po)+(\\w{1})", haystack));
        //System.out.println(find("\\w{3}night", haystack));
        //System.out.println(find("\\w{3}night", haystack));
    }


    static String haystack = "Once upon a midnight dreary, while I pondered, weak and weary";


    @Test
    public void wildSearchTest() {
//        assertEquals(5, Exercise_397.find("_po_", haystack));
  //      assertEquals(12, Exercise_397.find("___night", haystack));
        assertEquals(3, Exercise_397_todo.find("___4$&%$--___", "-..,.44$&%$--,.,"));
    }

}
