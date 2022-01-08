package primus.pawel;

import java.util.ArrayList;

public class StatsMd {
    private static String BR_END = "<br />";

    StringBuilder header = new StringBuilder();
    StringBuilder stats = new StringBuilder();
    StringBuilder exercises = new StringBuilder();

    int[] kyulevels = new int[8];
    int done = 0;
    int todo = 0;

    StatsMd() {
        header.append("![](https://www.codewars.com/users/%3Cprim%3Erim%3C%2Fprim%3E/badges/large)").append(BR_END);
        header.append("Exercises made in https://www.codewars.com");
    }

    void addExercisesAndSetStats(ArrayList<Kata> katasLists){
        for (Kata kata : katasLists) {
            System.out.println(kata.toFile());

            stats.append(kata.toFile());
            if (kata.getStatus().equals(Kata.Status.DONE)) {
                done++;
                kyulevels[kata.getKyuNumber() - 1]++;
            } else {
                todo++;
            }
        }
        setStats();
    }

    public void setStats(){
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

    public void addExercise(String exercise) {
        exercises.append(exercise).append(BR_END);
    }

    public void addTextToStats(String text) {
        stats.append(text);
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
