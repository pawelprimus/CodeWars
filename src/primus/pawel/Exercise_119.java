package primus.pawel;

import java.util.Arrays;

//Bumps in the road
// 7kyu
// https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java
// 2021-05-10 T:20:41:44
class Exercise_119 {
    public static String bumps(final String road) {
        return (road.chars().filter(x -> x=='n').count() > 15) ? "Car Dead"  :  "Woohoo!";
    }

    public static void main(String[] args) {
        bumps("nnnnnnnnnnnnnnnnnnnnn");
    }
}
