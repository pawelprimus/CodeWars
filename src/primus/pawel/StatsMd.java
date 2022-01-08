package primus.pawel;

public class StatsMd {
    private static String BR_END = "<br />";

    StringBuilder header = new StringBuilder();
    StringBuilder stats = new StringBuilder();
    StringBuilder exercises = new StringBuilder();

    StatsMd() {
        header.append("![](https://www.codewars.com/users/%3Cprim%3Erim%3C%2Fprim%3E/badges/large)").append(BR_END);
        header.append("Exercises made in https://www.codewars.com");

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
