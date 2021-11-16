package primus.pawel;

import java.util.ArrayList;

// Number of people in the bus
// 7kyu
// https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
// 2021-05-09 T:20:24:30
class Exercise_116 {
    public static int countPassengers(ArrayList<int[]> stops) {
        int peopleInTheBus = 0;
        for (int[] intArr : stops) {
            peopleInTheBus += intArr[0];
            peopleInTheBus -= intArr[1];
        }
        return peopleInTheBus;
    }
}
/*  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
  }*/