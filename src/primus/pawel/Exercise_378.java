package primus.pawel;

import java.math.BigInteger;

// Fibonacci
// 7kyu
// https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java
// 2022-02-20 T:15:38:10
class Exercise_378 {


    public static long fib (int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int previous = 1;
        int fib = 2;
        for (int i = 2; i < n - 1; i++) {

            fib = fib + previous;
            previous = fib-previous;
        }
        return fib;
    }


    public static void main(String[] args) {
        fib(3);
    }


}
