package primus.pawel;

// Reverse the bits in an integer
// 7kyu
// https://www.codewars.com/kata/5959ec605595565f5c00002b/train/java
// 2021-11-24 T:17:55:20
class Exercise_295 {

    public static int reverse_bits(int n) {
        StringBuilder binaryNumber = new StringBuilder(Integer.toBinaryString(n));
        return Integer.parseInt(binaryNumber.reverse().toString(), 2);
    }

    public static void main(String[] args) {
        reverse_bits(417);


    }

}
