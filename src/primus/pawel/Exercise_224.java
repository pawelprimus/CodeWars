package primus.pawel;

//
//
// https://www.codewars.com/kata/5fc4349ddb878a0017838d0f/train/java
// 2021-09-14 T:23:42:57
class Exercise_224 {

    public static PawnDistance redKnight(int knight, long pawn) {

        long newPawnPosition = pawn * 2;

        String pawnColor;
        if ((pawn + knight) % 2 == 0) {
            pawnColor = "White";
        } else {
            pawnColor = "Black";
        }

        return new PawnDistance(pawnColor, newPawnPosition);
    }

    static class PawnDistance {
        private String color;
        private long distance;

        public PawnDistance(String s, long d) {
            color = s;
            distance = d;
        }
    }

}
