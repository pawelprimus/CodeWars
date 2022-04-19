package primus.pawel;

// Triangular Treasure
// 7kyu
// https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java
// 2022-04-19 T:22:58:28
class Exercise_426 {

    public static long triangular(long n) {
        if (n <= 0) {
            return 0;
        }

        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

//return IntStream.range(1, n+1).sum();
