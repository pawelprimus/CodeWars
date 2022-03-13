package primus.pawel;

import java.util.ArrayList;

public class StatsMd {
    private static final String BR_END = "<br />";
    private static final String MY_CW_WEBSTIE = "(https://www.codewars.com/users/%3Cprim%3Erim%3C%2Fprim%3E/badges/large)";

    private static final String HEADER_FIRST_TEXT = "![]" + MY_CW_WEBSTIE + BR_END;
    private static final String HEADER_SECOND_TEXT = "Exercises made in https://www.codewars.com";

    StringBuilder header = new StringBuilder();
    StringBuilder stats = new StringBuilder();
    StringBuilder exercises = new StringBuilder();

    private int[] kyulevels;
    private int done;
    private int todo;

    StatsMd() {
        header.append(HEADER_FIRST_TEXT);
        header.append(HEADER_SECOND_TEXT);
    }

    void addExercisesAndSetStats(ArrayList<Kata> katasLists, String languateType) {
        kyulevels = new int[8];
        done = 0;
        todo = 0;

        for (Kata kata : katasLists) {
            System.out.println(kata.toFile());

            exercises.append(kata.toFile()).append(BR_END);
            if (kata.getStatus().equals(Kata.Status.DONE)) {
                done++;
                kyulevels[kata.getKyuNumber() - 1]++;
            } else {
                todo++;
            }
        }
        setStats(languateType);
        exercises.append(BR_END);
    }

    private void setStats(String languateType) {
        stats.append("\n").append(languateType).append("\n");
        stats.append(getKyuStats(kyulevels));
        stats.append((BR_END) + (BR_END) + ("DONE: " + done) + (BR_END));
        stats.append("TODO: " + todo + BR_END).append(BR_END);
    }

    private static String getKyuStats(int[] kyulevels) {
        StringBuilder kyuStats = new StringBuilder();
        kyuStats.append("| KYU LEVEL | DONE | ").append("\n");
        kyuStats.append("| - | - | ").append("\n");
        for (int i = 0; i < kyulevels.length; i++) {
            if (kyulevels[i] > 0) {
                kyuStats.append(" | ").append(i + 1).append(" | ").append(kyulevels[i]).append(" | ").append("\n");
            }
        }

        System.out.println(kyuStats.toString());
        return kyuStats.toString();
    }

    String getHeader() {
        return header.toString();
    }

    String getStats() {
        return stats.toString();
    }

    String getExercises() {
        return exercises.toString();
    }
}
