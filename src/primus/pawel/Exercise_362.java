package primus.pawel;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Convert ISBN-10 to ISBN-13
// 6kyu
// https://www.codewars.com/kata/61ce25e92ca4fb000f689fb0/train/java
// 2022-02-07 T:18:15:30
public class Exercise_362 {

    private static String ISBN_PREFIX = "978";

    public static String isbnConverter(String isbn) {

        String isbnWithoutLast = isbn.substring(0, isbn.length() - 1);
        System.out.println(isbnWithoutLast);
        String numberIsbn = isbnWithoutLast.replaceAll("-", "");
        String removedIsbn = ISBN_PREFIX + numberIsbn;

        int sum = 0;
        for (int i = 0; i < removedIsbn.length(); i++) {
            sum += Integer.parseInt(String.valueOf(removedIsbn.charAt(i))) * ((1 + 2 * (i % 2)));
        }

        int moduloNum = sum % 10;
        int sufixNum = moduloNum == 0 ? 0 : 10 - moduloNum;

        return ISBN_PREFIX + "-" + isbnWithoutLast + sufixNum;
    }


    @Test
    public void test() {
        assertEquals("978-1-85326-158-9", Exercise_362.isbnConverter("1-85326-158-0"));
        assertEquals("978-0-14-143951-8", Exercise_362.isbnConverter("0-14-143951-3"));
        assertEquals("978-0-02-346450-8", Exercise_362.isbnConverter("0-02-346450-X"));
        assertEquals("978-963-14-2164-4", Exercise_362.isbnConverter("963-14-2164-3"));
        assertEquals("978-1-7982-0894-6", Exercise_362.isbnConverter("1-7982-0894-6"));
    }


}

