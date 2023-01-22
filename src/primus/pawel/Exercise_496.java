package src.primus.pawel;

// Smoking Timmy
// 7kyu
// https://www.codewars.com/kata/5a0aae48ba2a14cfa600016d/train/java
// 2023-01-22 T:21:35:11
public class Exercise_496 {

    private static final int CIGARETES_IN_BOX = 18;
    private static final int BOX_IN_BAR = 10;

    public static int startSmoking(int bars, int boxes) {
        int cigaretes = (bars * BOX_IN_BAR * CIGARETES_IN_BOX) + (boxes * CIGARETES_IN_BOX);
        int stubs = cigaretes;

        while (stubs >= 5) {
            cigaretes += stubs / 5;
            stubs =  stubs % 5 + stubs / 5;
        }

        return cigaretes;
    }

    public static void main(String[] args) {
        System.out.println(startSmoking(0, 1));
        System.out.println(startSmoking(1, 0));
    }


}
