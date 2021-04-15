package primus.pawel;

import java.util.Arrays;
import java.util.Comparator;

// Maximum Length Difference
// 7kyu
// https://www.codewars.com/kata/5663f5305102699bad000056/train/java
// 2021-04-15 T:19:52:03
class Exercises_078 {

    public static int mxdiflg(String[] a1, String[] a2) {

        if (a1.length == 0 || a2.length == 0) return -1;

        int a1Max = Arrays.stream(a1).max(Comparator.comparing(String::length)).get().length();
        int a1Min = Arrays.stream(a1).min(Comparator.comparing(String::length)).get().length();

        int a2Max = Arrays.stream(a2).max(Comparator.comparing(String::length)).get().length();
        int a2Min = Arrays.stream(a2).min(Comparator.comparing(String::length)).get().length();

        return (Math.abs(a1Max - a2Min) >= Math.abs(a1Min - a2Max)) ? Math.abs(a1Max - a1Min) : Math.abs(a1Min - a2Max);
    }

    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        mxdiflg(s1, s2);
    }


}

/*    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length==0||a2.length==0)
            return -1;

        int b1=0, b2=0;
        int l1=Integer.MAX_VALUE, l2=Integer.MAX_VALUE;

        for (String s : a1) {
            b1 = Math.max(b1, s.length());
            l1 = Math.min(l1, s.length());
        }
        for (String s : a2) {
            b2 = Math.max(b2, s.length());
            l2 = Math.min(l2, s.length());
        }

        return Math.max(Math.abs(b2-l1), Math.abs(b1-l2));
    }*/