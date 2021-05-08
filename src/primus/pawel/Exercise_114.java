package primus.pawel;

import java.util.Arrays;
import java.util.List;

// Positions average
// 6kyu
// https://www.codewars.com/kata/59f4a0acbee84576800000af/train/java
// 2021-05-08 T:16:23:31
class Exercise_114 {

    public static double posAverage(String s) {
        double allPositions = 0;
        List<String> splitedWordList = Arrays.asList(s.split("[\\s+,]+"));
        double commonsPositions = 0;

        for (int i = 0; i < splitedWordList.size(); i++) {
            for (int j = i + 1; j < splitedWordList.size(); j++) {
                commonsPositions += compareTwoWords(splitedWordList.get(i), splitedWordList.get(j));
                allPositions++;
            }
        }
        allPositions = allPositions * splitedWordList.get(0).length();

        return commonsPositions == 0 ? 0 : (commonsPositions / allPositions) * 100;
    }

    public static double compareTwoWords(String firstWord, String secondWord) {

        int sameCharsAmount = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) == secondWord.charAt(i)) {
                sameCharsAmount++;
            }
        }
        return sameCharsAmount;
    }

    public static void main(String[] args) {
        System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"));
    }


}
