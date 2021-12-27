package primus.pawel;

import java.util.ArrayList;

// Broken sequence
// 7kyu
// https://www.codewars.com/kata/5512e5662b34d88e44000060/train/java
// 2021-12-27 T:22:44:33
class Exercise_148 {

    public static int findMissingNumber(String sequence) {

        if (sequence.length() == 0) {
            return 0;
        }

        boolean[] occurences = new boolean[sequence.length()];
        String[] numbers = sequence.split(" ");
        int numberCounter = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                int number = Integer.parseInt(numbers[i]);
                occurences[number] = true;
                numberCounter++;
            } catch (NumberFormatException nfe) {
                return 1;
            }
        }

        for (int i = 1; i <= numberCounter; i++) {
            if (!occurences[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(findMissingNumber("2 1 4 3 a"));
    }


}
