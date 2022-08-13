package primus.pawel;

// Find the stray number
// 7kyu
// https://www.codewars.com/kata/57f609022f4d534f05000024/train/java
// 2021-10-08 T:01:21:52
class Exercise_243 {
    static int stray(int[] numbers) {

        int first = numbers[0];
        int second = numbers[1];
        int third = numbers[2];

        if(first != second){
            if(first == third){
                return second;
            } else {
                return  first;
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] != first){
                return numbers[i];
            }
        }

        return 0;
    }
}
