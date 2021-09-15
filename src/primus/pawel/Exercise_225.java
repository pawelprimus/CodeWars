package primus.pawel;

// Insert dashes
// 7kyu
// https://www.codewars.com/kata/55960bbb182094bc4800007b/train/java
// 2021-09-15 T:20:32:41
class Exercise_225 {

    public static String insertDash(int num) {
        String number = String.valueOf(num);
        StringBuilder sbResult = new StringBuilder();
        int numOne = 0;
        int numTwo = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            sbResult.append(number.charAt(i));
            numOne = number.charAt(i);
            numTwo = number.charAt(i+1);

            if (numOne % 2 == 1 && numTwo % 2 == 1) {
                sbResult.append("-");
            }
        }
        sbResult.append(number.charAt(number.length() - 1));
        return sbResult.toString();
    }

    public static void main(String[] args) {
        System.out.println(7 % 2);
    }

}
