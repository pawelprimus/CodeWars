package primus.pawel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// The queen on the chessboard
// 6kyu
// https://www.codewars.com/kata/5aa1031a7c7a532be30000e5/train/java
// 2021-04-20 T:21:25:42
public class Exercise_085 {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static List<String> availableMoves(String position) {

        if (position == null) return new ArrayList<String>();

        List<String> queenPossibleMoves = new LinkedList<>();

        if (position.length() != 2) return new ArrayList<String>();
        else {
            if (position.charAt(0) < 65 || position.charAt(0) > 72 || position.charAt(1) < 49 || position.charAt(1) > 56) {
                return new ArrayList<String>();
            }
        }
        final int QUEEN_VERTICAL_POS = position.charAt(0) - 65;
        final int QUEEN_DIAGONAL_POS = position.charAt(1) - 49;

        for (int i = 0; i < 8; i++) {
            // System.out.print("|");
            for (int j = 0; j < 8; j++) {
                if (i == QUEEN_VERTICAL_POS || j == QUEEN_DIAGONAL_POS
                        || (i + QUEEN_DIAGONAL_POS) == (j + QUEEN_VERTICAL_POS)
                        || ((i + j) == QUEEN_DIAGONAL_POS + QUEEN_VERTICAL_POS)) {
                    // System.out.print(ANSI_GREEN + Character.valueOf((char) (i + 65)) + " " + (j + 1) + ANSI_RESET);
                    queenPossibleMoves.add(Character.valueOf((char) (i + 65)).toString() + (j + 1));
                } else {
                    //    System.out.print(Character.valueOf((char) (i + 65)) + " " + (j + 1));
                }
                //  System.out.print("|");
            }
            //System.out.println();
        }
        //System.out.println(queenPossibleMoves);
        queenPossibleMoves.remove(position);
        return queenPossibleMoves;
    }


    public static void main(String[] args) {

        //availableMoves("D5");
    }
}
