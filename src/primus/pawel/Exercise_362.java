package primus.pawel;

import org.junit.Test;

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



}

