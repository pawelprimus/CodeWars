package primus.pawel;

import java.util.Arrays;
import java.util.Collections;

// LOTTO 6 aus 49 - 6 of 49
// 6kyu
// https://www.codewars.com/kata/57a98e8172292d977b000079/train/java
// 2021-09-13 T:19:03:52
class Exercise_222 {

    public static int[] numberGenerator() {

        Integer[] array_1_to_49 = new Integer[49];
        Integer[] array_0_to_9 = new Integer[10];
        int[] arrayWithSevenNumbers = new int[7];
        arrayWithSevenNumbers[6] = Integer.MAX_VALUE;

        for (int i = 1; i <= 49; i++) {
            array_1_to_49[i - 1] = i;
        }
        for (int i = 0; i <= 9; i++) {
            array_0_to_9[i] = i;
        }

        Collections.shuffle(Arrays.asList(array_1_to_49));
        Collections.shuffle(Arrays.asList(array_0_to_9));
        for (int i = 0; i < 6; i++) {
            arrayWithSevenNumbers[i] = array_1_to_49[i];
        }

        Arrays.sort(arrayWithSevenNumbers);

        arrayWithSevenNumbers[6] = array_0_to_9[0];

        return arrayWithSevenNumbers;
    }

    public static int checkForWinningCategory(int[] checkCombination, int[] winningCombination) {

        int normalNumbersCount = 0;
        boolean superZahlFlag = false;

        if (checkCombination.length != 7 || winningCombination.length != 7) {
            return -1;
        }

        for (int i = 0; i < checkCombination.length - 1; i++) {
            for (int j = 0; j < winningCombination.length - 1; j++) {
                if (checkCombination[i] == winningCombination[j]) {
                    normalNumbersCount++;
                }
            }
        }

        if (checkCombination[6] == winningCombination[6]) {
            superZahlFlag = true;
        }

        switch (normalNumbersCount) {
            case 6:
                return superZahlFlag ? 1 : 2;
            case 5:
                return superZahlFlag ? 3 : 4;
            case 4:
                return superZahlFlag ? 5 : 6;
            case 3:
                return superZahlFlag ? 7 : 8;
            case 2:
                return superZahlFlag ? 9 : -1;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        numberGenerator();
    }
}


/*
  var raffle = new Random().ints(1, 51).distinct().limit(7).sorted().toArray();

1  - 6 numbers and Superzahl match
2  - 6 numbers match
3  - 5 numbers and Superzahl match
4  - 5 numbers match
5  - 4 numbers and Superzahl match
6  - 4 numbers match
7  - 3 numbers and Superzahl match
8  - 3 numbers match
9  - 2 numbers and Superzahl match
-1 - if the numbers do not match any of the rules above
*/
