package primus.pawel;

// Simple neares prime
// 6kyu
// https://www.codewars.com/kata/5a9078e24a6b340b340000b8/train/java
// 2021-06-11 T:20:24:07
class Exercise_154 {

    public static long solve(long n) {

        if (isPrime(n)) {
            return n;
        }

        long i = 0;
        while (true) {

            if ((n - i) > 0) {
                if (isPrime(n - i))
                    return n - i;
            }
            if (isPrime(n + i)) {
                return n + i;
            }
            i++;
        }

    }

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }


    /*private static boolean isPrm(long n){
        for (long i = 2; i*i<=n; i++)
            if(n % i == 0) return false;
        return n > 1;
    }*/
}
