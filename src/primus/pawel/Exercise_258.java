package primus.pawel;

// reversed array
// 7kyu
// https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
// 2021-10-24 T:20:30:43
class Exercise_258 {


    public static int[] reverse(int n){
        int[] reverseArray = new int[n];
        int j = 0;
        for (int i = n; i > 0; i--) {
            reverseArray[j] = i;
            j++;
        }

        return reverseArray;
    }


}
