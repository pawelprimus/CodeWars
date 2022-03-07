package primus.pawel;

// Regexp Basics - is it a eight bit unsigned number?
// 7kyu
// https://www.codewars.com/kata/567e8f7b4096f2b4b1000005/train/java
// 2022-03-05 T:23:31:45
class Exercise_391_todo {

    public static boolean eightBitNumber(String n) {
        System.out.println(n);
        if (n == null || n.length() == 0) {
            return false;
        }

        Integer num = Integer.valueOf(n);
        if (num < 0 || (num == 0 & n.length() > 1)) {
            return false;
        }

        try {

            String bitNum = String.valueOf(Integer.valueOf(n, 2));
            if (bitNum.length() > 8) {
                return false;
            }

        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        eightBitNumber("00");
        eightBitNumber("055");
    }
}
