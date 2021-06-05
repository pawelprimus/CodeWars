package primus.pawel;

// Numbers in strings
// 7kyu
// https://www.codewars.com/kata/59dd2c38f703c4ae5e000014/train/java
// 2021-06-05 T:23:11:06
class Exercise_146 {

    public static int solve(String s) {
        if (s.length() == 0 || s.equals(null)) {
            return 0;
        }
        int largestNumber = Integer.MIN_VALUE;
        String[] numberArray = s.toString().replaceAll("[a-z]", " ").split("\\s+");
        for (String number : numberArray) {
            if (Integer.parseInt(number) > largestNumber) {
                largestNumber = Integer.parseInt(number);
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        solve("2ti9iei7qhr5");
    }

}
