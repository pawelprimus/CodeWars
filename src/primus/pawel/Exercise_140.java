package primus.pawel;

// Count the divisible numbers
// 6kyu
// https://www.codewars.com/kata/55a5c82cd8e9baa49000004c/train/java
//  2021-05-29 T:00:15:22
class Exercise_140 {

    public static long divisibleCount(long x, long y, long k) {
        if(x%k ==0) return (y/k - x/k + 1);
        else return (y/k - x/k);
    }



}
