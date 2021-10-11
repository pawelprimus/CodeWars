package primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!
// 6kyu
// https://www.codewars.com/kata/5626b561280a42ecc50000d1/train/java
// 2021-10-11 T:19:30:41
class Exercise_248 {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> resultList = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            if(eureka(i)){
                resultList.add(i);
            }
        }

    return resultList;
    }

    public static boolean eureka(long number){
        String stringNumber = String.valueOf(number);
        long result = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            result += Math.pow(Long.parseLong(String.valueOf(stringNumber.charAt(i))), i+1);
        }
        return result == number;
    }

    public static void main(String[] args) {
        sumDigPow(1, 100);
    }


}
