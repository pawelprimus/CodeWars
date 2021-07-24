package primus.pawel;

import java.util.HashMap;
import java.util.Map;

// TV Remote
// 7kyu
// https://www.codewars.com/kata/5a5032f4fd56cb958e00007a/train/java
// 2021-07-24 T:22:43:00
class Exercise_187 {

    public static int tvRemote(final String word) {
        int result = 0;

        if (word.length() > 0) {
            Coordinate startCoordinate = keyboardMap().get('a');
            Coordinate firstCoordinate = keyboardMap().get(word.charAt(0));
            result += firstCoordinate.calculateManhatanDistance(startCoordinate) + 1;
        }

        for (int i = 1; i < word.length(); i++) {
            Coordinate currentCoordinate = keyboardMap().get(word.charAt(i));
            Coordinate previousCoordinate = keyboardMap().get(word.charAt(i - 1));
            result += currentCoordinate.calculateManhatanDistance(previousCoordinate) + 1;
        }
        return result;
    }


    private static Map<Character, Coordinate> keyboardMap() {

        Map<Character, Coordinate> clicksMap = new HashMap<>();
        clicksMap.put('a', new Coordinate(0, 0));
        clicksMap.put('b', new Coordinate(1, 0));
        clicksMap.put('c', new Coordinate(2, 0));
        clicksMap.put('d', new Coordinate(3, 0));
        clicksMap.put('e', new Coordinate(4, 0));
        clicksMap.put('f', new Coordinate(0, 1));
        clicksMap.put('g', new Coordinate(1, 1));
        clicksMap.put('h', new Coordinate(2, 1));
        clicksMap.put('i', new Coordinate(3, 1));
        clicksMap.put('j', new Coordinate(4, 1));
        clicksMap.put('k', new Coordinate(0, 2));
        clicksMap.put('l', new Coordinate(1, 2));
        clicksMap.put('m', new Coordinate(2, 2));
        clicksMap.put('n', new Coordinate(3, 2));
        clicksMap.put('o', new Coordinate(4, 2));
        clicksMap.put('p', new Coordinate(0, 3));
        clicksMap.put('q', new Coordinate(1, 3));
        clicksMap.put('r', new Coordinate(2, 3));
        clicksMap.put('s', new Coordinate(3, 3));
        clicksMap.put('t', new Coordinate(4, 3));
        clicksMap.put('u', new Coordinate(0, 4));
        clicksMap.put('v', new Coordinate(1, 4));
        clicksMap.put('w', new Coordinate(2, 4));
        clicksMap.put('x', new Coordinate(3, 4));
        clicksMap.put('y', new Coordinate(4, 4));
        clicksMap.put('z', new Coordinate(5, 4));
        clicksMap.put('1', new Coordinate(5, 0));
        clicksMap.put('2', new Coordinate(6, 0));
        clicksMap.put('3', new Coordinate(7, 0));
        clicksMap.put('4', new Coordinate(5, 1));
        clicksMap.put('5', new Coordinate(6, 1));
        clicksMap.put('6', new Coordinate(7, 1));
        clicksMap.put('7', new Coordinate(5, 2));
        clicksMap.put('8', new Coordinate(6, 2));
        clicksMap.put('9', new Coordinate(7, 2));
        clicksMap.put('0', new Coordinate(7, 3));
        clicksMap.put('.', new Coordinate(5, 3));
        clicksMap.put('@', new Coordinate(6, 3));
        clicksMap.put('_', new Coordinate(6, 4));
        clicksMap.put('/', new Coordinate(7, 4));
        return clicksMap;
    }

    public static class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int calculateManhatanDistance(Coordinate otherCoordinate) {
            return Math.abs(x - otherCoordinate.x) + Math.abs(y - otherCoordinate.y);
        }
    }


    public static void main(String[] args) {
        System.out.println(tvRemote("does"));
    }

}
