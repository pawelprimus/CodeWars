package primus.pawel;

// Numbers Zoo Patrol
// 6kyu
// https://www.codewars.com/kata/5276c18121e20900c0000235/train/java
// 2021-07-01 T:19:38:39
class Exercise_168 {

    public static int findMissingNumber(int[] numbers) {
        boolean[] occurencesOfNumbers = new boolean[numbers.length + 2];

        for (int i = 0; i < numbers.length; i++) {
            occurencesOfNumbers[numbers[i]] = true;
        }

        for (int i = 1; i < occurencesOfNumbers.length; i++) {
            if (occurencesOfNumbers[i] == false) {
                return i;
            }
        }
        return 0;
    }


}
