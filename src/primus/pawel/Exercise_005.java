package primus.pawel;
// Greed is Good
// 5kyu
//https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
//

class Exercise_005 {

    public static int greedy(int[] dice) {

        int[] diceShots = {0, 0, 0, 0, 0, 0};
        int result = 0;

        for (int i = 0; i < 5; i++) {
            diceShots[dice[i] - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            if (diceShots[i] > 2) {
                if (i == 0) {
                    result += 1000;
                } else {
                    result += (i + 1) * 100;
                }
                diceShots[i] -= 3;
            }

        }

        result += (diceShots[0]) * 100;
        result += (diceShots[4]) * 50;

        return result;
    }

    public static void main(String[] args) {

        System.out.println(greedy(new int[]{1, 1, 1, 3, 1}));

    }

}
