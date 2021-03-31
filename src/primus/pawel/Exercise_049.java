package primus.pawel;

// Sum of odd numbers
// 7kyu
// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java
// 2021-03-31 T:19:16:29
class Exercise_049 {

    public static int rowSumOddNumbers(int n) {

        int sumNumber = 1;
        int result = 0;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (i == n) result += sumNumber;
                sumNumber += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(2));
    }
}

/*public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }*/
