package primus.pawel;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

// Upside down numbers
// 6kyu
// https://www.codewars.com/kata/59f7597716049833200001eb/train/java
// 2022-02-21 T:18:36:52
public class Exercise_379_todo {

    private static HashMap<Character, Character> oppositeMap = new HashMap<>();

    static void fillMap() {
        oppositeMap.put('1', '1');
        oppositeMap.put('8', '8');
        oppositeMap.put('0', '0');
        oppositeMap.put('6', '9');
        oppositeMap.put('9', '6');
    }


    public static int solve(int x, int y) {
        fillMap();
        int result = 0;
        for (int i = x; i <= y; i++) {

            if (isNumberRotatable(String.valueOf(i))){
                result++;
            }

        }
        return result;
        //return (int) IntStream.range(x, y).filter(i -> isNumberRotatable(String.valueOf(i))).count();
    }

    static boolean isNumberRotatable(String number) {
        if (number.length() == 1) {
            return number.equals("0") || number.equals("1") || number.equals("8");
        }

        final int NUMBER_LENGTH = number.length();

        if (number.charAt(NUMBER_LENGTH - 1) == '0') {
            return false;
        }

        String rotatedNumber = new StringBuilder(number).reverse().toString();

        int endIndex = NUMBER_LENGTH;

        char numberChar;
        char rotatedNumberChar;


        if (NUMBER_LENGTH % 2 == 0) {

            for (int i = 0; i < NUMBER_LENGTH; i++) {
                numberChar = number.charAt(i);
                rotatedNumberChar = rotatedNumber.charAt(endIndex - 1);
                endIndex--;

                if (!oppositeMap.containsKey(rotatedNumberChar)) {
                    return false;
                } else {
                    if (numberChar == oppositeMap.get(rotatedNumberChar)) {
                    } else {
                        return false;
                    }
                }

            }

        } else {

            for (int i = 0; i < (NUMBER_LENGTH / 2) + 1; i++) {
                numberChar = number.charAt(i);
                rotatedNumberChar = rotatedNumber.charAt(endIndex - 1);
                endIndex--;

                if (!oppositeMap.containsKey(rotatedNumberChar) || !oppositeMap.containsKey(numberChar)) {
                    return false;
                } else {
                    if (numberChar == oppositeMap.get(rotatedNumberChar)) {
                    } else {
                        return false;
                    }
                }

            }

        }

        System.out.println(number + " | " + rotatedNumber);
        return true;
    }


    @Test
    public void basicTests() {
        assertEquals(10, Exercise_379_todo.solve(101, 103));
        //assertEquals(3, Exercise_379.solve(0, 10));
        //assertEquals(4, Exercise_379.solve(10, 100));
        // assertEquals(12, Exercise_379.solve(100, 1000));
        //  assertEquals(20, Exercise_379.solve(1000, 10000));
//        assertEquals(6, Exercise_379.solve(10000, 15000));
//        assertEquals(9, Exercise_379.solve(15000, 20000));
//        assertEquals(15, Exercise_379.solve(60000, 70000));
//        assertEquals(55, Exercise_379.solve(60000, 130000));
    }
}
