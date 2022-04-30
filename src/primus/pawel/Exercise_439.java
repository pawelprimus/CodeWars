package primus.pawel;

import java.util.stream.Collector;
import java.util.stream.Collectors;

// ToLeetSpeak
// 7kyu
// https://www.codewars.com/kata/57c1ab3949324c321600013f
// 2022-04-30 T:11:03:29
class Exercise_439 {

    static String toLeetSpeak(final String speak) {
        return speak.chars().map(i -> translate((char) i)).mapToObj(i -> (char) i).collect(Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString));
    }

    public static char translate(char charToTranslate) {
        System.out.println(charToTranslate);
        switch (charToTranslate) {
            case 'A':
                return '@';
            case 'B':
                return '8';
            case 'C':
                return '(';
            case 'D':
                return 'D';
            case 'E':
                return '3';
            case 'F':
                return 'F';
            case 'G':
                return '6';
            case 'H':
                return '#';
            case 'I':
                return '!';
            case 'J':
                return 'J';
            case 'K':
                return 'K';
            case 'L':
                return '1';
            case 'M':
                return 'M';
            case 'N':
                return 'N';
            case 'O':
                return '0';
            case 'P':
                return 'P';
            case 'Q':
                return 'Q';
            case 'R':
                return 'R';
            case 'S':
                return '$';
            case 'T':
                return '7';
            case 'U':
                return 'U';
            case 'V':
                return 'V';
            case 'W':
                return 'W';
            case 'X':
                return 'X';
            case 'Y':
                return 'Y';
            case 'Z':
                return '2';
            default:
                return charToTranslate;
        }
    }
}
