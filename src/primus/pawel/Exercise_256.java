package primus.pawel;

// Strong Number
// 7kyu
// https://www.codewars.com/kata/5a4d303f880385399b000001/train/java
// 2021-10-19 T:22:48:03
class Exercise_256 {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    public static String isStrongNumber(int num) {
        String stringNumber = String.valueOf(num);
        int sumOfNumberFactorials = 0;
        int loopNum = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            loopNum = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));

            sumOfNumberFactorials += factorial(loopNum);
        }
        return String.valueOf(sumOfNumberFactorials).equals(stringNumber) ? STRONG : NOT_STRONG;
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 0;
        }
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


}
