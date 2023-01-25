package src.primus.pawel;

// 80's Kids #2: Help ALF Find His Spaceship
// 7kyu
// https://www.codewars.com/kata/5660aa3d5e011dfd6e000063/train/java
// 2023-01-25 T:20:34:54
public class Exercise_499 {

    private static final String NOT_FOUND = "Spaceship lost forever.";
    private static final String COORD_FORMAT = "[%s, %s]";


    public static String findSpaceship(String map) {
        String[] rows = map.split("\n");

        for (int i = 0; i < rows.length; i++) {

            for (int j = 0; j < rows[i].length(); j++) {
                if (rows[i].charAt(j) == 'X') {
                    return String.format(COORD_FORMAT, j, rows.length - i - 1);
                }
            }
        }
        return NOT_FOUND;
    }

    public static void main(String[] args) {
        System.out.println(findSpaceship("..........\n" +
                "..........\n" +
                "..........\n" +
                ".......X..\n" +
                "..........\n" +
                ".........."));
    }

}
