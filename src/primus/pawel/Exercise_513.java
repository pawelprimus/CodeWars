package src.primus.pawel;

import java.util.Arrays;

// Hello World - Without Strings
// 7kyu
// https://www.codewars.com/kata/584c7b1e2cb5e1a727000047/train/java
// 2023-04-25 T:21:02:57
public class Exercise_513 {
    public static String helloWorld() {
        int[] chars = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        StringBuilder sb = new StringBuilder();
        for (int i : chars) {
            sb.append((char) i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }

}
