package primus.pawel;

// Smallest value of an array
// 7kyu
// https://www.codewars.com/kata/544a54fd18b8e06d240005c0/train/java
// 2021-07-12 T:23:48:46
class Exercise_177 {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        int smallestNum = Integer.MAX_VALUE;
        int indexOfSmallestNUm = 0;

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < smallestNum){
                smallestNum = numbers[i];
                indexOfSmallestNUm = i;
            }
        }

        return (toReturn.equals("value")) ? smallestNum : indexOfSmallestNUm;
    }

}
