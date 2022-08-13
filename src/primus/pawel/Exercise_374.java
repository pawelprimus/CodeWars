package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Aerial Firefighting
// 7kyu
// https://www.codewars.com/kata/5d10d53a4b67bb00211ca8af/train/java
// 2022-02-17 T:21:06:46
public class Exercise_374 {

    public static int waterbombs(String fire, int w) {
        String[] fires = fire.split("Y");
        int result = 0;
        for (String word : fires) {
            result += Math.ceil((double) word.length() / w);
        }
        return result;
    }


    @Test
    public void basicTests() {
        assertEquals(3, Exercise_374.waterbombs("xxxxYxYx", 4));
        assertEquals(2, Exercise_374.waterbombs("xxYxx", 3));
    }
}
