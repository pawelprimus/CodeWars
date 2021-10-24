package primus.pawel;

// Balanced Number
// 7kyu
// https://www.codewars.com/kata/5a4e3782880385ba68000018/train/java
// 2021-10-24 T:20:04:19
class Exercise_257 {

    private static final String BALANCED = "Balanced";
    private static final String NOT_BALANCED = "Not Balanced";

    public static String balancedNum(long number) {
        String stringNumber = String.valueOf(number);
        System.out.println(number);
        int leftSum = 0;
        int rightSum = 0;

        if (stringNumber.length() <= 2) {
            return BALANCED;
        }
        if (stringNumber.length() == 3) {
            return stringNumber.charAt(0) == stringNumber.charAt(2) ? BALANCED : NOT_BALANCED;
        }

        int middle = (stringNumber.length() / 2);

        for (int i = 0; i < middle -1 ; i++) {
            leftSum += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }

        for (int i = middle + 1; i < stringNumber.length(); i++) {
            rightSum += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }

        return leftSum==rightSum ? BALANCED : NOT_BALANCED;
    }

    public static void main(String[] args) {
        System.out.println( balancedNum(959));
    }

}
