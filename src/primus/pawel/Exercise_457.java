package primus.pawel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastInMonth;

// How many working days
// 6kyu
// https://www.codewars.com/kata/58e0534a95923f0820000013/train/java
// 2022-05-22 T:22:07:06
class Exercise_457 {

    static long count(final LocalDate start, final LocalDate end) {

        LocalDate firstMonday = start.with(firstInMonth(DayOfWeek.MONDAY));
        LocalDate lastFriday = end.with(lastInMonth(DayOfWeek.FRIDAY));

        long days = ChronoUnit.DAYS.between(firstMonday, lastFriday) + 1;
        return days - 2 * (days / 7);
    }


    public static void main(String[] args) {

//        System.out.println(count(LocalDate.of(2017, 6, 1), LocalDate.of(2017, 6, 1)));
//        System.out.println(count(LocalDate.of(2012, 2, 1), LocalDate.of(2012, 4, 1)));
//        System.out.println(count(LocalDate.of(2078, 1, 1), LocalDate.of(2079, 1, 1)));
//        System.out.println(count(LocalDate.of(-1000, 6, 1), LocalDate.of(-970, 4, 1)));
        System.out.println(count(LocalDate.of(-999999999, 1, 1), LocalDate.of(999999999, 12, 31)));
    }


}
