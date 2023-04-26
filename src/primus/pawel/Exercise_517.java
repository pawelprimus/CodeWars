package src.primus.pawel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// Simple Fun #210: Maximize Points
// 6kyu
// https://www.codewars.com/kata/58fec262184b6dc30800000d
// 2023-04-26 T:19:01:51
public class Exercise_517 {

    public static int maximizePoints(int[] team1, int[] team2) {
        List<Integer> teamOneSorted = IntStream.of(team1)
                .boxed()
                .toList()
                .stream()
                .sorted(Comparator.naturalOrder())
                .toList();

        List<Integer> teamTwoSorted = new ArrayList<>(IntStream.of(team2)
                .boxed()
                .toList()
                .stream()
                .sorted(Comparator.naturalOrder())
                .toList());

        for (Integer playerOne : teamOneSorted) {
            for (Integer playerTwo : teamTwoSorted) {
                if (playerOne > playerTwo) {
                    teamTwoSorted.remove(playerTwo);
                    break;
                }
            }
        }

        return team1.length - teamTwoSorted.size();
    }


    public static void main(String[] args) {
        System.out.println(maximizePoints(new int[]{7, 19, 23, 18, 38, 37, 38, 40}, new int[]{21, 12, 1, 0, 13, 38, 25, 49}));
    }
}

//  Arrays.sort(team1);
//    Arrays.sort(team2);