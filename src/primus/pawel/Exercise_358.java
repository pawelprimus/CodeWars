package primus.pawel;

// Matrix Square Up, B!
// 7kyu
// https://www.codewars.com/kata/5a972f30ba1bb5a2590000a0/train/java
// 2022-02-01 T:22:07:41
class Exercise_358 {

    public static String[][] matrixSquareUp(int b) {

        String[][] result = new String[b][b];
        int amountOfX = b - 1;

        for (int i = 0; i < b; i++) {


            for (int j = 0; j < b; j++) {
                if (j < amountOfX) {
                    result[i][j] = "x";
                } else {
                    result[i][j] = String.valueOf(b - j);
                }
            }
            amountOfX--;
        }
        return result;
    }


    public static void main(String[] args) {
        matrixSquareUp(5);
    }
}
