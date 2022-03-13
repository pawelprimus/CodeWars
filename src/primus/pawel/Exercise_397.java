package primus.pawel;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

// String searching with wildcard
// 6kyu
// https://www.codewars.com/kata/546c7f89bed2e12fb300056f/train/java
// 2022-03-13 T:11:46:23
public class Exercise_397 {

    static int find(String needle, String haystack) {

        if (needle.equals(haystack)) {
            return 0;
        }

        needle = needle.replaceAll("_" , "[ -~]{1}");
        needle = needle.replaceAll("\\$", "[\\$]");
        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);
        int index = -1;

        if (matcher.find()) {
            index = matcher.start();
        }

        while (matcher.find()){
            System.out.println("aa");
        }

        return index;
    }


    public static void main(String[] args) {
        System.out.println(find("ex_", "googgoogleggggoooglxeplexhexflexmexkex"));

    }


    static String haystack = "Once upon a midnight dreary, while I pondered, weak and weary";


    @Test
    public void wildSearchTest() {
        assertEquals(5, Exercise_397.find("_po_", haystack));
      assertEquals(12, Exercise_397.find("___night", haystack));
        assertEquals(3, Exercise_397.find("___4$&%$--___", "-..,.44$&%$--,.,"));
    }

}
