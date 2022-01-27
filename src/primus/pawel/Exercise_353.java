package primus.pawel;

// Scrabble Score
// 7kyu
// https://www.codewars.com/kata/558fa34727c2d274c10000ae/train/java
// 2022-01-27 T:22:23:05
class Exercise_353 {

    static final String ONE = "AEIOULNRST";
    static final String TWO = "DG";
    static final String THREE = "BCMP";
    static final String FOUR = "FHVWY";
    static final String FIVE = "K";
    static final String EIGHT = "JX";
    static final String TEN = "QZ";

    public static int scrabbleScore(String word) {

        int result = 0;
        for (char loopChar : word.toCharArray()) {
            if (ONE.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 1;
            } else if (TWO.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 2;
            } else if (THREE.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 3;
            } else if (FOUR.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 4;
            } else if (FIVE.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 5;
            } else if (EIGHT.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 8;
            } else if (TEN.contains(String.valueOf(loopChar).toUpperCase())) {
                result += 10;
            }
        }

        return result;
    }

    //solution
}


