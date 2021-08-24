package primus.pawel;
// Halving SUM
// 7kyu
// https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d/train/java
// 2021-08-25 T:01:35:18
class Exercise_198 {

    public  static int halvingSum(int n) {
        int number = n;
        int sum = 0;

        while (number!=1){
            sum += number;
            number = number/2;
        }
        return sum + 1;
    }


}

/*      int halvingSum(int n) {
    return IntStream.iterate(n, x -> x != 0, x -> x / 2).sum();
  }
  */