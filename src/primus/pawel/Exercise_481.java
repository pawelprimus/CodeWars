package src.primus.pawel;

// Determine the date by the day number
// 6kyu
// https://www.codewars.com/kata/602afedfd4a64d0008eb4e6e/train/java
// 2022-09-10 T:09:40:29

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise_481 {

  public static String getDay(int day, boolean isLeap) {
    int year  = isLeap ? 2024 : 2022;

    LocalDate ld = LocalDate.of(year, 1 , 1).plusDays(day - 1);
    String monthName = ld.getMonth().toString();
    return monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase() + ", " + ld.getDayOfMonth();
  }

  public static void main(String[] args) {

    System.out.println(getDay(1 , true));
    System.out.println(getDay(1 , false));
  }
}
