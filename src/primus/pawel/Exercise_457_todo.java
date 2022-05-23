package primus.pawel;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastInMonth;

// How many working days
// 6kyu
// https://www.codewars.com/kata/58e0534a95923f0820000013/train/java
// 2022-05-22 T:22:07:06
class Exercise_457_todo {

    static long count(final LocalDate start, final LocalDate end) {

        System.out.println(start);
        System.out.println(end);
        long result = 0;
        LocalDate firstMonday = start.with(firstInMonth(DayOfWeek.MONDAY));
        LocalDate lastFriday = end.with(lastInMonth(DayOfWeek.FRIDAY));

        while (firstMonday.isBefore(lastFriday)) {

            result += 5;
            firstMonday = firstMonday.plusWeeks(1);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(count(LocalDate.of(-999999999,1,1),LocalDate.of(999999999,1,1) ));
    }


}
