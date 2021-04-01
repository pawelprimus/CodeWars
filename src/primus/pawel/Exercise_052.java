package primus.pawel;
// Maximum subarray sum
// 5kyu
// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
// 2021-04-01 T:22:30:04
class Exercise_052 {

    public static int sequence(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum+=arr[j];
                if(currentSum>maxSum){
                    maxSum = currentSum;
                }
            }
            currentSum = 0;
        }
        return maxSum;
    }

}
