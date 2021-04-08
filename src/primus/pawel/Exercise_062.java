package primus.pawel;

import java.util.stream.IntStream;

// Is a number prime
// 6kyu
// https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
// 2021-04-08 T:21:01:53
// Time Out todo 
class Exercise_062 {

    public static boolean isPrime(int num) {
        if(num<=1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
