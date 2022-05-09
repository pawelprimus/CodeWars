package primus.pawel;
// Simple Fun #2: Circle of Numbers
// 7kyu
// https://www.codewars.com/kata/58841cb52a077503c4000015/train/javascript
// 2022-05-09 T:18:38:37
class Exercise_441 {

    public static int circleOfNumbers(int n, int firstNumber) {
        return firstNumber >= n /2 ? (firstNumber*2 - n)/2     : (n + firstNumber*2) / 2;
    }

    public static void main(String[] args) {

        System.out.println(circleOfNumbers(10 , 7));
    }


}
