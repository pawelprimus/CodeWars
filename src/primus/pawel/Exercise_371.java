package primus.pawel;

// Double Every Other
// 7kyu
// https://www.codewars.com/kata/5809c661f15835266900010a/train/java
// 2022-02-15 T:21:07:12
public class Exercise_371 {

    public static int[] doubleEveryOther(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                result[i] = a[i];
            } else {
                result[i] = a[i] * 2;
            }
        }
        return result;
    }


}
