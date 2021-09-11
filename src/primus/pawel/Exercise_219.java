package primus.pawel;

// Strongest even number in an interva
// 6kyu
// https://www.codewars.com/kata/5d16af632cf48200254a6244/train/java
// 2021-09-11 T:16:22:38
class Exercise_219 {

    public static int strongestEven(int n, int m) {
        int maxNumber = 0;

        int result = 0;
        if (m % 2 == 1)
            m = m - 1;
        for (int i = m; i >= n; i = i - 2) {

            int temp = Integer.numberOfTrailingZeros(i);
            if (temp > maxNumber) {
                maxNumber = temp;
                result = i;
            }
        }


        return result;

    }
    public static void main(String[] args) {
        System.out.println(   strongestEven(3, 10));
        System.out.println(powerOfNumber(8));
    }
}
