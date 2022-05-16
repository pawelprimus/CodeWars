package primus.pawel;

import java.time.LocalDate;

// Count the number of days between two dates
// 6kyu
// https://www.codewars.com/kata/59569ba543e2a8ebda00012a/train/java
// 2022-05-16 T:21:09:16
class Exercise_450_todo {

    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {

        LocalDate ld1 = LocalDate.of(year, month, day);
        LocalDate ld2 = LocalDate.of(year2, month2, day2);

        return ld1.datesUntil(ld2).count();
    }
}
