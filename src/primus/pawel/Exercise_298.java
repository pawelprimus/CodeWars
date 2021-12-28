package primus.pawel;

import java.util.function.IntUnaryOperator;

// Functional Addition
// 7kyu
// https://www.codewars.com/kata/538835ae443aae6e03000547/train/java
// 2021-12-28 T:17:47:13
class Exercise_298 {

    public static IntUnaryOperator add(int n) {
        IntUnaryOperator op = a -> a + n;
        return op;
    }

    public static void main(String[] args) {

        System.out.println(add(5).applyAsInt(5));

    }


}
