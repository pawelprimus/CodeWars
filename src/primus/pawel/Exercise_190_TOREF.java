package primus.pawel;

import java.util.HashMap;
import java.util.Map;

// VIN Checker
// 6kyu
// https://www.codewars.com/kata/60a54750138eac0031eb98e1/train/java
// 2021-07-28 T:20:51:30
class Exercise_190_TOREF {

    public static boolean checkVin(String vin) {
        // First Validation
        if (vin.length() != 17) {
            return false;
        }


        char currentChar;
        int[] decodedTable = new int[17];
        int[] weightsTable = new int[]{
                8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2
        };
        int productSum = 0;

        for (int i = 0; i < vin.length(); i++) {
            currentChar = vin.charAt(i);
            if (currentChar == 'O' || currentChar == 'I' || currentChar == 'Q' || Character.isLowerCase(currentChar)) {
                return false;
            }
            if (Character.isDigit(currentChar)) {

                decodedTable[i] = Character.getNumericValue(currentChar);
            } else {
                if (i >= 12) {
                    return false;
                }
                decodedTable[i] = decodeLetterToWeight(currentChar);
            }

            //System.out.println(currentChar + " VALUE " + decodedTable[i] + " * Weights " + weightsTable[i] +" = " + decodedTable[i]*weightsTable[i] );

            productSum += decodedTable[i] * weightsTable[i];

        }

        int moduloValue = productSum % 11;
        //System.out.println("Modulo Value = " + moduloValue);
        //System.out.println("9th char value" + decodedTable[8]);
        if (moduloValue != 10) {
            if (vin.charAt(8) == 'X') {
                return false;
            }
            return moduloValue == decodedTable[8];
        } else {
            return vin.charAt(8) == 'X';
        }

    }


    public static int decodeLetterToWeight(char letter) {
        return weightsMap().get(letter);
    }

    private static Map<Character, Integer> weightsMap() {

        Map<Character, Integer> weightsMap = new HashMap<>();
        weightsMap.put('A', 1);
        weightsMap.put('B', 2);
        weightsMap.put('C', 3);
        weightsMap.put('D', 4);
        weightsMap.put('E', 5);
        weightsMap.put('F', 6);
        weightsMap.put('G', 7);
        weightsMap.put('H', 8);
        weightsMap.put('I', null);
        weightsMap.put('J', 1);
        weightsMap.put('K', 2);
        weightsMap.put('L', 3);
        weightsMap.put('M', 4);
        weightsMap.put('N', 5);
        weightsMap.put('O', null);
        weightsMap.put('P', 7);
        weightsMap.put('Q', null);
        weightsMap.put('R', 9);
        weightsMap.put('S', 2);
        weightsMap.put('T', 3);
        weightsMap.put('U', 4);
        weightsMap.put('V', 5);
        weightsMap.put('W', 6);
        weightsMap.put('X', 7);
        weightsMap.put('Y', 8);
        weightsMap.put('Z', 9);

        return weightsMap;
    }

    public static void main(String[] args) {
        System.out.println(checkVin("ACXWJVELVRTVWYRBY"));
    }

}
