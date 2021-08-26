package primus.pawel;

// World Bits War
// 6kyu
// https://www.codewars.com/kata/58865bfb41e04464240000b0/train/java
//  2021-08-26 T:13:23:33
class Exercise_202 {

    public static String bitsWar(int[] numbers) {
        int oddsOnes = 0;
        int evensOnes = 0;
        int currentLoopNumber;
        for (int i = 0; i < numbers.length; i++) {
            currentLoopNumber = numbers[i];
            if (currentLoopNumber % 2 == 0) {
                evensOnes += countsOnesInNumber(currentLoopNumber);
            } else {
                oddsOnes += countsOnesInNumber(currentLoopNumber);
            }
        }
        if (oddsOnes == evensOnes) {
            return "tie";
        }

        return (oddsOnes > evensOnes) ? "odds win" : "evens win";
    }

    public static int countsOnesInNumber(int number) {
        String binaryNumber = Integer.toBinaryString(number);

        if (number < 0) {
            binaryNumber = Integer.toBinaryString(number * -1);
            return countsOnesInBitNumber(binaryNumber) * -1;
        } else {
            binaryNumber = Integer.toBinaryString(number);
            return countsOnesInBitNumber(binaryNumber);
        }
    }

    public static int countsOnesInBitNumber(String number) {
        int numberOfOnes = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                numberOfOnes++;
            }
        }
        return numberOfOnes;
    }

    public static void main(String[] args) {
    }
}
