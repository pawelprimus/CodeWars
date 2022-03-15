package primus.pawel;

// Simple Fun #9: Array Packing
// 7kyu
// https://www.codewars.com/kata/588453ea56daa4af920000ca/train/java
// 2022-03-16 T:00:00:07
class Exercise_399 {
    public static long arrayPacking(int[] arr) {
        String binInt = "";
        for (int i : arr) {
            binInt = String.format("%8s", Integer.toBinaryString(i)).replaceAll(" ", "0") + binInt;
        }
        return Long.parseLong(binInt, 2);
    }

    public static void main(String[] args) {
        arrayPacking(new int[]{24, 85, 0});
    }
}
