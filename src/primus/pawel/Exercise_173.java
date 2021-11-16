package primus.pawel;

import java.util.HashMap;

// Multi-tap Keypad Text Entry on an Old Mobile Phone
// 6kyu
// https://www.codewars.com/kata/54a2e93b22d236498400134b/train/java
// 2021-07-08 T:19:27:11
class Exercise_173 {

    public static int presses(String phrase) {

        int result = 0;
        char charInLoop = ' ';
        String phraseLowerCase = phrase.toLowerCase();
        for (int i = 0; i < phraseLowerCase.length(); i++) {
            charInLoop = phraseLowerCase.charAt(i);
            result += charToNumberOfPresses(charInLoop);
        }

        return result;
    }

    public static int charToNumberOfPresses(char charFromPhonePhrase) {


        HashMap<Character, Integer> mapOfPresses = new HashMap<>();
        mapOfPresses.put('a', 1);
        mapOfPresses.put('b', 2);
        mapOfPresses.put('c', 3);
        mapOfPresses.put('d', 1);
        mapOfPresses.put('e', 2);
        mapOfPresses.put('f', 3);
        mapOfPresses.put('g', 1);
        mapOfPresses.put('h', 2);
        mapOfPresses.put('i', 3);
        mapOfPresses.put('j', 1);
        mapOfPresses.put('k', 2);
        mapOfPresses.put('l', 3);
        mapOfPresses.put('m', 1);
        mapOfPresses.put('n', 2);
        mapOfPresses.put('o', 3);
        mapOfPresses.put('p', 1);
        mapOfPresses.put('q', 2);
        mapOfPresses.put('r', 3);
        mapOfPresses.put('s', 4);
        mapOfPresses.put('t', 1);
        mapOfPresses.put('u', 2);
        mapOfPresses.put('v', 3);
        mapOfPresses.put('w', 1);
        mapOfPresses.put('x', 2);
        mapOfPresses.put('y', 3);
        mapOfPresses.put('z', 4);
        mapOfPresses.put(' ', 1);
        mapOfPresses.put('*', 1);
        mapOfPresses.put('#', 1);
        mapOfPresses.put('1', 1);
        mapOfPresses.put('2', 4);
        mapOfPresses.put('3', 4);
        mapOfPresses.put('4', 4);
        mapOfPresses.put('5', 4);
        mapOfPresses.put('6', 4);
        mapOfPresses.put('7', 5);
        mapOfPresses.put('8', 4);
        mapOfPresses.put('9', 5);
        mapOfPresses.put('0', 2);

        return mapOfPresses.getOrDefault(charFromPhonePhrase, 0);
    }

    public static void main(String[] args) {
        presses("HOW R U");
    }

}
