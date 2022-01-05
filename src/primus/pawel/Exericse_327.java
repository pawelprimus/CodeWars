package primus.pawel;
// Collatz Conjecture Length
// 7kyu
// https://www.codewars.com/kata/54fb963d3fe32351f2000102/train/java
// 2022-01-06 T:00:16:14
class Exericse_327 {

    public static long conjecture(long x) {
        int result = 1;
        long number = x;
        while (number != 1){
            if(number%2 == 0 ){
                number = number/2;
            } else {
                number = number*3 + 1;
            }
            result++;
        }
        return result;
    }
}
