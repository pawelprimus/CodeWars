package src.primus.pawel;

// Delta Bits
// 7kyu
// https://www.codewars.com/kata/538948d4daea7dc4d200023f/train/java
// 2023-01-31 T:22:45:43
public class Exercise_504 {

    public static int convertBits(int a, int b) {
        String bitA = Integer.toBinaryString(a);
        bitA = "0".repeat(32 - bitA.length()) + bitA;
        String bitB = Integer.toBinaryString(b);
        bitB = "0".repeat(32 - bitB.length()) + bitB;
        int diff = 0;
        for (int i = 0; i < bitA.length(); i++) {
            if (bitA.charAt(i) != bitB.charAt(i)) diff++;
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(convertBits(127681, 127681));
    }

}
