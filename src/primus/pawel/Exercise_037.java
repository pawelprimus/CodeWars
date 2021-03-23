package primus.pawel;

import java.util.Arrays;

// Equal Sides Of An Array
// 6kyu
// https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
// 2021-03-23 T:23:54:17
class Exercise_037 {

    public static int findEvenIndex(int[] arr) {


        int left = 0;
        int right = Arrays.stream(arr).sum();
        for (int i=0; i<arr.length; i++){
            right -= arr[i];
            if (left == right) return i;
            left += arr[i];
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr =  {1, 1, 2};
        System.out.println(findEvenIndex(arr));
    }

}
