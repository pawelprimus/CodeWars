package primus.pawel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

// Most Frequent Weekdays
// 6kyu
// https://www.codewars.com/kata/56eb16655250549e4b0013f4/train/java
// 2022-03-17 T:00:27:52
class Exercise_400 {

    public static String[] mostFrequentDays(int year) {
        LocalDate localDate = LocalDate.of(year, 1, 1);
        localDate.plusDays(1);

        LinkedHashMap<DayOfWeek, Integer> daysMap = new LinkedHashMap();
        daysMap.put(DayOfWeek.MONDAY, 0);
        daysMap.put(DayOfWeek.TUESDAY, 0);
        daysMap.put(DayOfWeek.WEDNESDAY, 0);
        daysMap.put(DayOfWeek.THURSDAY, 0);
        daysMap.put(DayOfWeek.FRIDAY, 0);
        daysMap.put(DayOfWeek.SATURDAY, 0);
        daysMap.put(DayOfWeek.SUNDAY, 0);

        int daysInYear = localDate.isLeapYear() ? 366 : 365;

        for (int i = 0; i < daysInYear; i++) {
            daysMap.computeIfPresent(localDate.getDayOfWeek(), (k, v) -> v + 1);
            localDate = localDate.plusDays(1);
        }
        List<String> days = new ArrayList<>();
        for (DayOfWeek dayOfWeek : daysMap.keySet()) {
            Integer value = daysMap.get(dayOfWeek);

            if (value == 53) {
                String day = dayOfWeek.toString().toLowerCase();
                days.add(day.substring(0, 1).toUpperCase() + day.substring(1));
            }
        }
        return days.toArray(new String[days.size()]);
    }

    public static void main(String[] args) {

        Arrays.stream(mostFrequentDays(3556)).forEach(System.out::println);
    }
}
