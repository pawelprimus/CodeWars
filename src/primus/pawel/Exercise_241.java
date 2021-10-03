package primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Array element parity
// 7kyu
// https://www.codewars.com/kata/5a092d9e46d843b9db000064/train/java
// 2021-10-03 T:15:32:06
class Exercise_241 {

    public static int solve(int [] arr){
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        
        if(positive.size() > negative.size()){
            for (int i = 0; i < positive.size(); i++) {

                if(!negative.contains(positive.get(i) * -1 )){
                    return positive.get(i);
                }

            }
        } else {
            for (int i = 0; i < negative.size(); i++) {

                if(!positive.contains(negative.get(i) * -1 )){
                    return negative.get(i);
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        
    }
}
