package primus.pawel;
// Simple consecutive pairs
// 7kyu
// https://www.codewars.com/kata/5a3e1319b6486ac96f000049/train/java
// 2021-10-03 T:14:47:05
class Exercise_240 {

    public static int solve(int [] arr){
        int count =0;
        for (int i = 0; i < arr.length - 2 ; i=i+2) {
            if(Math.abs(arr[i] - arr[i+1]) == 1){
                count++;
            }
        }
        if(arr.length%2 == 0){
            if(Math.abs(arr[arr.length-1] - arr[arr.length-2]) == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        solve(new int[]{21, 20, 22, 40, 39, -56, 30, -55, 95, 94});
    }

}
