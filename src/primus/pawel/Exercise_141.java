package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;

// Is this a triangle?
// 7kyu
// https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
// 2021-05-29 T:00:41:30
class Exercise_141 {

    public static boolean isTriangle(int a, int b, int c) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a);
        al.add(b);
        al.add(c);
        Collections.sort(al);
        return (al.get(2) < al.get(1) + al.get(0));
    }
}
/*public static boolean isTriangle(int a, int b, int c){
    return a + b > c && a + c > b && c + b > a;
  }*/