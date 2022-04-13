package primus.pawel;

import java.util.stream.Collectors;

// Spacify
// 7kyu
// https://www.codewars.com/kata/57f8ee485cae443c4d000127/train/java
// 2022-04-13 T:19:41:07
class Exercise_423 {

    public static String spacify(String str) {
        return str.chars().mapToObj(i -> Character.toString(i) + " ").collect(Collectors.joining()).trim();
    }

}
