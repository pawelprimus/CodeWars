package primus.pawel;

// Find The Parity Outlier
// 6kyu
// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
//
class Exercise_015 {

    static int find(int[] integers) {

        int checkNum = (Math.abs(integers[0] % 2)) + (Math.abs(integers[1] % 2)) + (Math.abs(integers[2] % 2));

        if (checkNum <= 1) { // looking for odd
            for (int i = 0; i < integers.length; i++) {
                if ((integers[i] % 2) != 0)
                    return integers[i];
            }
        } else { // looking for even number
            for (int i = 0; i < integers.length; i++) {
                if ((integers[i] % 2) == 0)
                    return integers[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(find(new int[]{3, -1719, 19, 11, 13, -21, -160}));

    }
}
