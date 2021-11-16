package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Count the smiley faces!
// 6kyu
// https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
// 2021-05-07 T:21:25:01
class Exercise_112 {

    public static int countSmileys(List<String> arr) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        for (String word : arr) {

            stringList = Arrays.asList(word.split("[\\s+,]+"));
            System.out.println(stringList);
            for (int i = 0; i < stringList.size(); i++) {

                if (stringList.get(i).length() == 2) {
                    if (checkTwoDigitWordIsSmileFace(stringList.get(i))) {
                        result++;
                    }
                } else {
                    if (stringList.get(i).length() == 3) {
                        if (checkThreeDigitWordIsSmileFace(stringList.get(i))) {
                            result++;
                        }
                    }
                }
            }
            //stringList.removeAll(stringList);
        }
        return result;
    }

    public static boolean checkThreeDigitWordIsSmileFace(String word) {
        if (word.charAt(0) == ':' || word.charAt(0) == ';') {
            if (word.charAt(1) == '-' || word.charAt(1) == '~') {
                return word.charAt(2) == ')' || word.charAt(2) == 'D';
            }
        }
        return false;
    }

    public static boolean checkTwoDigitWordIsSmileFace(String word) {
        if (word.charAt(0) == ':' || word.charAt(0) == ';') {
            if (word.charAt(1) == ')' || word.charAt(1) == 'D') {
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        //a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        a.add(":8P, p~)d, :p, :D, ;8x, 4d), 42D, 5-~p, 5d, 'D, :x, (xX, (-d, ;~pP, pD, oD, ;), :-X, :-D, -;), 4-)p, ;8), :P, :dD, ;), ;D, p-), 'D, (x, dp~D, 5), 8oDP, '2), :), 2;d), :~p, 5~), :-)");
        a.add("pX, 8-P, oD, pd, :p, 5), (x, 4), 8:D, 5dD, :~X, oX, p;D, ;op, ;xd, 5pp, ;d), 8), :~), :X, 8x");
        System.out.println(countSmileys(a));

    }

    /* public static int countSmileys(List<String> arr) {
    return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
  }
  */

}
