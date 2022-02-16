package primus.pawel;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

// Number-Star ladder
// 7kyu
// https://www.codewars.com/kata/5631213916d70a0979000066/train/java
// 2022-02-16 T:20:46:09
public class Exercise_373 {

    public static String pattern(int n) {

        StringBuilder result = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            result.append("\n").append("1").append(String.join("", Collections.nCopies(i - 1, "*"))).append(i);
        }
        return result.toString();
    }

    String a1 = "1\n1*2\n1**3";
    String a2 = "1\n1*2\n1**3\n1***4\n1****5\n1*****6\n1******7";
    String a3 = "1\n1*2\n1**3\n1***4\n1****5\n1*****6\n1******7\n1*******8\n1********9\n1*********10\n1**********11\n1***********12\n1************13\n1*************14\n1**************15\n1***************16\n1****************17\n1*****************18\n1******************19\n1*******************20";


    @Test
    public void basicTest() {
        assertEquals("1", Exercise_373.pattern(1), "For input \"1\"");
        assertEquals("1\n1*2", Exercise_373.pattern(2), "For input \"2\"");
        assertEquals(a1, Exercise_373.pattern(3), "For input \"3\"");
        assertEquals(a2, Exercise_373.pattern(7), "For input \"7\"");
        assertEquals(a3, Exercise_373.pattern(20), "For input \"20\"");
    }
}
