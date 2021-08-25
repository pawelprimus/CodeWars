package primus.pawel;

import java.util.Arrays;

// Max-min arrays
// 7kyu
// https://www.codewars.com/kata/5a090c4e697598d0b9000004/train/java
// 2021-08-25 T:01:41:44
class Exercise_199 {

    public static int[] solve (int[] arr){

        int[] copyOfArr = arr;
        int[] resultArr = new int[copyOfArr.length];
        Arrays.sort(copyOfArr);

        int i =0;
        int j = copyOfArr.length - 1;
        int k = 0;

        while(i < copyOfArr.length){
            if(i%2 == 0) {
                resultArr[i] = copyOfArr[j];
                j--;
            } else {
                resultArr[i] = copyOfArr[k];
                k++;
            }
            i++;
        }
        return resultArr;
    }
}
/*  public static int[] solve (int[] arr){
        Arrays.sort(arr);
        int[] solutionArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
          solutionArray[i] = i % 2 == 0 ? arr[arr.length - i/2 - 1] : arr[i/2];
        }
        return solutionArray;
    }*/