package primus.pawel;

import java.util.Arrays;
import java.util.stream.Collectors;

// Help the Fruit Guy
// 7kyu
// https://www.codewars.com/kata/557af4c6169ac832300000ba/train/java
// 2022-04-13 T:19:47:50
class Exercise_419 {

    public static String[] removeRotten(String[] fruitBasket) {
        return fruitBasket == null ?
                new String[0] :
                Arrays.stream(fruitBasket)
                        .map(i -> i.replaceAll("rotten", "").toLowerCase())
                        .collect(Collectors.toList())
                        .toArray(new String[fruitBasket.length]);
    }
}
