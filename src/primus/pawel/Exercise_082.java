package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ones and zeros
// 7kyu
// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
// 2021-04-19 T:01:54:12
class Exercise_082 {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int binaryRep = 1;
        for (int i = binary.size() - 1; i >= 0; i--) {
            result = result + binary.get(i) * binaryRep;
            binaryRep = binaryRep * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        List arrList = new ArrayList<>(Arrays.asList(0, 0, 0, 1));
        ConvertBinaryArrayToInt(arrList);
    }
}

/*public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }
    */
