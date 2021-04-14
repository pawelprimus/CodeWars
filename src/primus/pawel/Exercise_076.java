package primus.pawel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Testing 1-2-3
// 7kyu
// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
// 2021-04-14 T:19:01:50
class Exercise_076 {

    public static List<String> number(List<String> lines) {
        List<String> resultList = new LinkedList<>();
        for (int i = 0; i < lines.size(); i++) {
            resultList.add(i+1 + ": " + lines.get(i));
        }
        return resultList;
    }

    public static void main(String[] args) {
        number(Arrays.asList("a", "b", "c"));
    }


}
