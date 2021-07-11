package primus.pawel;

import java.util.Random;

// HTML dynamic color string generation
// 6kyu
// https://www.codewars.com/kata/56f1c6034d0c330e4a001059/train/java
// 2021-07-11 T:18:08:04
class Exercise_175 {
    public static String generateColor(Random r) {
        StringBuilder result = new StringBuilder("#");
        for(int i = 0 ; i < 6; i++){
            result.append(Integer.toHexString(r.nextInt(16)));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateColor(new Random()));
    }

}
