package primus.pawel;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

// What century is it?
// 6kyu
// https://www.codewars.com/kata/52fb87703c1351ebd200081f/train/java
// 2022-02-17 T:21:26:39
public class Exercise_375 {

    static HashMap<Character, String> centuryCount = new HashMap<>();

    public static String whatCentury(int year) {
        fillMapOne();
        String result = String.valueOf(yearToCentury(year));

        return result.charAt(0) == '1' ?  result + "th" :
                result + centuryCount.get(result.charAt(1));
    }

    static void fillMapOne() {
        centuryCount.put('0', "th");
        centuryCount.put('1', "st");
        centuryCount.put('2', "nd");
        centuryCount.put('3', "rd");
        centuryCount.put('4', "th");
        centuryCount.put('5', "th");
        centuryCount.put('6', "th");
        centuryCount.put('7', "th");
        centuryCount.put('8', "th");
        centuryCount.put('9', "th");
    }


    private static int yearToCentury(int year) {
        return year % 100 == 0 ? year / 100 : (year / 100) + 1;
    }

    @Test
    public void testSomething() {
        assertEquals("20th", Exercise_375.whatCentury(1999));
        assertEquals("21st", Exercise_375.whatCentury(2011));
        assertEquals("22nd", Exercise_375.whatCentury(2154));
        assertEquals("23rd", Exercise_375.whatCentury(2259));
    }
}
