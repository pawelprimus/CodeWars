package primus.pawel;

// A Rule of Divisibility by 7
// 7kyu
// https://www.codewars.com/kata/55e6f5e58f7817808e00002e/train/java
//  2021-10-12 T:20:31:29
class Exercise_249 {

    public static long[] seven(long m) {

        String number = String.valueOf(m);

        while (number.length() > 2) {

            //number = String.valueOf(Integer.valueOf(number.substring(0, number.length() - 2)) - Integer.valueOf(number.charAt(number.length() - 1)) * 2);
            System.out.println(Integer.valueOf(number.substring(0, number.length() - 1)));
            System.out.println(Integer.valueOf(number.substring(number.length() - 1)));
            number = String.valueOf(Integer.valueOf(number.substring(0, number.length() - 1)) - Integer.valueOf(number.substring(number.length() - 1))*2);
        }

        System.out.println(number);
        //System.out.println(number);
        return Integer.valueOf(number);
    }

    public static void main(String[] args) {
        seven(477557101);
    }


}
