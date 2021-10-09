package primus.pawel;

// Maximum Multiple
// 7kyu
// https://www.codewars.com/kata/5aba780a6a176b029800041c/train/java
// 2021-10-09 T:12:50:59
class Exercise_244 {

    public static int maxMultiple(int divisor, int bound) {
        return bound - bound%divisor;
    }
}
