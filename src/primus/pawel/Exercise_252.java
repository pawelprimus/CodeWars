package primus.pawel;

// A Rule of Divisibility by 13
// 6kyu
// https://www.codewars.com/kata/564057bc348c7200bd0000ff/train/java
// 2021-10-15 T:21:36:49
class Exercise_252 {

    public static long thirt(long n) {
        long[] dividors = new long[]{1, 10, 9 , 12 , 3 , 4};
        StringBuilder stringNumber = new StringBuilder(String.valueOf(n)).reverse();
        long number = 0;
        long sum = 0;
        while (stringNumber.length() > 2) {
            for (int i = 0; i <  stringNumber.length(); i++) {
                number = Long.parseLong(String.valueOf(stringNumber.charAt(i)));
                sum += number * dividors[i % 6];
            }
//            System.out.println("SUM " + sum);
            stringNumber = new StringBuilder(String.valueOf(sum)).reverse();
            sum = 0;
        }

        return Long.parseLong(stringNumber.reverse().toString());
    }

    public static void main(String[] args) {

        thirt(1234567);

    }
}
