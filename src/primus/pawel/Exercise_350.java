package primus.pawel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Who won the election?
// 7kyu
// https://www.codewars.com/kata/554910d77a3582bbe300009c/train/java
// 2022-01-24 T:18:32:43
class Exercise_350 {

    public static String getWinner(final List<String> listOfBallots) {
        Map<String, Integer> electionBallots = new HashMap<>();

        double allBallots = 0;
        for (String ballot : listOfBallots) {

            if (electionBallots.containsKey(ballot)) {
                electionBallots.put(ballot, electionBallots.get(ballot) + 1);
            } else {
                electionBallots.put(ballot, 1);
            }
            allBallots++;
        }

        String nameOfWinner = electionBallots.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        System.out.println(nameOfWinner);
        System.out.println(electionBallots.get(nameOfWinner));
        return ((double) electionBallots.get(nameOfWinner) > allBallots / 2) ? nameOfWinner : null;
    }

    public static void main(String[] args) {

        System.out.println(getWinner(Arrays.asList("A", "A", "A", "B", "B", "B", "A")));
    }
}
