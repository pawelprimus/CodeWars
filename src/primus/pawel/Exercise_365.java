package primus.pawel;

// Simple card game
// 6kyu
// https://www.codewars.com/kata/53417de006654f4171000587/train/java
// 2022-02-08 T:21:41:27
public class Exercise_365 {

    private static final String STEVE_WON = "Steve wins %s to %s";
    private static final String JOSH_WON = "Josh wins %s to %s";
    private static final String TIE = "Tie";

    public String winner(String[] deckSteve, String[] deckJosh) {
        int stevePoints = 0;
        int joshPoints = 0;
        int joshNum = 0;
        int steveNum = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            steveNum = cardToPower(deckSteve[i]);
            joshNum = cardToPower(deckJosh[i]);

            if (steveNum != joshNum) {
                if (joshNum > steveNum) {
                    joshPoints++;
                } else {
                    stevePoints++;
                }
            }
        }

        if (joshPoints != stevePoints) {
            return joshPoints > stevePoints ? String.format(JOSH_WON, joshPoints, stevePoints) : String.format(STEVE_WON, stevePoints, joshPoints);
        }
        return TIE;
    }

    int cardToPower(String card) {

        if (isNumeric(card)) {
            return Integer.parseInt(card);
        }

        switch (card) {
            case "T":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return -1;
        }
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
