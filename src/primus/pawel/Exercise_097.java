package primus.pawel;

// Sorted?yes?no?how
// 7kyu
// https://www.codewars.com/kata/580a4734d6df748060000045/train/java
// 2021-04-24 T:16:09:06
class Exercise_097 {
    public static String isSortedAndHow(int[] array) {

        if (array[0] < array[1]) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) return "no";
            }
            return "yes, ascending";
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) return "no";
            }
            return "yes, descending";
        }
    }
}

/* public static String isSortedAndHow(int[] array) {
        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] <= array[i+1]))
            return "yes, ascending";

        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] >= array[i+1]))
            return "yes, descending";

        return "no";
    }




    */
