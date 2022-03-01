package primus.pawel;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

// Difference between years. (Level 1)
//  7kyu
// https://www.codewars.com/kata/588f5a38ec641b411200005b/train/java
// 2022-03-01 T:19:29:24
class Exercise_386 {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static int howManyYears(String date1, String date2) {
        String[] date1Arr = date1.split("/");
        String[] date2Arr = date2.split("/");

        LocalDate localDate1 = LocalDate.of(Integer.parseInt(date1Arr[0]), Month.of(Integer.parseInt(date1Arr[1])), Integer.parseInt(date1Arr[2]));
        LocalDate localDate2 = LocalDate.of(Integer.parseInt(date2Arr[0]), Month.of(Integer.parseInt(date2Arr[1])), Integer.parseInt(date2Arr[2]));

        return Math.abs(localDate1.getYear() - localDate2.getYear());
    }


}
