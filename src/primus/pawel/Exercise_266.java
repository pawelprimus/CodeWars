package primus.pawel;
// Product Array (Array Series #5)
// 6kyu
// https://www.codewars.com/kata/5a905c2157c562994900009d/train/java
// 2021-10-31 T:12:07:44
class Exercise_266 {
    public static long[] productArray(int[] numbers)
    {
        long productOfAll = 1;
        for (int i = 0; i < numbers.length; i++) {
            productOfAll *= numbers[i];
        }

        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = productOfAll/numbers[i];
        }
        return result; // Do your magic!
    }

    public static void main(String[] args) {

        productArray(new int[]{10,3,5,6,2});
    }
}
