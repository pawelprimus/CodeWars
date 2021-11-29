package primus.pawel;

import java.util.Arrays;

// Sort the Gift Code
// 7kyu
// https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3/train/java
// 2021-11-29 T:19:44:35
class Exercise_300 {

    public String sortGiftCode(String code){
        String[] array = new String[code.length()];
        for (int i = 0; i < code.length(); i++) {
            array[i] = String.valueOf(code.charAt(i));
        }

        Arrays.sort(array);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
        }

        return result.toString();
    }


}
