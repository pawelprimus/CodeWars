package src.primus.pawel;

// Simple time difference
// 7kyu
// https://www.codewars.com/kata/5b76a34ff71e5de9db0000f2/train/java
// 2022-08-13 T:20:05:10


import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_459 {

  public static String solve(String[] arr) {

    if (arr.length == 1) {
      return "23:59";
    }

    List<String> sorted = Arrays.asList(arr).stream().sorted().collect(Collectors.toList());
    List<LocalTime> times = sorted.stream()
        .map(i -> LocalTime.of(Integer.parseInt(i.split(":")[0]), Integer.parseInt(i.split(":")[1])))
        .collect(Collectors.toList());

    ;

    List<Long> minutesPeriods = new ArrayList<>();

    for (int i = 0; i < times.size() - 1; i++) {

      Long period = times.get(i).until(times.get(i + 1), ChronoUnit.MINUTES);
      minutesPeriods.add(period);

    }

    Long lastPeriod = times.get(times.size() - 1).until(LocalTime.MIDNIGHT.minusMinutes(1), ChronoUnit.MINUTES) +
        LocalTime.MIDNIGHT.until(times.get(0), ChronoUnit.MINUTES);

    minutesPeriods.add(lastPeriod);

    Long maxPeriod = minutesPeriods.stream().max(Comparator.comparing(Long::longValue)).get();

    return LocalTime.MIN.plus(Duration.ofMinutes(maxPeriod)).toString();
  }

  public static void main(String[] args) {

    System.out.println(solve(new String[]{"21:14", "15:34", "14:51", "06:25", "15:30"}));

  }

}
