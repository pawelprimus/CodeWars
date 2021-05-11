package primus.pawel;

// Small enough? - Beginner
// 7kyu
// https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java
// 2021-05-11 T:23:05:10
class Exercise_122 {

    public static boolean smallEnough(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                return false;
            }
        }
        return true;
    }

}
