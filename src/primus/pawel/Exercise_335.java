package primus.pawel;
// CompoundArray
// 7kyu
// https://www.codewars.com/kata/56044de2aa75e28875000017/train/java
// 2022-01-09 T:18:56:56
class Exercise_335 {

    public static int[] compoundArray(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int resultIndex = 0;
        for (int i = 0; i < b.length + a.length; i++) {

            if (i < a.length) {
                result[resultIndex] = a[i];
                resultIndex++;
            }
            if (i < b.length) {
                result[resultIndex] = b[i];
                resultIndex++;

            }
        }
        return result;
    }
}
