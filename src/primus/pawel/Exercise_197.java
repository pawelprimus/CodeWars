package primus.pawel;

import java.util.Arrays;

// How many consecutive numbers are needed?
// 7kyu
// https://www.codewars.com/kata/559cc2d2b802a5c94700000c/train/java
// 2021-08-24 T:13:12:24
class Exercise_197 {

    public static int consecutive(final int[] arr) {

        if(arr.length == 0)
        {
            return 0;
        }

        int maxNumber = Arrays.stream(arr).max().getAsInt();
        int minNumber = Arrays.stream(arr).min().getAsInt();
        int result = 0;
        boolean[] occurencesArray = new boolean[maxNumber-minNumber+1];
        for (int i = 0; i < arr.length; i++) {
            occurencesArray[arr[i] - minNumber] = true;
        }

        for (int i = 0; i < occurencesArray.length; i++) {
            if(!occurencesArray[i]){
                result++;
            }
        }
        return result; // your code here
    }

    public static void main(String[] args) {
        System.out.println(consecutive(new int[]{}));
    }

}

/* public static int consecutive(final int[] arr) {
      if (arr.length == 0) return 0;
      Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0] - arr.length + 1;
    }



    */