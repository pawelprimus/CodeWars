package primus.pawel;

import java.util.Arrays;

//  The highest profit wins!
// 7kyu
// https://www.codewars.com/kata/559590633066759614000063/train/java
// 2021-04-20 T:23:24:11
class Exercise_086 {

    public static int[] minMax(int[] arr) {

        int min =  Arrays.stream(arr).min().getAsInt();
        int max =  Arrays.stream(arr).min().getAsInt();

        return new int[]{min,max};

    }

}
