package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// Create palindrome
// 7kyu
// https://www.codewars.com/kata/5b7bd90ef643c4df7400015d/train/java
// 2022-04-24 T:13:23:36
public class Exercise_430 {
    public static boolean redacted(String doc1, String doc2) {

        if (doc1 == null || doc2 == null) {
            return false;
        }
        doc1 = doc1.replaceAll(" ", "1");
        doc2 = doc2.replaceAll(" ", "1");
        if (doc1.length() != doc2.length()) {
            return false;
        }

        for (int i = 0; i < doc1.length(); i++) {
                if ((doc1.charAt(i) != 'X') && (doc1.charAt(i) != doc2.charAt(i) )) {
                    return false;
                }
        }

        return doc1.trim().length() == doc2.trim().length() ;
    }

    @Test
    public void ex1() {
        String doc1 = "TOP SECRET:\nThe missile launch code for Sunday XXXXXXXXXX is:\nXXXXXXXXXXXXXXXXX";
        String doc2 = "TOP SECRET:\nThe missile launch code for Sunday 5th August is:\n7-ZERO-8X-ALPHA-1";
        assertTrue(Exercise_430.redacted(doc1, doc2));
    }

    @Test
    public void ex2() {
        String doc1 = "The name of the mole is Professor XXXXX";
        String doc2 = "The name of the mole is Professor Dinglemouse";
        assertFalse(Exercise_430.redacted(doc1, doc2));
    }

    @Test
    public void ex3() {
        String doc1 = "XXXXXXXX XXXXXXX XXXXXXXXXXXXXXXXXXX\nXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXX XXXXXXXXXXXXX XXXXX";
        String doc2 = "Area-51. Medical Report. 23/Oct/1969\nE.T. subject 4 was given an asprin after reporting sick for duty today";
        assertTrue(Exercise_430.redacted(doc1, doc2));
    }
}
