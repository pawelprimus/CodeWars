package primus.pawel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// List Filtering
// 7kyu
// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
// 2022-01-31 T:19:35:26
class Exercise_356 {

    public static List filterList(final List list) {
        return (List) list.stream()
                .filter(o -> o instanceof Integer)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        filterList(Arrays.asList(new Object[]{1,2,"a","b"}));
    }
}
