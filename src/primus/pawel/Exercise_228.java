package primus.pawel;

import java.time.YearMonth;

// Unlucky Days
// 7kyu
// https://www.codewars.com/kata/56eb0be52caf798c630013c0/train/java
// 2021-09-19 T:15:49:05
class Exercise_228 {

    public static int unluckyDays(int year) {

        YearMonth yearMonth;
        int unluckyDays = 0;
        for (int i = 1; i <= 12; i++) {

            yearMonth = YearMonth.of(year, i);
            if (yearMonth.atDay(13).getDayOfWeek().getValue() == 5) {
                unluckyDays++;
            }
        }
        return unluckyDays;
    }

}
