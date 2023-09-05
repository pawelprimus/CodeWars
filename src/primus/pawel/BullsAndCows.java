package src.primus.pawel;

public class BullsAndCows {

    private int turns = 8;
    private int secretNumber = 0;
    private boolean isWon = false;

    public BullsAndCows(int n) {
        checkNumberCorrection(n);
        this.secretNumber = n;
    }

    public String compareWith(int n) {
        if (isWon) {
            return "You already won!";
        }


        if (turns == 0) {
            return "Sorry, you're out of turns!";
        }

        checkNumberCorrection(n);

        turns--;
        int bulls = 0;
        int cows = 0;

        char[] numberToCompare = String.valueOf(n).toCharArray();
        char[] secretNumberChars = String.valueOf(secretNumber).toCharArray();

        for (int i = 0; i < 4; i++) {
            if (numberToCompare[i] == secretNumberChars[i]) {
                bulls++;
                secretNumberChars[i] = 'x';
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (numberToCompare[i] == secretNumberChars[j]) {
                    cows++;
                    break;
                }
            }
        }

        if (bulls == 4) {
            isWon = true;
            return "You win!";
        }

        String bullString = bulls + " bull" + (bulls == 1 ? "" : "s");
        String cowString = cows + " cow" + (cows == 1 ? "" : "s");
        return bullString + " and " + cowString;
    }

    private static void checkNumberCorrection(int num) {
        if (num < 1000 || num > 9999 || String.valueOf(num).chars()
                .mapToObj(e -> (char) e).distinct().toList().size() != 4 ) {
            throw new IllegalArgumentException();
        }
    }

}
