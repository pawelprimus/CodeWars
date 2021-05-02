package primus.pawel;

// Maximum product
// 7kyu
// https://www.codewars.com/kata/5a4138acf28b82aa43000117/train/java
// 2021-05-02 T:20:01:13
class Exercise_103 {

    public int adjacentElementsProduct(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] * array[i - 1] > max) max = array[i] * array[i - 1];
        }
        return max;
    }
}
