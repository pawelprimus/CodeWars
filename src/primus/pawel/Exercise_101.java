package primus.pawel;

import java.util.HashMap;

// Alphabet war
// 7 kyu
// https://www.codewars.com/kata/59377c53e66267c8f6000027
// 2021-04-30 T:15:58:08
class Exercise_101 {
    public static String alphabetWar(String fight) {
        HashMap<Character, Integer> leftCharPowerMap = new HashMap<>();
        HashMap<Character, Integer> rightCharPowerMap = new HashMap<>();

        leftCharPowerMap.put('w', 4);
        leftCharPowerMap.put('p', 3);
        leftCharPowerMap.put('b', 2);
        leftCharPowerMap.put('s', 1);
        rightCharPowerMap.put('m', 4);
        rightCharPowerMap.put('q', 3);
        rightCharPowerMap.put('d', 2);
        rightCharPowerMap.put('z', 1);

        int leftSide = 0;
        int rightSide = 0;
        for (int i = 0; i < fight.length(); i++) {
            Character currentChar = fight.charAt(i);
            if (leftCharPowerMap.containsKey(currentChar)) leftSide += leftCharPowerMap.get(currentChar);
            if (rightCharPowerMap.containsKey(currentChar)) rightSide += rightCharPowerMap.get(currentChar);
        }
        if (rightSide > leftSide) return "Right side wins!";
        if (rightSide < leftSide) return "Left side wins!";
        return "Let's fight again!";
    }

    public static void main(String[] args) {

        alphabetWar("wpbsmqdz");
    }
}
