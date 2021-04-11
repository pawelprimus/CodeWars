package primus.pawel;

// Find the next perfect square!
// 7kyu
// https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java
// 2021-04-11 T:20:38:55
class Exercise_066 {
    public static long findNextSquare(long sq) {
        if (!checkPerfectSquare(sq)) return -1;
        return (long)Math.pow((long)(Math.sqrt(sq) + 1), 2);
    }

    static boolean checkPerfectSquare(long number) {
        double sqrt = Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
