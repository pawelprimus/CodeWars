package primus.pawel;

import java.util.Collections;

// Lunar Mathematics: Addition
// 7kyu
// https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e/train/java
// 2021-11-26 T:18:17:33
class Exercise_297 {

    public static long add(long number1, long number2) {
        String number_1 = String.valueOf(number1);
        String number_2 = String.valueOf(number2);
        StringBuilder sbResult = new StringBuilder();
        String zeros = "";

        if(number_1.length() < number_2.length()){
            zeros = String.join("", Collections.nCopies(number_2.length() - number_1.length(), "0"));
            number_1 = zeros + number_1;
        }
        if(number_1.length() > number_2.length()){
            zeros = String.join("", Collections.nCopies(number_1.length() - number_2.length(), "0"));
            number_2 = zeros + number_2;
        }


        for (int i = 0; i < number_1.length(); i++) {
            if(number_1.charAt(i) > number_2.charAt(i)){
                sbResult.append(number_1.charAt(i));
            } else {
                sbResult.append(number_2.charAt(i));
            }
        }

        return Long.parseLong(sbResult.toString());
    }


    public static void main(String[] args) {
        add(12345678, 888);
    }
}
