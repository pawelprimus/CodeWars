package primus.pawel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Age in days
// 7kyu
// https://www.codewars.com/kata/5803753aab6c2099e600000e/train/java
// 2022-01-08 T:12:32:27
class Exercise_331 {

    private static String RESULT_TEXT = "You are %s days old";

    public static String ageInDays(int year, int month, int day) {
        LocalDate NOW = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        long daysDiff = Math.abs(ChronoUnit.DAYS.between(NOW, birthday));

        return String.format(RESULT_TEXT, daysDiff);
    }

    public static void main(String[] args) {
        System.out.println(ageInDays(1999, 10, 1));
    }

}
