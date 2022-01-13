package primus.pawel;

import java.util.stream.Stream;

// The Office III - Broken Photocopier
// 7kyu
// https://www.codewars.com/kata/57ed56657b45ef922300002b/train/java
// 2022-01-13 T:19:00:18
class Exercise_340 {

    public static String broken(final String x) {
        return x.replace("0", "s").replace("1", "0").replace("s","1");
    }


}
