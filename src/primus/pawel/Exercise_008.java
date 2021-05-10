package primus.pawel;

import java.util.HashMap;
import java.util.Map;
// Find the odd int
// 6kyu
// https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
//
class Exercise_008 {

    public static int findIt(int[] a) {

        int odd = 0;
        Map<Integer, Boolean> numbersMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            numbersMap.put(a[i], true);
        }

        for (int i = 0; i < a.length; i++) {
            numbersMap.put(a[i], !numbersMap.get(a[i]));
        }

        for (Map.Entry<Integer, Boolean> entry : numbersMap.entrySet()) {
            if (entry.getValue().equals(false)) {
                //System.out.println(entry.getKey());
                odd = entry.getKey();
            }
        }
        return odd;
    }

    public static void main(String[] args) {

        int[] arr = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(arr));

    }

}


/*
public class FindOdd {
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}*/
/*
public class FindOdd {
    public static int findIt(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }*/



