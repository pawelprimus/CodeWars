package primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Array diff
// 6 kyu
// https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
// 2021-05-10 T:18:13:01
class Exercise_117 {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        List<Integer> aArrayList = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = false;
                }
            }
            if (flag) {
                aArrayList.add(a[i]);
            }
            flag = true;
        }

        int[] result = new int[aArrayList.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = aArrayList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayDiff(new int[]{1, 2, 2}, new int[]{2}));

    }
}
