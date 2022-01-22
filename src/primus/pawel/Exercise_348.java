package primus.pawel;

// Single digit
// 7kyu
// https://www.codewars.com/kata/5a7778790136a132a00000c1/train/java
// 2022-01-22 T:11:56:31
class Exercise_348 {

    static int singleDigit(int n) {
        while (n > 10) {
            //String bin = Integer.toBinaryString(n);
            //n = (int) bin.chars().filter(ch -> ch == '1').count();
            n = Integer.bitCount(n);
        }
        return n;
    }

    public static void main(String[] args) {
        singleDigit(999);
    }

}
