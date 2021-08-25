package primus.pawel;

import java.nio.channels.OverlappingFileLockException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Find the nth occurrence of a word in a string!
// 7kyu
// https://www.codewars.com/kata/5b1d1812b6989d61bd00004f/train/java
// 2021-08-25 T:17:34:13
class Exercise_201 {

    public static int findNthOccurrence(String subStr, String str, int occurrence) {
        int indexOfOccurence = -1;
        int fromIndex = -1;
        int i = 0;
        while (i != occurrence) {
            fromIndex = str.indexOf(subStr, fromIndex + 1);
            if (fromIndex != -1) {
                i++;
                if (i == occurrence) {
                    indexOfOccurence = fromIndex;
                }
            } else {
                break;
            }
        }
        return indexOfOccurence;
    }


    public static void main(String[] args) {
        String string = "TestTestTestTestTest";
        System.out.println(findNthOccurrence("TestTest", string, 3));
    }

}
