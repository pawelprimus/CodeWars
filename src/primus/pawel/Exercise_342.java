package primus.pawel;

// Greatest common divisor
// 7kyu
// https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd/train/java
// 2022-01-15 T:13:03:36
class Exercise_342 {

    public static int compute(int x, int y) {
        int gcd = y;
        while (x % y != 0) {
            gcd = x % y;
            x = y;
            y = gcd;
        }
        return gcd;
    }
}
