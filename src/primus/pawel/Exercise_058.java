package primus.pawel;

// SpeedCode #2 - Array Madness
// 8kyu
// https://www.codewars.com/kata/56ff6a70e1a63ccdfa0001b1
// 2021-04-06 T:21:41:59
class Exercise_058 {

    static boolean arrayMadness(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int num : a) {
            sumA += Math.pow(num, 2);
        }
        for (int num : b) {
            sumB += Math.pow(num, 3);
        }
        return sumA > sumB;
    }
}
