package primus.pawel;

// Fold an array
// 7kyu
// https://www.codewars.com/kata/57ea70aa5500adfe8a000110/train/java
// 2021-04-26 T:23:41:49
class Exercise_099 {
    public static int[] foldArray(int[] array, int runs) {
        int[] newArr = foldOneTime(array);
        for (int i = 0; i < runs - 1; i++) {
            newArr = foldOneTime(newArr);
        }
        return newArr;
    }

    public static int[] foldOneTime(int[] array) {
        int[] resultArray = new int[array.length / 2 + (array.length % 2)];
        for (int i = 0; i < array.length / 2; i++) {
            resultArray[i] = (array[i] + array[array.length - 1 - i]);
        }
        if (array.length % 2 != 0) resultArray[array.length / 2] = array[array.length / 2];
        return resultArray;
    }

    public static void main(String[] args) {
        //int[] input = new int[]{15};
        int[] input = new int[]{1, 2, 3, 4, 5};
        //input = new int[]{-9, 9, -8, 9, 66, 23};
        foldArray(input, 3);
    }
}
