package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;

// Strange mathematics
// 7kyu
// https://www.codewars.com/kata/604517d65b464d000d51381f/train/java
// 2021-11-08 T:20:27:22
class Exercise_277 {

    public static int mathematics(int n, int k) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arrayList.add(String.valueOf(i));
        }

        Collections.sort(arrayList);

        return arrayList.indexOf(String.valueOf(k)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(mathematics(11, 2));
    }
}
