package src.primus.pawel;

// Cogs
// 7kyu
// https://www.codewars.com/kata/59e1b9ce7997cbecb9000014/train/java
// 2023-07-15 T:20:56:27
public class Exercise_520 {

    public static double cogRpm(final int[] cogs) {

        double rotation = 1.0;
        for (int i = 0; i < cogs.length - 1; i++) {
            rotation = (double) cogs[i] / (double) cogs[i + 1] * rotation;
        }
        int sign = cogs.length % 2 == 1 ? 1 : -1;
        return rotation * sign;
    }

    public static void main(String[] args) {

        System.out.println("RESULT " + cogRpm(new int[]{100, 75}));
        System.out.println("RESULT " + cogRpm(new int[]{53, 35, 44, 35, 51, 77, 24, 91, 46, 33, 84, 96, 52, 97, 56, 23, 74, 84, 62})); // 0.8548387096774194

    }
}
