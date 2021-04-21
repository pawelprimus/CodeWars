package primus.pawel;

import java.util.Arrays;
import java.util.Collections;

// Bingo Card
// 6kyu
// https://www.codewars.com/kata/566d5e2e57d8fae53c00000c/train/java
// 2021-04-21 T:21:41:49
class Exercise_092 {

    public static String[] getCard() {
        Integer[] B = new Integer[15];
        Integer[] I = new Integer[15];
        Integer[] N = new Integer[15];
        Integer[] G = new Integer[15];
        Integer[] O = new Integer[15];
        String[] result = new String[24];

        for (int i = 0; i < 15; i++) {
            B[i] = i + 1;
            I[i] = i + 16;
            N[i] = i + 31;
            G[i] = i + 46;
            O[i] = i + 61;
        }
        Collections.shuffle(Arrays.asList(B));
        Collections.shuffle(Arrays.asList(I));
        Collections.shuffle(Arrays.asList(N));
        Collections.shuffle(Arrays.asList(G));
        Collections.shuffle(Arrays.asList(O));

        for (int i = 0; i < 24; i++) {
            if (i <= 4)             result[i] = "B" + B[i];
            if (i >= 5 && i <= 9)  result[i] = "I" + I[i-5];
            if (i >= 10 && i <= 13) result[i] = "N" + N[i-10];
            if (i >= 14 && i <= 18) result[i] = "G" + G[i-14];
            if (i >= 19)            result[i] = "O" + O[i-19];
        }

        System.out.println(Arrays.toString(result));

        return result;
    }

    public static void main(String[] args) {
        getCard();
    }
}

/*
public class BingoCard {
    public static String[] getCard() {
        ArrayList<String> cards = new ArrayList<>();
        Random r = new Random();

        cards.addAll(r.ints(1, 16).distinct().limit(5).mapToObj(i -> String.format("B%d", i)).collect(Collectors.toList()));
        cards.addAll(r.ints(16, 31).distinct().limit(5).mapToObj(i -> String.format("I%d", i)).collect(Collectors.toList()));
        cards.addAll(r.ints(31, 46).distinct().limit(4).mapToObj(i -> String.format("N%d", i)).collect(Collectors.toList()));
        cards.addAll(r.ints(46, 61).distinct().limit(5).mapToObj(i -> String.format("G%d", i)).collect(Collectors.toList()));
        cards.addAll(r.ints(61, 76).distinct().limit(5).mapToObj(i -> String.format("O%d", i)).collect(Collectors.toList()));

        return cards.toArray(new String[24]);
    }
}
*/