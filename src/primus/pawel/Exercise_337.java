package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 16+18=214
// 7kyu
// https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java
// 2022-01-10 T:21:39:33
class Exercise_337 {
    public static int add(int num1, int num2) {
        StringBuilder result = new StringBuilder();
        List<Integer> integers = new ArrayList<>();
        String num_one = String.valueOf(num1);
        String num_two = String.valueOf(num2);
        int index;
        int indexOne = num_one.length() - 1;
        int indexTwo = num_two.length() - 1;

        if (num_one.length() > num_two.length()) {
            index = num_one.length();
        } else {
            index = num_two.length();
        }

        int num = 0;
        while (index > 0) {
            if (indexOne >= 0) {
                num += Integer.parseInt(String.valueOf(num_one.charAt(indexOne)));
                indexOne--;
            }
            if (indexTwo >= 0) {
                num += Integer.parseInt(String.valueOf(num_two.charAt(indexTwo)));
                indexTwo--;
            }
            integers.add(num);
            num = 0;
            index--;
        }

        Collections.reverse(integers);
        integers.forEach(result::append);

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {

        System.out.println(add(248, 208));
    }

}
