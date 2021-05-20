package primus.pawel;
// Are they the "same"?
// 6kyu
// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
// 2021-03-29 T:23:36:01

import java.util.Arrays;

class Exercise_044 {


    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) return false;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(a[i], 2);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

/*    public static boolean comp(int[] a, int[] b) {


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        return true;
    }*/

    public static void main(String[] args) {

        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b));

    }

}
