package primus.pawel;

import java.util.ArrayList;

public class StatsMd {
    private static final String BR_END = "<br />";
    private static final String MY_CW_WEBSTIE = "{https://www.codewars.com/users/%3Cprim%3Erim%3C%2Fprim%3E/badges/large}";

    private static final String HEADER_FIRST_TEXT = "![]" + MY_CW_WEBSTIE + BR_END;
    private static final String HEADER_SECOND_TEXT = "Exercises made in https://www.codewars.com";

    StringBuilder header = new StringBuilder();
    StringBuilder stats = new StringBuilder();
    StringBuilder exercises = new StringBuilder();

    private int[] kyulevels = new int[8];
    private int done = 0;
    private int todo = 0;

    StatsMd() {
        header.append(HEADER_FIRST_TEXT);
        header.append(HEADER_SECOND_TEXT);
    }

    void addExercisesAndSetStats(ArrayList<Kata> katasLists) {
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
        setStats();
    }

    private void setStats() {
        stats.append(getKyuStats(kyulevels));
        stats.append(("<br />") + ("<br />") + ("DONE: " + done) + ("<br />"));
        stats.append("TODO: " + todo + "<br />");
    }

    private static String getKyuStats(int[] kyulevels) {
        StringBuilder kyuStats = new StringBuilder();
        for (int i = 0; i < kyulevels.length; i++) {
            if (kyulevels[i] > 0) {
                kyuStats.append(" - ").append(i + 1).append("KYU: ").append(kyulevels[i]).append("\n");
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
