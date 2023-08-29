package src.primus.pawel;

// Two numbers are positive
// 7kyu
// https://www.codewars.com/kata/602db3215c22df000e8544f0/train/java
// 2023-08-29 T:20:54:20
public class Exercise_522 {

    public static boolean twoArePositive(int a, int b, int c) {
        int positives = 0;
        positives += a > 0 ? 1 : 0;
        positives += b > 0 ? 1 : 0;
        positives += c > 0 ? 1 : 0;
        return positives == 2;
    }

    public static void main(String[] args) {
        System.out.println(twoArePositive(2, -4, 3));
    }
}
