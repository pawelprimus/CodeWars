package primus.pawel;

import java.util.HashSet;

// Length of missing array
// 6kyu
// https://www.codewars.com/kata/57b6f5aadb5b3d0ae3000611/train/java
// 2021-07-01 T:18:52:41
class Exercise_167 {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        HashSet<Integer> lengthOfArrays = new HashSet<>();

        if (arrayOfArrays == null || arrayOfArrays.length == 0) return 0;

        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0) {
                return 0;
            } else {
                lengthOfArrays.add(arrayOfArrays[i].length);
            }
        }

        int i = lengthOfArrays.iterator().next();

        for (Integer number : lengthOfArrays) {
            if (number != i) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{1, 2}, new Object[]{4, 5, 1, 1}, new Object[]{1}, new Object[]{5, 6, 7, 8, 9}}));
    }
}
